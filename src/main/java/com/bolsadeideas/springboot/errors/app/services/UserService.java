package com.bolsadeideas.springboot.errors.app.services;

import com.bolsadeideas.springboot.errors.app.models.domain.User;

import java.util.List;

public interface UserService {

    List<User> getUsersList();
    User findUserById(Integer id);

}
