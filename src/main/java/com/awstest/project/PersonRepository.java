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

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fawadhussain
 */
@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
    
}
