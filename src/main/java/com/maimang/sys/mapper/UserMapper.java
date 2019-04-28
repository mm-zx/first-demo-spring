package com.maimang.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.maimang.sys.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface UserMapper extends BaseMapper<User> {
    @Select("SELECT user_name FROM sys_user")
    List<String> selectNames();
}
