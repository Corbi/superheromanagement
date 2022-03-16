package com.corbi.superheromanagement.controller;

import com.corbi.superheromanagement.dto.SuperheroDTO;
import com.corbi.superheromanagement.model.Superhero;
import com.corbi.superheromanagement.service.ISuperheroManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManageSuperheroController {

    @Autowired
    private ISuperheroManagementService superheroManagementService;

    @GetMapping("/getSuperhero/{id}")
    public SuperheroDTO getSuperHero(@PathVariable int id){
        Superhero superhero = superheroManagementService.getSuperheroById(id);

        return superheroToDTO(superhero);
    }

    private SuperheroDTO superheroToDTO(Superhero superhero){
        SuperheroDTO superheroDTO = new SuperheroDTO();
        superheroDTO.setId(superhero.getId());
        superheroDTO.setName(superhero.getNombre());
        return superheroDTO;
    }
}
