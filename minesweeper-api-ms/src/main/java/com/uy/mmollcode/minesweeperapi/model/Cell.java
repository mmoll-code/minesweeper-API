package com.uy.mmollcode.minesweeperapi.model;

import lombok.Data;

/**
 * @author MartinM
 */
@Data
public class Cell {
    private int x;
    private int y;
    private String action; // enum: flag, mark, reveal
    private boolean isBomb;
    private int adjacentBombs;
}
