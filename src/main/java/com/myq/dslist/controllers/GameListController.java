package com.myq.dslist.controllers;

import com.myq.dslist.dto.GameListDTO;
import com.myq.dslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

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
}
