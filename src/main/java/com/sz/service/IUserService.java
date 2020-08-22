package com.sz.service;

import com.sz.entity.User;

import java.util.List;

public interface IUserService{

    public List<User> select();


    public User selectByUser(String name);

    public int InsertUser(User user);
}
