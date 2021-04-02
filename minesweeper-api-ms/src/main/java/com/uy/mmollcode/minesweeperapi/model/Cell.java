package com.uy.mmollcode.minesweeperapi.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import java.io.Serializable;

/**
 * Cell
 *
 * @author MartinM
 */
@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Cell implements Serializable {
    private int x;
    private int y;
    private actionEnum action; // enum: flag, mark, reveal
    private boolean isBomb;
    private int adjacentBombs;
}
