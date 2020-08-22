package com.sz.service.impl;

import com.sz.entity.User;
import com.sz.entity.UserExample;
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

    @Override
    public User selectByUser(String name) {
        UserExample userExample=new UserExample();
        userExample.createCriteria()
                .andUnameEqualTo(name);
        return userMapper.selectOneByExample(userExample);
    }


    @Override
    public int InsertUser(User user) {
        return userMapper.insert(user);
    }
}
