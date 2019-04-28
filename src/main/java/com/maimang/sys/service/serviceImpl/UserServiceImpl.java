package com.maimang.sys.service.serviceImpl;

import com.maimang.sys.entity.User;
import com.maimang.sys.mapper.UserMapper;
import com.maimang.sys.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

  @Resource private UserMapper userMapper;

  @Override
  public List<User> findAll() {
    return userMapper.selectList(null);
  }

  @Override
  public List<String> getUserName(Integer id) {
    List<String> names = new ArrayList<>();
    if (id != null) {
      names.add(userMapper.selectById(id).getUserName());
    } else {
      names = userMapper.selectNames();
    }
    return names;
  }
}
