package com.example.dslist.dto;

import com.example.dslist.entities.GameList;

public class GameListDTO {

    // Atributos
    private Long id;
    private String name;

    // Construtores
    // Construtor sem argumento
    public GameListDTO() {

    }

    // Construtor com argumento
    public GameListDTO(GameList entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    // Get/Set
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
