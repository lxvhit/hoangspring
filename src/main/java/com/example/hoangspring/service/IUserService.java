package com.example.hoangspring.service;

import com.example.hoangspring.entity.User;
import com.example.hoangspring.entity.UserParam;

import java.util.List;

public interface IUserService {
    List<User> findAll();
    User create(UserParam user);
    void delete(Long id);

}
