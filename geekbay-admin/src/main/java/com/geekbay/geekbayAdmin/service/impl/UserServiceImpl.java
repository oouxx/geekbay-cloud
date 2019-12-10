package com.geekbay.geekbayAdmin.service.impl;

import com.geekbay.geekbayAdmin.model.dao.User;
import com.geekbay.geekbayAdmin.model.dao.UserExample;
import com.geekbay.geekbayAdmin.model.mapper.UserMapper;
import com.geekbay.geekbayAdmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listAllUser() {
        return userMapper.selectByExample(new UserExample());
    }

    @Override
    public int createUser(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public int updateUser(Long id, User user) {
//        user.setId(id);
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int deleteUser(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public User getUser(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
