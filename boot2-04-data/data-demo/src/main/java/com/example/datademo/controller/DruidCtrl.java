package com.example.datademo.controller;

import com.example.datademo.domain.TestA;
//import com.example.datademo.mapper.DemoMapper;
import com.example.datademo.service.TestAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dc")
public class DruidCtrl {
  @Autowired private JdbcTemplate jdbcTemplate;

//  @Autowired private DemoMapper mapper;


  @Autowired private TestAService service;

  @PostMapping("/exe")
  public Object exe(@RequestBody String sql) {
    return jdbcTemplate.queryForList(sql);
  }

//  @GetMapping("/now")
//  public Object now() {
//    return mapper.now();
//  }
  @GetMapping("/list")
  public List<TestA> list(){
   return service.list();
  }



}
