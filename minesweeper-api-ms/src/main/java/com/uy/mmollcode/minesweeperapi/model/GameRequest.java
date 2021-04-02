package com.uy.mmollcode.minesweeperapi.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 * Game Request.
 *
 * @author MartinM
 */
@Data
public class GameRequest {

    @NotNull
    @Size(min = 2, max = 10) // @Size(min=2, max=64)
    private String userId;

    @NotNull
    @Min(value = 1, message = "Must be equal or greater than 1")
    @Max(value = 100, message = "Must be equal or less than 100")
    private Integer rows;

    @NotNull
    @Min(value = 1, message = "Must be equal or greater than 1")
    @Max(value = 100, message = "Must be equal or less than 100")
    private Integer columns;

    @NotNull
    @Min(value = 1, message = "Must be equal or greater than 1")
    @Max(value = 100, message = "Must be equal or less than 100")
    private Integer mines;
}
