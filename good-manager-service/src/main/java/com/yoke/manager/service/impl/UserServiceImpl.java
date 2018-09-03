package com.yoke.manager.service.impl;

import com.yoke.manager.dao.test.UserMapper;
import com.yoke.manager.pojo.User;
import com.yoke.manager.pojo.UserExample;
import com.yoke.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> getUsers() {
        return userMapper.selectByExample(new UserExample());
    }
}
