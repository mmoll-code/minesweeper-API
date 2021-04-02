package com.uy.mmollcode.minesweeperapi.service;

import com.uy.mmollcode.minesweeperapi.entity.BoardGameEntity;
import com.uy.mmollcode.minesweeperapi.model.GameRequest;
import com.uy.mmollcode.minesweeperapi.repository.BoardGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MineSweeperServiceImpl {

    @Autowired
    BoardGameRepository boardGameRepository;

    public void createGame(GameRequest gameRequest) {
        BoardGameEntity bg = new BoardGameEntity();
        bg.setUserId(gameRequest.getUserId());
        bg.setRows(gameRequest.getRows());
        bg.setColumns(gameRequest.getColumns());
        bg.setMines(gameRequest.getMines());
        this.boardGameRepository.save(bg);
    }

    private void generateBoardMap(int rows, int columns, int mines) {
        // todo(martin): implement boardMap.
        // generate random number between 0<number<rows and generate random number between 0<number<columns
        // set mine in the random cell with the random coordinates generated.
        return;
    }

}
