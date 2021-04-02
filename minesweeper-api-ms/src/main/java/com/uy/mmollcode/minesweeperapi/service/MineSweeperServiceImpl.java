package com.uy.mmollcode.minesweeperapi.service;

import com.uy.mmollcode.minesweeperapi.entity.BoardGameEntity;
import com.uy.mmollcode.minesweeperapi.model.Cell;
import com.uy.mmollcode.minesweeperapi.model.GameRequest;
import com.uy.mmollcode.minesweeperapi.repository.BoardGameRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
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
        log.info("Create new game attempt for user {}. ", gameRequest.getUserId());
        bg.setBoardMap(generateBoardMap(gameRequest.getRows(), gameRequest.getColumns(), gameRequest.getMines()));

        this.boardGameRepository.save(bg);
        log.info("Create Game op success.");
    }

    private Cell[][] generateBoardMap(int rows, int columns, int mines) {
        log.info("Generate Board Map.");
        Cell[][] boardMap = initBoardMap(rows, columns);
        loadMines(boardMap, rows, columns, mines);

        return boardMap;
    }

    private int getRandomNumber(int max) {
        return (int) (Math.random() * max);
    }

    private void loadMines(Cell[][] boardMap, int rows, int columns, int mines) {
        for (int i = 0; i < mines; i++) {
            int x = getRandomNumber(rows);
            log.info("int y = getRandomNumber(rows): " + x);

            int y = getRandomNumber(columns);
            log.info("int x = getRandomNumber(rows): " + y);

            boardMap[x][y].setBomb(true);
        }
    }

    private Cell[][] initBoardMap(int rows, int columns) {
        Cell[][] boardMap = new Cell[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Cell cell = new Cell();
                boardMap[i][j] = cell;
            }
        }

        return boardMap;
    }

}
