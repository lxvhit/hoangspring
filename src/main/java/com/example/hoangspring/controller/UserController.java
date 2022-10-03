package com.example.hoangspring.controller;

import com.example.hoangspring.entity.User;
import com.example.hoangspring.entity.UserParam;
import com.example.hoangspring.service.Iplm.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> layra(){
        List<User> layradanhsach = userService.findAll();
        return layradanhsach;
    }

    @PostMapping("/create")
    public User create(@RequestBody UserParam user){
        User user1 = userService.create(user);
        return user1;
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        userService.delete(id);
    }



}
