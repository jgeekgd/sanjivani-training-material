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

INSERT INTO PRODUCTS(`PRODUCT_NAME`,`PRODUCT_TYPE`,`PRICE`,`QUANTITY`)VALUES
('Work From Home','Book',111.00,100),
('Digital Marketing','Book',222.00,150);

SELECT * FROM PRODUCTS;

select * from performance_schema.data_locks;
show processlist;
select * from information_schema.processlist;


/*
https://dev.mysql.com/doc/refman/8.0/en/glossary.html#glos_intention_lock
# TABLE LEVEL LOCKS IS & IX
-- intention lock
-- A kind of lock that applies to the table, used to indicate the kind of lock the transaction intends to acquire on rows in the table. 
-- Different transactions can acquire different kinds of intention locks on the same table, but the first transaction to acquire 
	an intention exclusive (IX) lock on a table prevents other transactions from acquiring any S or X locks on the table.
-- Conversely, the first transaction to acquire an intention shared (IS) lock on a table prevents other transactions from acquiring 
	any X locks on the table. 
-- The two-phase process allows the lock requests to be resolved in order, without blocking locks and corresponding operations that are compatible.
*/