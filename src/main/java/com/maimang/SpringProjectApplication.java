package com.maimang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class SpringProjectApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringProjectApplication.class, args);
  }
}
