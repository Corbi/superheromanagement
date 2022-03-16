package com.corbi.superheromanagement.dao;

import com.corbi.superheromanagement.model.Superhero;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface ISuperHeroDao {
    Superhero getSuperHeroById(@Param("id") int id);
}
