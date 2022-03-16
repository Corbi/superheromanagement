package com.corbi.superheromanagement.dao;

import com.corbi.superheromanagement.model.Superhero;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ISuperHeroDao {
    Superhero getSuperHeroById(@Param("id") int id);

    List<Superhero> getAll();

    List<Superhero> getAllByName(@Param("name") String name);

    void deleteSuperhero(@Param("id") int id);

    void modifySuperhero(@Param("superhero") Superhero superhero);
}
