package com.uy.mmollcode.minesweeperapi.model;

import lombok.Data;

/**
 * Board Game
 *
 * @author MartinM
 */
@Data
public class BoardGame {
    private String boardId;

    private String userId;

    private Cell[][] boardMap;

    private int rows;

    private int columns;

    private int minesAmount;

}