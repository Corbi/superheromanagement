package com.corbi.superheromanagement.service;

import com.corbi.superheromanagement.model.Superhero;
import org.springframework.stereotype.Service;

@Service
public interface ISuperheroManagementService {

    Superhero getSuperheroById(int id);

}
