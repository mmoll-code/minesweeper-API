package com.uy.mmollcode.minesweeperapi.controllers;

import com.uy.mmollcode.minesweeperapi.model.GameRequest;
import com.uy.mmollcode.minesweeperapi.service.MineSweeperServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;

/**
 * Mine Rest Controller
 *
 * @author MartinM
 */
@Slf4j
@RestController
@RequestMapping("/api")
public class MineRestController {

    @Autowired
    private MineSweeperServiceImpl mineSweeperService;

    @PostMapping(path = "start", consumes = "application/json")
    public ResponseEntity startGame(@Valid @RequestBody GameRequest gameRequest) {
        try {
            mineSweeperService.createGame(gameRequest);
            URI location = URI.create(String.format("/api/%s", gameRequest.getUserId()));

            return ResponseEntity.created(location).build();
        } catch (Exception ex) {
            log.error("Error on Start Game! {}", ex);
        }

        return ResponseEntity.badRequest().build();
    }

    @PostMapping(path = "flag")
    public void flagCell(int row, int column, String type) {
        //TODO(): implement.
    }

    @PostMapping(path = "reveal")
    public void revealCell(int row, int column) {
        //TODO(): implement.
    }

    @PostMapping(path = "reveal")
    public void markCell(int row, int column) {
        //TODO(): implement.
    }

    @GetMapping(path = "/resume")
    public ResponseEntity resumeGame(int row, int column) {
        //TODO(): implement resumeGame.
        return ResponseEntity.ok().build();
    }

}
