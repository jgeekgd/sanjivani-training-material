DROP TABLE IF EXISTS GD_BATCH;
CREATE TABLE GD_BATCH(
S_ID VARCHAR(200) PRIMARY KEY, 
COLLEGE_NAME VARCHAR(200), 
STREAM VARCHAR(100), 
SCORES INT);

DELETE FROM GD_BATCH;
INSERT INTO GD_BATCH VALUES('S001','RGM','CS',89);
INSERT INTO GD_BATCH VALUES('S002','MITS','EC',34);
INSERT INTO GD_BATCH VALUES('S003','RGM','CS',55);
INSERT INTO GD_BATCH VALUES('S004','RGM','EC',67);
INSERT INTO GD_BATCH VALUES('S005','MITS','EC',90);
INSERT INTO GD_BATCH VALUES('S006','RGM','CS',66);
INSERT INTO GD_BATCH VALUES('S007','MITS','CS',88);
INSERT INTO GD_BATCH VALUES('S008','RGM','IT',23);
INSERT INTO GD_BATCH VALUES('S009','MITS','CS',78);
INSERT INTO GD_BATCH VALUES('S010','MITS','IT',87);
INSERT INTO GD_BATCH VALUES('S011','IIT','M.Tech',88);
INSERT INTO GD_BATCH VALUES('S012','IIM','MBA',97);
INSERT INTO GD_BATCH VALUES('S013',null,null,0);

DROP TABLE IF EXISTS BOOKS;
CREATE TABLE BOOKS
(
  ISBN VARCHAR(200) PRIMARY KEY,
  BOOK_NAME VARCHAR(200),
  PUBLISHER_NAME VARCHAR(200),
  NUM_OF_PAGES INT,
  STUDENT_ID VARCHAR(200),
  FOREIGN KEY (STUDENT_ID) REFERENCES GD_BATCH(S_ID)
);

INSERT INTO BOOKS VALUES
('338-93-5019-561-1','Junior Level Books Introduction to Compute','Readers Zone',200,'S001'),
('448-93-5019-561-1','Client Server Computing','Sun India Publications, New Delhi',480,'S006'),
('778-93-8067-432-2','Client Server Computing','Sun India Publications, New Delhi',480,null),
('668-93-5163-389-1','Data Structure Using C','Thakur Publications Lucknow',600,'S009'),
('888-93-5019-561-1','Mobile Computing','K Nath & Sons, Meerut',230,null);

SELECT * 
FROM BOOKS;


SELECT * 
FROM GD_BATCH;



COMMIT;
SELECT * 
FROM GD_BATCH
ORDER BY 2;

SELECT `COLLEGE_NAME`,
    `STREAM`,
    `SCORES`,
    `S_ID`      
FROM `gd_batch`
ORDER BY 1,2 DESC,3 DESC;


SELECT `COLLEGE_NAME`,
    `STREAM`,
    `SCORES`,
    `S_ID`      
FROM `gd_batch`
ORDER BY 1,3 DESC,2 DESC;

-- Requirement, Need total count of student from each college

-- Below code gives same result if we use both WHERE or HAVING...
--
SELECT COLLEGE_NAME, COUNT(*)
FROM GD_BATCH
WHERE COLLEGE_NAME='IIM'
GROUP BY COLLEGE_NAME;
-- HAVING COLLEGE_NAME='IIM';


-- So where shall we use HAVING clause

SELECT COLLEGE_NAME, COUNT(*) as TOTAL
FROM GD_BATCH
GROUP BY COLLEGE_NAME
HAVING TOTAL<5;
-- HAVING COUNT(*)<5;


SELECT *
FROM GD_BATCH
WHERE STREAM='CS' AND COLLEGE_NAME='RGM'; 

SELECT DISTINCT COLLEGE_NAME
FROM GD_BATCH
WHERE STREAM='CS' OR STREAM='IT'; 

SELECT *
FROM GD_BATCH
WHERE STREAM='CS' OR 
	  STREAM='IT' OR 
	  STREAM='EC'; 
-- Equivalen for above is below one      

SELECT *
FROM GD_BATCH
WHERE STREAM IN ('CS','IT','EC'); 

SELECT *
FROM GD_BATCH
WHERE STREAM NOT IN ('CS','IT','EC'); 

SELECT *
FROM GD_BATCH
WHERE SCORES >= 10 AND SCORES <= 50; 

-- The Above query can be written in below manner

SELECT *
FROM GD_BATCH
WHERE SCORES BETWEEN 10 AND 50; 


SELECT *
FROM GD_BATCH
WHERE S_ID LIKE '%2'; 

-- The percentage ( % ) wildcard matches any string of zero or more characters.
-- The underscore ( _ ) wildcard matches any single character.

SELECT *
FROM GD_BATCH
WHERE S_ID LIKE '%1_'; 


SELECT *
FROM GD_BATCH
WHERE COLLEGE_NAME IS NULL; 

SELECT *
FROM GD_BATCH
WHERE COLLEGE_NAME IS NOT NULL; 


INSERT INTO GD_BATCH VALUES
('S014','null','MBA',55),
('S015',null,null,0);


-- LIMIT
-- The LIMIT clause is used in the SELECT statement to constrain the number of rows to return. 
-- The LIMIT clause accepts one or two arguments. 
-- The values of both arguments must be zero or positive integers.
-- SELECT 
--    select_list
-- FROM
--     table_name
-- LIMIT [offset,] row_count;
-- The offset specifies the offset of the first row to return. The offset of the first row is 0, not 1.
-- The row_count specifies the maximum number of rows to return.


SELECT COLLEGE_NAME, SCORES, S_ID
FROM GD_BATCH
WHERE COLLEGE_NAME IS NOT NULL
GROUP BY COLLEGE_NAME, SCORES, S_ID  
ORDER BY 1,2 DESC,3
LIMIT 0,3;


-- COMPLETED
-- 1. FROM Clause 
-- 2. WHERE Clause 
-- 3. GROUP BY Clause
-- 4. HAVING Clause
-- 5. SELECT Clause
-- 6. ORDER BY Clause
-- 7. CREATE DATABASE
-- 8. CREATE TABLE
-- 9. INSERT INTO VALUES
-- 10. PRIMARY KEY and FOREIGN KEY
-- 11. CHECK
-- 12. DEFAULT
-- 13. SELECT DISTINCT
-- 14. AND  (Ensure Operands are of different column)
-- 15. OR  (Operands may or may not be of same column)
-- 16. IN  (Multiple Operand with OR) 
-- 17. NOT IN (Invers of IN) 
-- 17. BETWEEN (The range we need to check)
-- 18. LIKE  (% & _ if these characters are inside your data the escape them with \ before that character
-- 19. IS NULL (Checks for nullable vlaues in column)
-- 20. IS NOT NULL
-- 21. Multiple Insetions Using Single INSERT Statement
-- 22. LIMIT
-- 23. CROSS JOIN
-- 24. INNER JOIN
-- 25. LEFT OUTER JOIN
-- 26. RIGHT OUTER JOIN
-- 27. FULL OUTER JOIN
-- 28. SELF JOIN
-- 29. UNION
-- 30. INTERSECT
-- 31. MINUS
-- 32. CREATE USER IDENTIFIED BY (DCL)
-- 33. GRANT <permission ON dbname.tablname TO usernam; (DCL)
-- 34. REVOKE <permission ON dbname.tablname FROM usernam; (DCL)
-- 35. SET AUTOCOMMIT=ON/OFF (TCL)
-- 36. START TRANSACTION (TCL)
-- 37. COMMIT (TCL)
-- 38. SAVEPOINT <savepointName> (TCL)
-- 39. ROLLBACK <savepointName> (TCL)
-- 40. CREATE VIEW (DDL)
-- 41. ALTER VIEW (DDL)
-- 42. DROP VIEW (DDL)
-- 43. CREATE PROCEDURE (DDL)
-- 44. CREATE FUNCTION (DDL)
-- 45. CREATE INDEX (DDL) CLUSTRED vs NON-CLUSERED INDEX
-- 46. DROP INDEX (DDL)
-- 47. CREATE TRIGGER
-- 48. DROP TRIGGER
-- 49. ACID Porperties
-- 50. DAO Pattern
 



SELECT COUNT(*)
FROM GD_BATCH;

SELECT COUNT(*) 
FROM BOOKS;

-- SELECT S_ID,COLLEGE_NAME, STREAM, BOOK_NAME 
-- CROSS JOIN
SELECT COUNT(*)
FROM GD_BATCH, BOOKS;

SELECT COUNT(*)
FROM GD_BATCH CROSS JOIN BOOKS;

-- SELECT * -- S_ID,COLLEGE_NAME, STREAM, BOOK_NAME 
-- FROM GD_BATCH as T1, BOOKS as T2
-- WHERE T1.STUDENT_ID=T2.STUDENT_ID;

-- INNER JOIN
SELECT S_ID,COLLEGE_NAME, STREAM, BOOK_NAME 
FROM GD_BATCH as T1 
INNER JOIN BOOKS as T2
ON T1.S_ID=T2.STUDENT_ID;


SELECT S_ID,COLLEGE_NAME, STREAM, BOOK_NAME 
FROM GD_BATCH as T1 
LEFT OUTER JOIN BOOKS as T2
ON T1.S_ID=T2.STUDENT_ID
ORDER BY 1,2,3;


SELECT S_ID,COLLEGE_NAME, STREAM, BOOK_NAME 
FROM GD_BATCH as T1 
RIGHT OUTER JOIN BOOKS as T2
ON T1.S_ID=T2.STUDENT_ID
ORDER BY 1,2,3;


-- MYSQL Does not provide FULL OUTER JOIN liker ORACLE hence you need to UNION both LEFT & RIGHT OUTER JOIN.

SELECT S_ID,COLLEGE_NAME, STREAM, BOOK_NAME 
FROM GD_BATCH as T1 
LEFT OUTER JOIN BOOKS as T2
ON T1.S_ID=T2.STUDENT_ID
UNION
SELECT S_ID,COLLEGE_NAME, STREAM, BOOK_NAME 
FROM GD_BATCH as T1 
RIGHT OUTER JOIN BOOKS as T2
ON T1.S_ID=T2.STUDENT_ID
ORDER BY 1,2,3;


-- SELF JOIN
SELECT  
    CONCAT(m.lastName, ', ', m.firstName) AS Manager,
    CONCAT(e.lastName, ', ', e.firstName) AS 'Direct report'
FROM employee as e INNER JOIN employee as m
ON e.`ï»¿employeeNumber`=m.`ï»¿employeeNumber`
ORDER By 2;
