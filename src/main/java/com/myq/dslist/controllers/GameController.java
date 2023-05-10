package com.myq.dslist.controllers;

import com.myq.dslist.dto.GameDTO;
import com.myq.dslist.dto.GameMinDTO;
import com.myq.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.*;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    @ResponseStatus(OK)
    public List<GameMinDTO> findAll(){
        return gameService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(OK)
    public GameDTO findAll(@PathVariable Long id){
        return gameService.findAll(id);
    }
}
