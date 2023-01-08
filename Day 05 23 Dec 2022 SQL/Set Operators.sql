DROP DATABASE IF EXISTS gd_sanjivani;
CREATE DATABASE gd_sanjivani;
USE gd_sanjivani;












#What are SET Operators in SQL?
# The SET Operators in SQL are mainly used to combine the result of more 
# than 1 select statement and return a single result set to the user. 
# There are the following 4 set operators available in SQL:
#	1. UNION: Combine two or more result sets into a single set, without duplicates.
#	2. UNION ALL: Combine two or more result sets into a single set, including all duplicates.
#	3. INTERSECT: Takes the data from both result sets which are in common.
#	4. EXCEPT/MINUS: Takes the data from the first result set, but not in the second result set (i.e. no matching to each other)
DROP TABLE IF EXISTS A;
CREATE TABLE A (id INT, nbr INT);
DROP TABLE IF EXISTS B;
CREATE TABLE B (id INT, nbr INT);
INSERT INTO A (id,nbr) values (1,10),(3,30),(3,30),(5,50),(7,70);
INSERT INTO B (id,nbr) values (1,10),(2,20),(3,3),(4,40);

SELECT * FROM A;
SELECT * FROM B;
/*
--- A ---
1	10
3	30
3	30
5	50
7	70
--- B ---
1	10
2	20
3	3
4	40
*/

SELECT * FROM A 
UNION 
SELECT * FROM B
ORDER BY 1,2;

SELECT * FROM A 
UNION ALL
SELECT * FROM B
ORDER BY 1,2;

# This is only supported from version 8.0.31 ensure you have it else you need to use joins/Subqueries
# https://dev.mysql.com/doc/relnotes/mysql/8.0/en/news-8-0-31.html
SELECT version(); # 8.0.31

SELECT * FROM A 
INTERSECT 
SELECT * FROM B;

# For Older version use Subqueries or Joins
SELECT  *
FROM A
WHERE (id, nbr) IN
		( 
		  SELECT  id, nbr
		  FROM    B
		);
        
SELECT *  
FROM A INNER JOIN B
USING (id, nbr);

# A-B Added in 8.0.31 version
SELECT * FROM A 
EXCEPT
SELECT * FROM B
ORDER BY 1,2;

# B-A Added in 8.0.31 version
SELECT * FROM B 
EXCEPT
SELECT * FROM A
ORDER BY 1,2;

SELECT DISTINCT A.* FROM A LEFT OUTER JOIN B ON A.id=B.id AND A.nbr=B.nbr
WHERE B.id IS NULL
ORDER BY 1;

-- Verify what heppen if we miss few important kewords:
SELECT * FROM A LEFT OUTER JOIN B ON A.id=B.id AND A.nbr=B.nbr
ORDER BY 1;


# ORDER BY Issue
# Below Works Fine:
SELECT id, nbr FROM A 
UNION 
SELECT id, nbr FROM B
ORDER BY id;



# But whats the issue with this one?:
SELECT a.id, a.nbr FROM A a # SELECT a.id, m.id, a.nbr FROM A a JOIN M m the id is ambigious ORDER BY 1
UNION 
SELECT b.id, b.nbr FROM B b
#ORDER BY a.id; # Error Code: 1250. Table 'a' from one of the SELECTs cannot be used in global ORDER clause	0.000 sec
ORDER BY id; # this works you should not append prefix to coulmn names

# But what if the result has muliple columns from joined table check issue mentioned in FULL OUTER JOIN 
# We can change and use another column names for result like this
SELECT id as combined_id,nbr as combined_nbr
FROM 
(
	SELECT a.id, a.nbr FROM A a 
	UNION 
	SELECT b.id, b.nbr FROM B b
) as result
ORDER By combined_id;

