package com.bolsadeideas.springboot.errors.app.services;

import com.bolsadeideas.springboot.errors.app.models.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class UserServiceImplTest {

    private UserServiceImpl userService;
    private Integer userFail;
    private Integer userSuccess;

    @BeforeEach
    public void init() {
        userService = new UserServiceImpl();
        userFail = 0;
        userSuccess = 1;
    }

    @Test
    public void shouldValidateAFilledListOfCountries() {
        //Give none
        //When
        List<User> users = userService.getUsersList();
        //Then
        assertNotNull(users);
    }

    @Test
    public void shouldFindCountryById() {
        //Give userSuccess
        //When
        User user = userService.findUserById(userSuccess);
        //Then
        assertNotNull(user);
    }

    @Test
    public void shouldNotFindCountryByIdAndReturnNull() {
        //Give countryFail
        //When
        User user = userService.findUserById(userFail);
        //Then
        assertNull(user);
    }
}
