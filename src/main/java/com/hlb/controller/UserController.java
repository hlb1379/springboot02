package com.hlb.controller;

import com.hlb.pojo.User;
import com.hlb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Fly on 2019/3/27.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/userlist")
    public List<User> getAll(){
        return userService.getList();
    }
}