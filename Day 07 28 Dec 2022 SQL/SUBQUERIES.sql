-- Some Queries can be written both using JOINS as well as Subqueries.
-- Its choice of developer to choose any one of them. There is no rule which one to choose.

-- The ‘ALL’, ‘ANY’, ’SOME’, ’IN’ operator compares value to every value returned by the subquery. All of these operators must follow a comparison operator. The syntax of using these operators with MySQL subquery is as follows −
-- Syntax for using ‘ALL’
-- Operand comparison_operator ALL (subquery)
-- Syntax for using ‘ANY’
-- Operand comparison_operator ANY (subquery)
-- Syntax for using ‘SOME’
-- Operand comparison_operator SOME (subquery)
-- Syntax of using ‘IN’
-- Operand comparison_operator IN (subquery)

/*
 https://dev.mysql.com/doc/refman/8.0/en/any-in-some-subqueries.html
# The word SOME is an alias for ANY. Thus, these two statements are the same:
# SELECT s1 FROM t1 WHERE s1 <> ANY  (SELECT s1 FROM t2);
# SELECT s1 FROM t1 WHERE s1 <> SOME (SELECT s1 FROM t2);
# Use of the word SOME is rare, but this example shows why it might be useful. 
# To most people, the English phrase “a is not equal to any b” means “there is no b which is equal to a,” 
  but that is not what is meant by the SQL syntax. 
# The syntax means “there is some b to which a is not equal.” 
# Using <> SOME instead helps ensure that everyone understands the true meaning of the query.

The query uses ‘ALL’ operator with a subquery and returns the result after comparing all the values returned by the subquery.
The query uses ‘ANY’ operator with a subquery and returns the result after comparing all the values returned by the subquery.
The query uses ‘SOME’ operator with a subquery and returns the result after comparing all the values returned by the subquery.
The query uses ‘IN’ operator with a subquery and returns the result after comparing all the values returned by the subquery.

The SQL EXISTS operator executes the outer SQL query if the subquery is not NULL (empty result-set).
*/
USE gd_sanjivani;
DROP TABLE IF EXISTS Teacher;
CREATE TABLE Teacher
(
  tid INT,
  tname VARCHAR(50),
  tage INT
);
-- Insert Rows into Teacher Table
INSERT INTO Teacher VALUES 
 (1,'Peter',32),
 (2,'Meagn',43),
 (3,'Rose',29),
 (4,'Linda',30),
 (5,'Mary',41);
 
-- Create ContractEmployee Table
DROP TABLE IF EXISTS Student;
CREATE TABLE Student
(
  sid INT,
  sname VARCHAR(50),
  sage INT
);
-- Insert rows into Student Table
INSERT INTO Student VALUES 
 (1,'Harry',23),
 (2,'Jack',42),
 (3,'Joe',32),
 (4,'Bruce',40);
 
SELECT * FROM  Teacher;
SELECT * FROM Student;
/*
+------+-------+------+
| tid  | tname | tage |
+------+-------+------+
|    1 | Peter |   32 |
|    2 | Meagn |   43 |
|    3 | Rose  |   29 |
|    4 | Linda |   30 |
|    5 | Mary  |   41 |
+------+-------+------+

+------+-------+------+
| sid  | sname | sage |
+------+-------+------+
|    1 | Harry |   23 |
|    2 | Jack  |   42 |
|    3 | Joe   |   32 |
|    4 | Bruce |   40 |
+------+-------+------+
*/
# Find teacher(s) whose age is similar to any of the student's age, we can use
# Inner query
SELECT sage
FROM Student;

# out put of inner query is fed as input to outer query
SELECT *
FROM  Teacher
WHERE  tage = ANY (SELECT sage
				FROM Student);

SELECT * 
FROM Teacher
WHERE tage = SOME (
  SELECT sage
  FROM Student
);

# Find teacher(s) whose age is greater than all students, we can use
SELECT * 
FROM Teacher
WHERE tage >  ALL (
  SELECT sage
  FROM Student
);

# We can use any comparison operators like =, >, <, <> etc. with the ANY and ALL keywords.
SELECT * 
FROM Teacher
WHERE tage < ANY (
  SELECT sage
  FROM Student
);


/*
>>>>>>>>>>>>>>>>>> Correlated Subqueries:
A correlated subquery is a subquery that contains a reference to a table that also appears in the outer query. For example:
SELECT * FROM t1
WHERE column1 = ANY (SELECT column1 FROM t2
                  WHERE t2.column2 = t1.column2);
Notice that the subquery contains a reference to a column of t1,
even though the subquery's FROM clause does not mention a table t1. 
So, MySQL looks outside the subquery, and finds t1 in the outer query.

*/

SELECT * FROM Customers;
SELECT * FROM Orders;
/*
+-------------+------------+-----------+------+---------+
| customer_id | first_name | last_name | age  | country |
+-------------+------------+-----------+------+---------+
|           1 | John       | Doe       |   31 | USA     |
|           2 | Robert     | Luna      |   22 | USA     |
|           3 | David      | Robinson  |   22 | UK      |
|           4 | John       | Reinhardt |   25 | UK      |
|           5 | Betty      | Doe       |   28 | UAE     |
+-------------+------------+-----------+------+---------+

+----------+----------+--------+-------------+
| order_id | item     | amount | customer_id |
+----------+----------+--------+-------------+
|        1 | Keyboard |    400 |           4 |
|        2 | Mouse    |    300 |           4 |
|        3 | Monitor  |  12000 |           3 |
|        4 | Keyboard |    400 |           1 |
|        5 | Mousepad |    250 |           2 |
+----------+----------+--------+-------------+
*/

# Idenitfy all customer who had placed orders.
SELECT customer_id, first_name
FROM Customers
WHERE EXISTS (  # EXISTS return boolean true or false in case of true it will show the outer query record else it will not.
  SELECT order_id
  FROM Orders
  WHERE Orders.customer_id = Customers.customer_id
);

# Above code can be written in INNER JOIN query.
SELECT DISTINCT c.customer_id, c.first_name
FROM Customers c INNER JOIN Orders o
ON c.customer_id=o.customer_id
ORDER BY 1;

# Idenitfy customer who had never placed any orders.
SELECT customer_id, first_name
FROM Customers
WHERE NOT EXISTS(
				SELECT order_id
				FROM Orders
				WHERE Orders.customer_id = Customers.customer_id
				);
# The below query can be written using left outer join as well.

SELECT DISTINCT c.customer_id, c.first_name
FROM Customers c LEFT OUTER JOIN Orders o
ON c.customer_id=o.customer_id
WHERE o.customer_id IS NULL;
