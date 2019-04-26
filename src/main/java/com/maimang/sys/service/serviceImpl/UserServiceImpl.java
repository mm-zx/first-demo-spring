package com.maimang.sys.service.serviceImpl;

import com.maimang.sys.entity.User;
import com.maimang.sys.mapper.UserRepository;
import com.maimang.sys.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

  @Resource private UserRepository userRepository;

  @Override
  public List<User> findAll() {
    return userRepository.findAll();
  }
}
