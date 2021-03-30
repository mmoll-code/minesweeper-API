package com.uy.mmollcode.minesweeperapi.model;

import lombok.Data;

/**
 * Cell
 *
 * @author MartinM
 */
@Data
public class Cell {
    private int x;
    private int y;
    private actionEnum action; // enum: flag, mark, reveal
    private boolean isBomb;
    private int adjacentBombs;
}
