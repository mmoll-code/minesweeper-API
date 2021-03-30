package com.uy.mmollcode.minesweeperapi.controllers;

import com.uy.mmollcode.minesweeperapi.entity.BoardGameEntity;
import com.uy.mmollcode.minesweeperapi.model.GameRequest;
import com.uy.mmollcode.minesweeperapi.repository.BoardGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Mine Rest Controller
 *
 * @author MartinM
 */
@RestController
@RequestMapping("/api")
public class MineRestController {

    @Autowired
    private BoardGameRepository boardGameRepository;

    @PostMapping(path = "start", consumes = "application/json")
    public String startGame(@RequestBody GameRequest gameRequest) {
        try {
            System.out.println("start game");
            BoardGameEntity bg = new BoardGameEntity();
            bg.setUserId("john1234");
            bg.setRows(4);
            bg.setColumns(4);
            bg.setMines(2);
            this.boardGameRepository.save(bg);
        } catch (Exception ex) {
            System.out.println("error!");
        }
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
