/*
	Author: GD P
    Date: 22 Dec 2022
*/

-- DB Creation -------------------
DROP DATABASE IF EXISTS GD_FLIPKART;
CREATE DATABASE GD_FLIPKART;  # This is my main database
USE GD_FLIPKART;

-- Table Crearion
DROP TABLE IF EXISTS LOGIN;
CREATE TABLE LOGIN 
( 
	username CHAR(8),   # username CHAR(8) PRIMARY KEY column level constraint 
	password CHAR(10),
    PRIMARY KEY (username)   # table level constraint
);

