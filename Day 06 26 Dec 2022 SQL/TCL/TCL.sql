USE gd_sanjivani;
-- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> TCL <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
-- ACID Properties of Trasnaction -> Check Image
-- MySQL transaction allows you to execute a set of MySQL operations to ensure that 
-- the database never contains the result of partial operations. 
-- In a set of operations, if one of them fails, 
-- the rollback occurs to restore the database to its original state. 
-- If no error occurs, the entire set of statements is committed to the database.

-- [One Logical Unit]

-- +--------+-------+
-- | Sender Account |  
-- +--------+-------+
-- 		|
-- 		|----------->Money Diduction  |
--      |					          |
--      |				              |
--      |					          |
--      |<-----------Money Deposit    |
-- 		|
-- +---------+--------+
-- | Receiver Account |  
-- +---------+--------+

-- START TRANSACTION: It indicates that the transaction is started.
-- COMMIT: It indicates that the transaction completed successfully and all 
--         the DML performed since the start of the transaction are committed to 
--         the database as well as frees the resources held by the transaction.
-- ROLLBACK: It will roll back the data to its previous state.
-- SAVEPOINT: This is used for dividing or breaking a transaction into multiple units so that the user has a chance 
--           of roll backing a transaction up to a point or location. 
--           It creates points within the groups of transactions in which to ROLLBACK.


-- By default, MySQL automatically commits the changes permanently to the database.
-- Thats why when you insert, update, delete records they reflect into main DB server immediately to all clients/users
-- To force MySQL not to commit changes automatically, you use the following statement:
-- SET autocommit = OFF;

-- SET autocommit = ON;
-- DDL Statements cannot be clubbed inside Transaction, They are Autocommit.

DROP TABLE IF EXISTS Product;
CREATE TABLE Product
(
 ProductId INT PRIMARY KEY, 
 ProductName VARCHAR(40), 
 Price INT,
 Quantity INT
);

SET AUTOCOMMIT=ON; 
SELECT @@autocommit; #1 - ON & 0 - OFF
INSERT INTO Product VALUES
(1001, 'Product-1', 1000, 100),
(1002, 'Product-2', 2000, 150);
SELECT * FROM Product;

# SET autocommit = OFF;
DELETE FROM Product;  # This will work even if AUTOCOMMIT = OFF Because, You must use START TRANSACTION first.

-- Populate Product Table with test data
INSERT INTO Product VALUES
(1001, 'Product-1', 1000, 100),
(1002, 'Product-2', 2000, 150);
# COMMIT;

SET autocommit = ON; 
SELECT @@autocommit; #1 - ON
SET autocommit = OFF;
SELECT @@autocommit;  #0 - OFF

SELECT * FROM Product;

START TRANSACTION; 
SELECT @@autocommit;
  SAVEPOINT SavePoint1;
        INSERT INTO Product VALUES
        (1003, 'Product-3', 3000, 200),
		(1004, 'Product-4', 4000, 250);
  SELECT * FROM Product;     
  SAVEPOINT SavePoint2;
        INSERT INTO Product VALUES
        (1005, 'Product-5', 5000, 500),
        (1006, 'Product-6', 6000, 600);
  SELECT * FROM Product;      
  SAVEPOINT SavePoint3;
        INSERT INTO Product VALUES
        (1007, 'Product-7', 7000, 700),
        (1008, 'Product-8', 8000, 800);
  SELECT * FROM Product;
ROLLBACK TO SavePoint3;
  SELECT * FROM Product;
#ROLLBACK TO SavePoint2;
#  SELECT * FROM Product;
COMMIT;
SELECT @@autocommit; #1 - ON & 0 - OFF

SELECT * FROM Product;
SET autocommit = ON;

-- Check in between value after each Savepoint into another instance of DB connection in MySQL workbench..
