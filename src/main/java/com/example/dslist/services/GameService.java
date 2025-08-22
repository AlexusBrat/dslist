package com.example.dslist.services;

import java.util.List;

import com.example.dslist.repositories.GameRepository;
import com.example.dslist.entities.Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    // Injetando uma instância do gameRepository
    @Autowired
    private GameRepository gameRepository;

    public List<Game> findAll() {
        List<Game> result = gameRepository.findAll();
        return result;
    }
}
