SHOW processlist;
# If you want every statement you enter in mysql session to be committed by yourself you can make the entire session AUTOCOMMIT value as OFF
# Command SET AUTOCOMMIT=OFF
# If you only want some statment to be non auto commitable then you put all those statments inside START TRASACTION ... COMMIT block.

/*
Install: https://apps.microsoft.com/store/detail/windows-terminal/9N0DX20HK701?hl=en-us&gl=us
Command to clean screen in windows: 
mysql> system cls 
Command to clean screen in linux: 
mysql> system clear;

# START TRANSACTION or BEGIN start a new transaction.
# COMMIT commits the current transaction, making its changes permanent.
# ROLLBACK rolls back the current transaction, canceling its changes.
# The SAVEPOINT statement sets a named transaction savepoint with a name of identifier.
  If the current transaction has a savepoint with the same name, the old savepoint is deleted and a new one is set.
  Syntax: SAVEPOINT identifier
  The ROLLBACK TO SAVEPOINT statement rolls back a transaction to the named savepoint without terminating the transaction. 
  Modifications that the current transaction made to rows after the savepoint was set are undone in the rollback,
# SET autocommit disables or enables the default autocommit mode for the current session.
# By default, MySQL runs with autocommit mode enabled. 
# This means that, when not otherwise inside a transaction, each statement is atomic, 
  as if it were surrounded by START TRANSACTION and COMMIT.
# You cannot use ROLLBACK to undo the effect; however, if an error occurs during statement execution, the statement is rolled back.

VVIMP:
"With START TRANSACTION, autocommit remains disabled until you end the transaction with COMMIT or ROLLBACK. 
The autocommit mode then reverts to its previous state"

Statements That Cannot Be Rolled Back:
# Some statements cannot be rolled back. 
# In general, these include data definition language (DDL) statements, such as those that create or drop databases, 
  those that create, drop, or alter tables or stored routines.
# You should design your transactions not to include such statements. 
# If you issue a statement early in a transaction that cannot be rolled back, 
  and then another statement later fails, the full effect of the transaction cannot be rolled 
  back in such cases by issuing a ROLLBACK statement.
*/
USE gd_sanjivani;

DROP TABLE IF EXISTS PRODUCTS;
CREATE TABLE PRODUCTS (
PRODUCT_ID int NOT NULL AUTO_INCREMENT,
PRODUCT_NAME varchar(200) NOT NULL,
PRODUCT_TYPE varchar(45) NOT NULL,
PRICE decimal(10,2) NOT NULL,
QUANTITY int NOT NULL default 0,
PRIMARY KEY (PRODUCT_ID),
UNIQUE KEY PRODUCT_NAME_UNIQUE (PRODUCT_NAME)
);
SELECT * FROM PRODUCTS;

# 1. Step: Start Console Session 1 or Workbench Session 1.
# 2. Step: Start Console Session 2: 
# 2. Step: Start Console Session 3: 

START TRANSACTION;  # No need to put AUTOCOMMIT OFF, till we further do COMMIT or ROLLBACK all statements in between will be temporary change.
USE gd_sanjivani;
INSERT INTO PRODUCTS(`PRODUCT_NAME`,`PRODUCT_TYPE`,`PRICE`,`QUANTITY`)VALUES
('Work From Home','Book',111.00,100),
('Digital Marketing','Book',222.00,150);

SELECT * FROM PRODUCTS;
INSERT INTO PRODUCTS(`PRODUCT_NAME`,`PRODUCT_TYPE`,`PRICE`,`QUANTITY`)VALUES
('Art of UI/UX Design','Book',333.00,250);

INSERT INTO PRODUCTS(`PRODUCT_NAME`,`PRODUCT_TYPE`,`PRICE`,`QUANTITY`)VALUES
('Cloud Computing','DVD',444.00,350);
UPDATE products SET PRICE=111.99 WHERE PRODUCT_ID=1;
DELETE FROM products WHERE PRODUCT_ID=2;


# >>>>>>>>>>>>>>>> Summary of TCL <<<<<<<<<<<<<<<<<<<<<<<<
#Auto Commit Is On By Default
START TRANSACTION;  # Transaction Begins Here, No need to set Autocommit to off this line tell to DB engine stop autocommit
	SAVEPOINT init;
	#Any DML Operation e.g. insert;
	SAVEPOINT ins;
	#Any DML Operation e.g. update;
	SAVEPOINT upd;
	#Any DML Operation e.g. delete;
	SAVEPOINT del;
	# SELECT table post all DML
	ROLLBACK TO ins;
COMMIT; # Transaction Ends Here
#Auto Commit Is On By Default



/*
# >>>>>>>>>>>>>>>>>>>>>>> Extra:
ACID
An acronym standing for atomicity, consistency, isolation, and durability. These properties are all desirable in a database system, and are all closely tied to the notion of a transaction. The transactional features of InnoDB adhere to the ACID principles.
Transactions are atomic units of work that can be committed or rolled back. When a transaction makes multiple changes to the database, either all the changes succeed when the transaction is committed, or all the changes are undone when the transaction is rolled back.
The database remains in a consistent state at all times — after each commit or rollback, and while transactions are in progress. If related data is being updated across multiple tables, queries see either all old values or all new values, not a mix of old and new values.
Transactions are protected (isolated) from each other while they are in progress; they cannot interfere with each other or see each other's uncommitted data. This isolation is achieved through the locking mechanism. Experienced users can adjust the isolation level, trading off less protection in favor of increased performance and concurrency, when they can be sure that the transactions really do not interfere with each other.
The results of transactions are durable: once a commit operation succeeds, the changes made by that transaction are safe from power failures, system crashes, race conditions, or other potential dangers that many non-database applications are vulnerable to. Durability typically involves writing to disk storage, with a certain amount of redundancy to protect against power failures or software crashes during write operations. (In InnoDB, the doublewrite buffer assists with durability.)
*/