package com.bolsadeideas.springboot.errors.app.errors;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String id) {
        super("User with ID: ".concat(id).concat(" not found in our systems"));
    }
}
