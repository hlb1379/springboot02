package com.hlb.service;

import com.hlb.mapper.UserMapper;
import com.hlb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Fly on 2019/3/27.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getList() {

        return userMapper.getAll();
    }
}