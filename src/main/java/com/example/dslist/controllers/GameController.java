package com.example.dslist.controllers;

import java.util.List;

import com.example.dslist.dto.GameDTO;
import com.example.dslist.dto.GameMinDTO;
import com.example.dslist.entities.Game;
import com.example.dslist.services.GameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam; 



@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id) {
        GameDTO result = gameService.findById(id);
        return result;
    }
    
    @GetMapping
    public List<GameMinDTO> findAll() {
        List<Game> result = gameService.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
    


    // Método para listar os dados da API fornecida pelo controller no formato DTO no protocolo HTTP, implementado para teste
    // @GetMapping
    // public List<GameMinDTO> findAll() {
    //     List<Game> result = gameService.findAll();
    //     List<GameMinDTO> dto = result.stream().map(GameMinDTO::new).toList(); // forma mais concisa.toList();
    //     return dto;
    // }
}
