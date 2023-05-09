package com.myq.dslist.services;

import com.myq.dslist.dto.GameMinDTO;
import com.myq.dslist.entities.Game;
import com.myq.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> getAll(){
        List<Game> games = gameRepository.findAll();
        return games.stream().map(x -> new GameMinDTO(x)).toList();
    }

    public GameMinDTO getById(Long id){
        Optional<Game> game = gameRepository.findById(id);
        GameMinDTO gameMinDTO = new GameMinDTO(game.get());
        return gameMinDTO;
    }
}
