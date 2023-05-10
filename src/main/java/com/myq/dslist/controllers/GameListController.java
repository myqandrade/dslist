package com.myq.dslist.controllers;

import com.myq.dslist.dto.GameListDTO;
import com.myq.dslist.dto.GameMinDTO;
import com.myq.dslist.services.GameListService;
import com.myq.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;

    @GetMapping
    @ResponseStatus(OK)
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(OK)
    public GameListDTO findById(@PathVariable Long id){
        return gameListService.findById(id);
    }

    @GetMapping("/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        return gameService.findByList(listId);
    }
}
