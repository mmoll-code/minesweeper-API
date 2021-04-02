package com.uy.mmollcode.minesweeperapi.controllers;

import com.uy.mmollcode.minesweeperapi.entity.BoardGameEntity;
import com.uy.mmollcode.minesweeperapi.model.GameRequest;
import com.uy.mmollcode.minesweeperapi.repository.BoardGameRepository;
import com.uy.mmollcode.minesweeperapi.service.MineSweeperServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

/**
 * Mine Rest Controller
 *
 * @author MartinM
 */
@RestController
@RequestMapping("/api")
public class MineRestController {

    @Autowired
    private MineSweeperServiceImpl mineSweeperService;

    @PostMapping(path = "start", consumes = "application/json")
    public ResponseEntity startGame(@RequestBody GameRequest gameRequest) {
        try {
            mineSweeperService.createGame(gameRequest);
            URI location = URI.create(String.format("/api/%s", gameRequest.getUserId()));
            return ResponseEntity.created(location).build();
        } catch (Exception ex) {
            // System.out.println("error!"); todo(martin): implement logging here.
        }
        return ResponseEntity.badRequest().build();
    }

    @PostMapping(path = "flag-2")
    public void flagCell(int row, int column, String type) {
        //TODO(): implement.
    }

    @PostMapping(path = "reveal")
    public void revealCell(int row, int column) {
        //TODO(): implement.
    }

    @GetMapping(path = "user/romi")
    public String getUserRomi(int row, int column) {
        //TODO(): implement.
        return "hola Romi";
    }

    // TODO(): time-tracking.
}
