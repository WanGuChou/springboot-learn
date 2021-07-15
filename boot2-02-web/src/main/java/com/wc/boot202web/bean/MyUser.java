package com.wc.boot202web.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * class description<br>
 *
 * @author wangguocheng
 * @version 1.0
 * @date 2021/7/8 16:57
 * @since JDK 1.8+
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MyUser {
  private String usr;
  private String pwd;
}
