package com.corbi.superheromanagement.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class SuperheroDTO implements Serializable {

    private int id;
    private String name;
    private String power;
    private String team;
    private Integer teamId;

}
