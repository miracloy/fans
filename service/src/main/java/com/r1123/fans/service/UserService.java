package com.r1123.fans.service;

import com.r1123.fans.entity.UserEntity;

import java.util.List;

/**
 * Created by helloqdz on 2018/11/1.
 */
public interface UserService {

    List<UserEntity> find();

    UserEntity save(UserEntity userEntity);
}
