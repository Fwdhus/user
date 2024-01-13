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


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author fawadhussain
 */
@Entity
@Getter
@Setter
public class Person implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "person_id_seq")
    private Long id;

    private String username;
    private String email;
    
}
