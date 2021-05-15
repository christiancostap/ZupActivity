package com.carregister.ZupActivity.controllers;

import com.carregister.ZupActivity.models.User;
import com.carregister.ZupActivity.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    IUserService userService;

    @GetMapping("/findAll")
    public List<User> FindAll() {
        return userService.FindAll();
    }

}
