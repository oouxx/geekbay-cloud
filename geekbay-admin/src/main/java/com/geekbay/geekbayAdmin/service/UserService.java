package com.geekbay.geekbayAdmin.service;

import com.geekbay.geekbayAdmin.Entity.User;

import java.util.List;

public interface UserService {
    User getById(long id);
    List<User> getAllUser();
}
