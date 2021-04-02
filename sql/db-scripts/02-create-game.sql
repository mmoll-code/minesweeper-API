-- -----------------------------------------------------
-- Schema minesweeper
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `minesweepergame`;

CREATE SCHEMA `minesweepergame`;
USE `minesweepergame` ;

-- -----------------------------------------------------
-- Table `minesweeper-game`.`game`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `minesweepergame`.`board_game` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `user_id` VARCHAR(64) NULL DEFAULT NULL,
  `rows_number` INT NULL DEFAULT NULL,
  `columns_number` INT NULL DEFAULT NULL,
  `mines_number` INT NULL DEFAULT NULL,
  `game_status` VARCHAR(12) NULL DEFAULT NULL,
  `board_map` BLOB NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_board` (`id`)
  )
ENGINE=InnoDB
AUTO_INCREMENT = 1;

commit;
