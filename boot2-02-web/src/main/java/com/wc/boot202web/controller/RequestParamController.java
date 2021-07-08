package com.wc.boot202web.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * class description<br>
 *
 * @author wangguocheng
 * @version 1.0
 * @date 2021/7/8 13:46
 * @since JDK 1.8+
 */
@RestController
public class RequestParamController {

  @RequestMapping("/req/{id}")
  public String reqId(@PathVariable String id) {
    return id;
  }
}
