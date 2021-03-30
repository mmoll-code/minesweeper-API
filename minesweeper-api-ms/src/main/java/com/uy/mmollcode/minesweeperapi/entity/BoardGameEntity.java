package com.uy.mmollcode.minesweeperapi.entity;

import com.uy.mmollcode.minesweeperapi.model.Cell;
import lombok.Data;

import javax.persistence.*;

/**
 * Board Game Entity
 *
 * @author MartinM
 */
@Entity
@Table(name="board_game")
@Data
public class BoardGameEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long boardId;

    @Column(name = "user_id")
    private String userId;

//    @Column(name = "board_map")
//    private Cell[][] boardMap;

    @Column(name = "rows_number")
    private int rows;

    @Column(name = "columns_number")
    private int columns;

    @Column(name = "mines_number")
    private int mines;

    @Column(name = "game_status")
    private String gameStatus;

}