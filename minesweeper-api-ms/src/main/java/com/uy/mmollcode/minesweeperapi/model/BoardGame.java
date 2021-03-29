package com.uy.mmollcode.minesweeperapi.model;

import lombok.Data;

/**
 * @author MartinM
 */
@Data
public class BoardGame {
    private String boardId;

    private Cell[][] boardMap;

    private int rows;

    private int columns;

    private int minesAmount;

}