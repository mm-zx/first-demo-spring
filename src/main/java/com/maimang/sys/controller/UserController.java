package com.maimang.sys.controller;

import com.maimang.sys.entity.User;
import com.maimang.sys.service.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
  @Autowired private UserServiceImpl userService;

  @RequestMapping("/")
  public List<User> getUser() {
    return userService.findAll();
  }
}
