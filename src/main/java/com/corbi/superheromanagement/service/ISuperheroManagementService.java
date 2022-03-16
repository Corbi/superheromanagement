package com.corbi.superheromanagement.service;

import com.corbi.superheromanagement.model.Superhero;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ISuperheroManagementService {

    Superhero getSuperheroById(int id);

    List<Superhero> getAll();

    List<Superhero> getAllByName(String name);

    void deleteSuperhero(int id);

    void modifySuperheroById(Superhero superhero);

}
