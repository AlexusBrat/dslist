package com.example.dslist.services;

import java.util.List;

import com.example.dslist.repositories.GameRepository;
import com.example.dslist.dto.GameDTO;
import com.example.dslist.entities.Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService {

    // Injetando uma instância do gameRepository
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get(); // Implementação futura: tratar ID que não existe
        GameDTO dto = new GameDTO(result);
        return dto;
    }

    @Transactional(readOnly = true)
    public List<Game> findAll() {
        List<Game> result = gameRepository.findAll();
        return result;
    }
}
