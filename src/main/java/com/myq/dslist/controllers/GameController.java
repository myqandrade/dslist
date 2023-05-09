package com.myq.dslist.controllers;

import com.myq.dslist.dto.GameMinDTO;
import com.myq.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> getAll(){
        return gameService.getAll();
    }

    @GetMapping("/{id}")
    public GameMinDTO getById(@PathVariable Long id){
        return gameService.getById(id);
    }
}
