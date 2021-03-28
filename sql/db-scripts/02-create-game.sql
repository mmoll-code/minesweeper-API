-- -----------------------------------------------------
-- Schema minesweeper
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `minesweeper-game`;

CREATE SCHEMA `minesweeper-game`;
USE `minesweeper-game` ;

-- -----------------------------------------------------
-- Table `minesweeper-game`.`board`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `minesweeper-game`.`board` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `is_active` BIT DEFAULT 1,
  `date_created` DATETIME(6) DEFAULT NULL,
  `last_updated` DATETIME(6) DEFAULT NULL,
  `board_grid_map` VARCHAR(2048) NOT NULL,
  PRIMARY KEY (`id`)
) 
ENGINE=InnoDB
AUTO_INCREMENT = 1;

-- -----------------------------------------------------
-- Table `minesweeper-game`.`game`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `minesweeper-game`.`game` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `rows_number` INT NULL DEFAULT NULL,
  `columns_number` INT NULL DEFAULT NULL,
  `mines_number` INT NULL DEFAULT NULL,
  `board_id` BIGINT NULL DEFAULT NULL,
  `status` VARCHAR(12) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_board` (`board_id`),
  CONSTRAINT `fk_board` FOREIGN KEY (`board_id`) REFERENCES `board` (`id`)
  )
ENGINE=InnoDB
AUTO_INCREMENT = 1;
