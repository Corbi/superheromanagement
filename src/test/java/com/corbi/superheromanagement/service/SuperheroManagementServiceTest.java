package com.corbi.superheromanagement.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SuperheroManagementServiceTest {

    @Autowired
    ISuperheroManagementService superheroManagementService;

    @Test
    public void getSuperheroById() {
        superheroManagementService.getSuperheroById(1);
    }
}
