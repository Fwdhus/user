package com.App.controller;

import com.App.domain.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class UserController {

    @GetMapping("/get-all-users")
    private ResponseEntity<User> getAllUsers(){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
