package com.carregister.ZupActivity.services.servicesImpl;

import com.carregister.ZupActivity.models.User;
import com.carregister.ZupActivity.repositories.IUserRepository;
import com.carregister.ZupActivity.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    IUserRepository userRepository;

    @Override
    public List<User> FindAll(){
        return userRepository.findAll();
    }

    @Override
    public User FindById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User Save(User user) {
        return userRepository.save(user);
    }
}
