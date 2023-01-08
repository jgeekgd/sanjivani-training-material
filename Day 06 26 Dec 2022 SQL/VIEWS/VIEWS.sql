-- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>> VIEWS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
-- VIEW is a database object that can be created like a table. 
-- In SQL a VIEW is similar to a virtual table. 
-- But unlike tables VIEWS don’t actually store data. 
-- VIEWS are complex SELECT statements used as virtual tables for ease of reference and reuse. 
-- The VIEWS are useful for storing complex SQL statements as a virtual table and request the VIEW as 
-- a single table instead of a complex query.
-- Simple VIEWS may allow INSERT, UPDATE, DELETE where as complex views may not allow these operations.

SELECT * 
FROM Product;

CREATE VIEW ExpensiveProduct
AS 
SELECT * 
FROM Product
WHERE Price>2000;

SELECT * 
FROM ExpensiveProduct;

INSERT INTO ExpensiveProduct
VALUES (2001,'iPhone',600,10);

UPDATE ExpensiveProduct
SET Price=9000
WHERE ProductId=2001;

INSERT INTO ExpensiveProduct
VALUES (2002,'Samsung',9000,10);

UPDATE ExpensiveProduct
SET Price=8000
WHERE ProductId=2002;

SELECT * 
FROM ExpensiveProduct;

SELECT * 
FROM Product;

ALTER VIEW ExpensiveProduct
AS 
SELECT * 
FROM Product
WHERE Price>5000;

SELECT * 
FROM ExpensiveProduct;

DROP VIEW ExpensiveProduct;



