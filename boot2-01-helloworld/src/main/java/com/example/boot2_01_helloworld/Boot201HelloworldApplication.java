package com.example.boot2_01_helloworld;

import com.example.boot2_01_helloworld.bean.Cat;
import com.example.boot2_01_helloworld.bean.Person;
import com.example.boot2_01_helloworld.im.Demo1;
import com.example.boot2_01_helloworld.im.Demo2;
import com.example.boot2_01_helloworld.im.Demo3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Boot201HelloworldApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext context =
        SpringApplication.run(Boot201HelloworldApplication.class, args);
    String[] names = context.getBeanDefinitionNames();
    for (String name : names) {
      System.out.println(name);
    }
    Person bean = context.getBean(Person.class);
    System.out.println(bean);
//
//    Cat cat = context.getBean(Cat.class);
//    System.out.println(cat);



    Demo1 demo1 = context.getBean(Demo1.class);
    System.out.println(demo1);

    Demo2 demo2 = context.getBean(Demo2.class);
    System.out.println(demo2);
    Demo3 demo3 = context.getBean(Demo3.class);

    System.out.println(demo3);
  }
}
