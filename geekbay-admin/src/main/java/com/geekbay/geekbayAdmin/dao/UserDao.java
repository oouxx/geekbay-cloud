package com.geekbay.geekbayAdmin.dao;

import com.geekbay.geekbayAdmin.Entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    User getById(long id);
    List<User> getAllUser();
}
