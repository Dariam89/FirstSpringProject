package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyComfing {
    @Bean
    MyBeen myBeen(){
        return  new MyBeen();
    }
    @Bean
    MyBeen2 myBeen2(){
        return  new MyBeen2();
    }


}
