package com.uy.mmollcode.minesweeperapi.model;

import lombok.Data;

/**
 * Game Request.
 *
 * @author MartinM
 */
@Data
public class GameRequest {
    private String userId;
    private Integer rows;
    private Integer columns;
    private Integer mines;
}
