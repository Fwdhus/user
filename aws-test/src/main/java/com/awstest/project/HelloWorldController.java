/* 
 * Copyright (c) 2023 All Right Reserved, Rako Controls ltd
 * 
 * NOTICE:  All information contained herein is, and remains
 * the property of Rako Controls ltd.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Rako Controls Ltd.
 */
package com.awstest.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fawadhussain
 */
@RestController
@RequestMapping("/api")
public class HelloWorldController {
    
    @Autowired
    private PersonRepository personRepo;
    
    @GetMapping("/hello")
    public String helloWorld(){
        return "HELLO WORLD!";
    }
    
    @PostMapping("/person")
    public Person createPerson(){
        Person person = new Person();
        person.setEmail("Sf");
        person.setUsername("fsd");
        return personRepo.save(person);
    }
}
