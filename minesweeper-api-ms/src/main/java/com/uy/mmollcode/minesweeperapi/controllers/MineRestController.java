package com.uy.mmollcode.minesweeperapi.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MartinM
 */
@RestController
@RequestMapping("/api")
public class MineRestController {

    @RequestMapping(path = "start")
    public String startGame(Integer rows, Integer columns, Integer mines) {
        System.out.println("start game");
        //TODO(): implement.
        return "hola";
    }

    @PostMapping(path = "flag")
    public void flagCell(int row, int column, String type) {
        //TODO(): implement.
    }

    @PostMapping(path = "reveal")
    public void revealCell(int row, int column) {
        //TODO(): implement.
    }

    // TODO(): time-tracking.
}
