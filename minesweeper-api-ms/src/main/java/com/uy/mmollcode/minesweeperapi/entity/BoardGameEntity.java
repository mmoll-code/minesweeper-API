package com.uy.mmollcode.minesweeperapi.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.uy.mmollcode.minesweeperapi.model.Cell;
import com.vladmihalcea.hibernate.type.json.JsonStringType;
import lombok.Data;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

/**
 * Board Game Entity
 *
 * @author MartinM
 */
@Entity
@Table(name="board_game")
@Data
@TypeDef(
        typeClass = JsonStringType.class,
        defaultForType = BoardGameEntity.class
)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class BoardGameEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long boardId;

    @Column(name = "user_id")
    private String userId;

    @Column(columnDefinition = "json_board_map")
    private Cell[][] boardMap;

    @Column(name = "rows_number")
    private int rows;

    @Column(name = "columns_number")
    private int columns;

    @Column(name = "mines_number")
    private int mines;

    @Column(name = "game_status")
    private String gameStatus;

}