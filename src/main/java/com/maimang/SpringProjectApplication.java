package com.maimang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.maimang.sys.mapper*")
public class SpringProjectApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringProjectApplication.class, args);
  }
}
