package com.corbi.superheromanagement.service;

import com.corbi.superheromanagement.model.Superhero;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
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

        Assertions.assertNotNull(superheroManagementService.getSuperheroById(1));
    }

    @Test
    public void getAll() {

        Assertions.assertNotNull(superheroManagementService.getAll());
    }

    @Test
    public void getAllByName() {

        Assertions.assertNotNull(superheroManagementService.getAllByName("MAN"));
    }

    @Test
    public void modifySuperheroById() {

        Superhero superhero = new Superhero();
        superhero.setId(1);
        superhero.setNombre("BATMAN");
        superheroManagementService.modifySuperheroById(superhero);
    }

    @Test
    public void deleteSuperhero() {
        superheroManagementService.deleteSuperhero(1);
    }

}
