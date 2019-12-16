package com.geekbay.geekbayAdmin.service.impl;

import com.geekbay.geekbayAdmin.dao.UserDao;
import com.geekbay.geekbayAdmin.Entity.User;
import com.geekbay.geekbayAdmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public User getById(long id) {
        return userDao.getById(id);
    }
    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }
}
