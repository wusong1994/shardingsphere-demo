package com.hfocean.platform.controller;

import com.hfocean.platform.core.po.UserPo;
import com.hfocean.platform.core.util.IdWorker;
import com.hfocean.platform.mapper.UserMapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserMapper userMapper;

    @RequestMapping("/add/{age}")
    public UserPo add(@PathVariable Integer age){
        UserPo userPo = new UserPo();
        userPo.setId(IdWorker.getLongId());
        userPo.setName(userPo.getId() + "_" + age);
        userPo.setAge(age);
        userMapper.insert(userPo);
        return userPo;
    }

    @RequestMapping("/{id}")
    public UserPo findById(@PathVariable  Long id){
        return userMapper.selectByPrimaryKey(id);
    }
}
