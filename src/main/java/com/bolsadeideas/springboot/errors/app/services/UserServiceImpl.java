package com.bolsadeideas.springboot.errors.app.services;

import com.bolsadeideas.springboot.errors.app.models.domain.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private List<User> users;

    public UserServiceImpl(){
        this.users = List.of(
                new User(1,"Tony","Stark"),
                new User(2,"Steve","Rodgers"),
                new User(3,"Wanda","Maximov"),
                new User(4,"Clint","Barton"),
                new User(5,"Maria","Rambow"),
                new User(6,"Peggy","Carter"),
                new User(7,"Pepper","Potts"),
                new User(8,"Bruce","Banner"),
                new User(9,"Thor","Odinson")
        );
    }
    @Override
    public List<User> getUsersList() {
        return this.users;
    }

    @Override
    public User findUserById(Integer id) {
        Optional<User> first = users.stream()
                .filter(user -> id.equals(user.getId())).findFirst();
        return first.isPresent() ? first.get() : null;
    }
}
