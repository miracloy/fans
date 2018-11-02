package com.r1123.fans.service;

import com.r1123.fans.entity.UserEntity;
import com.r1123.fans.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by helloqdz on 2018/11/1.
 */
@Service(value = "userServiceImpl")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repository;

    @Override
    public List<UserEntity> find() {
        return repository.findAll();
    }

    @Override
    public UserEntity save(UserEntity userEntity) {
        userEntity = repository.save(userEntity);
        return userEntity;
    }


}
