package com.myq.dslist.services;

import com.myq.dslist.dto.GameDTO;
import com.myq.dslist.dto.GameMinDTO;
import com.myq.dslist.entities.Game;
import com.myq.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> games = gameRepository.findAll();
        return games.stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findAll(Long id){
        Game game = gameRepository.findById(id).get();
        return new GameDTO(game);
    }
}
