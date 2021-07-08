package com.wc.boot202web.controller;

import com.wc.boot202web.bean.MyUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * class description<br>
 *
 * @author wangguocheng
 * @version 1.0
 * @date 2021/7/6 17:00
 * @since JDK 1.8+
 */
@Controller
public class UserController {

  @GetMapping("/user")
  public String getUser() {
    return "GET-张三";
  }

  @PostMapping("/user")
  public String addUser() {
    return "POST-张三";
  }

  @PutMapping("/user")
  public String updateUser() {
    return "update-张三";
  }

  @DeleteMapping("/user")
  public String deleteUser() {
    return "delete-张三";
  }




  @PostMapping("/myUser")
  @ResponseBody
  public MyUser add( MyUser user) {
    return user;
  }



}
