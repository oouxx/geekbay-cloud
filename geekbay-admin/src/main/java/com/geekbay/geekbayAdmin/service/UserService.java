package com.geekbay.geekbayAdmin.service;

import com.geekbay.geekbayAdmin.model.dao.User;

import java.util.List;

public interface UserService {
    List<User> listAllUser();

    int createUser(User user);

    int updateUser(Long id, User user);

    int deleteUser(Long id);

    User getUser(Long id);
}

