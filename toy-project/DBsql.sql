-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema gimpodb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `gimpodb` ;

-- -----------------------------------------------------
-- Schema gimpodb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `gimpodb` DEFAULT CHARACTER SET utf8 ;
USE `gimpodb` ;

-- -----------------------------------------------------
-- Table `gimpodb`.`todo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gimpodb`.`todo` (
  `todo_no` BIGINT NOT NULL AUTO_INCREMENT,
  `todo_date` DATETIME NOT NULL,
  `todo_title` VARCHAR(100) NOT NULL,
  `todo_desc` VARCHAR(20000) NULL,
  `todo_category` VARCHAR(100) NOT NULL DEFAULT '기타',
  `todo_iscomplete` TINYINT NOT NULL DEFAULT 0,
  `todo_isdel` TINYINT NOT NULL DEFAULT 0,
  PRIMARY KEY (`todo_no`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
