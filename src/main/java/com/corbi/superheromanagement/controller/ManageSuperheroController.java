package com.corbi.superheromanagement.controller;

import com.corbi.superheromanagement.dto.SuperheroDTO;
import com.corbi.superheromanagement.model.Superhero;
import com.corbi.superheromanagement.model.Team;
import com.corbi.superheromanagement.service.ISuperheroManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ManageSuperheroController {

    @Autowired
    private ISuperheroManagementService superheroManagementService;

    @GetMapping("/getSuperhero/{id}")
    public SuperheroDTO getSuperHero(@PathVariable int id) {
        Superhero superhero = superheroManagementService.getSuperheroById(id);

        return superheroToDTO(superhero);
    }

    @GetMapping("/getAllSuperheros")
    public List<SuperheroDTO> getAllSuperheros() {
        List<Superhero> superheros = superheroManagementService.getAll();
        return superheroListToDTOList(superheros);
    }

    @GetMapping("/getAllSuperheros/{name}")
    public List<SuperheroDTO> getAllSuperherosByName(@PathVariable String name) {
        List<Superhero> superheros = superheroManagementService.getAllByName(name);
        return superheroListToDTOList(superheros);
    }

    @GetMapping("/deleteSuperhero/{id}")
    public void deleteSuperHero(@PathVariable int id) {
        superheroManagementService.deleteSuperhero(id);
    }

    @PostMapping(path = "/modifySuperhero", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void modifySuperHero(@RequestBody SuperheroDTO superheroDTO) {

        Superhero superhero = new Superhero();
        superhero.setId(superheroDTO.getId());
        superhero.setNombre(superheroDTO.getName());
        superhero.setPoder(superheroDTO.getPower());

        if (superheroDTO.getTeamId() != null) {
            superhero.setEquipo(new Team());
            superhero.getEquipo().setId(superheroDTO.getTeamId());
        }

        superheroManagementService.modifySuperheroById(superhero);

    }

    private SuperheroDTO superheroToDTO(Superhero superhero) {
        SuperheroDTO superheroDTO = new SuperheroDTO();
        superheroDTO.setId(superhero.getId());
        superheroDTO.setName(superhero.getNombre());
        superheroDTO.setPower(superhero.getPoder());
        superheroDTO.setTeam(superhero.getEquipo() != null ? superhero.getEquipo().getNombre() : "SIN EQUIPO");
        superheroDTO.setTeamId(superhero.getEquipo() != null ? superhero.getEquipo().getId() : null);
        return superheroDTO;
    }

    private List<SuperheroDTO> superheroListToDTOList(List<Superhero> superheros) {
        List<SuperheroDTO> superheroDTOs = new ArrayList<>();
        for (Superhero superhero : superheros) {
            superheroDTOs.add(superheroToDTO(superhero));
        }
        return superheroDTOs;
    }
}
