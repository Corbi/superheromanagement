package com.corbi.superheromanagement.service.impl;

import com.corbi.superheromanagement.dao.ISuperHeroDao;
import com.corbi.superheromanagement.model.Superhero;
import com.corbi.superheromanagement.service.ISuperheroManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuperheroManagementService implements ISuperheroManagementService {

    @Autowired
    ISuperHeroDao superHeroDao;

    public Superhero getSuperheroById(int id){

        return superHeroDao.getSuperHeroById(id);

    }
}
