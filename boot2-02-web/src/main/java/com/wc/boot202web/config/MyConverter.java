package com.wc.boot202web.config;

import com.wc.boot202web.bean.MyUser;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

/**
 * class description<br>
 *
 * @author wangguocheng
 * @version 1.0
 * @date 2021/7/13 17:38
 * @since JDK 1.8+
 */
//@Component
public class MyConverter implements HttpMessageConverter<MyUser> {

  @Override
  public boolean canWrite(Class<?> clazz, MediaType mediaType) {
    return clazz.isAssignableFrom(MyUser.class);
  }

  @Override
  public List<MediaType> getSupportedMediaTypes() {
    return MediaType.parseMediaTypes("application/ac");
  }

  @Override
  public void write(MyUser myUser, MediaType contentType, HttpOutputMessage outputMessage)
      throws IOException, HttpMessageNotWritableException {
    String data = myUser.toString();
    outputMessage.getBody().write(data.getBytes());
  }

  @Override
  public MyUser read(Class<? extends MyUser> clazz, HttpInputMessage inputMessage)
      throws IOException, HttpMessageNotReadableException {
    return null;
  }

  @Override
  public boolean canRead(Class<?> clazz, MediaType mediaType) {
    return false;
  }
}
