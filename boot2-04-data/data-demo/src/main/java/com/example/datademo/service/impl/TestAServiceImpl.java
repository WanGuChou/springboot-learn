package com.example.datademo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.datademo.domain.TestA;
import com.example.datademo.service.TestAService;
import com.example.datademo.mapper.TestAMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class TestAServiceImpl extends ServiceImpl<TestAMapper, TestA>
    implements TestAService{

}




