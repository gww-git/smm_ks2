package com.sz.service.impl;

import com.sz.entity.User;
import com.sz.mapper.UserMapper;
import com.sz.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements IUserService{

    @Autowired
   private  UserMapper userMapper;

    @Override
    public List<User> select() {
        return userMapper.selectAll();
    }
}
