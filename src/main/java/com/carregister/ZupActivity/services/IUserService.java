package com.carregister.ZupActivity.services;

import com.carregister.ZupActivity.models.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IUserService {
    List<User> FindAll();
    User FindById(Long id);
    User Save(User user);
}
