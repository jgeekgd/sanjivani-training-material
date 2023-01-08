-- >>>>>>>>>>>>>>>>>>>>>> INDEX <<<<<<<<<<<<<<<<<<<<<<
-- PRIMARY - CLUSTERED -- Clustered indexes sort and store the data rows in the table or view based on their key value, physical arrangement
-- SECONDERY - NON-CLUSTERED  -- When you wanted to search fast using non primary key columns.
# https://stackoverflow.com/questions/1251636/what-do-clustered-and-non-clustered-index-actually-mean
# https://stackoverflow.com/questions/91688/what-are-the-differences-between-a-clustered-and-a-non-clustered-index
#Only the PRIMARY KEY or the first non-NULL UNIQUE KEY can be the clustered index, and they will be the clustered index without you choosing.
#All the other indexes in the table are implicitly non-clustered.

USE gd_sanjivani;
DROP TABLE ContractEmployee;
-- Create Employee Table
CREATE TABLE ContractEmployee
(
  EmployeeId INT PRIMARY KEY,
  Name VARCHAR(50),
  Salary INT,
  DOB Date
);
-- Populate Employee table
INSERT INTO ContractEmployee(EmployeeId, Name, Salary, DOB) VALUES(1001, 'Pranaya', 10000, '1988-02-29');
INSERT INTO ContractEmployee(EmployeeId, Name, Salary, DOB) VALUES(1002, 'Anurag', 20000, '1992-06-22');
INSERT INTO ContractEmployee(EmployeeId, Name, Salary, DOB) VALUES(1003, 'Sambit', 30000, '1967-04-12');
INSERT INTO ContractEmployee(EmployeeId, Name, Salary, DOB) VALUES(1004, 'Kunal', 50000, '1958-04-12');
INSERT INTO ContractEmployee(EmployeeId, Name, Salary, DOB) VALUES(1005, 'Anurag', 90000, '1990-04-12');
INSERT INTO ContractEmployee(EmployeeId, Name, Salary, DOB) VALUES(1006, 'Amit', 70000, '1980-04-12');
INSERT INTO ContractEmployee(EmployeeId, Name, Salary, DOB) VALUES(1007, 'David', 30000, '1972-04-12');
INSERT INTO ContractEmployee(EmployeeId, Name, Salary, DOB) VALUES(1008, 'Smith', 23000, '1990-04-12');

SELECT * FROM ContractEmployee;

SELECT * FROM ContractEmployee WHERE EmployeeId=1008;

-- EXPLAIN works with SELECT , DELETE , INSERT , REPLACE , and UPDATE statements.
-- When EXPLAIN is used with an explainable statement, MySQL displays information from the optimizer about the statement execution plan.

EXPLAIN SELECT * FROM ContractEmployee WHERE EmployeeId=1008;

SELECT *  FROM ContractEmployee WHERE DOB='1990-04-12';

EXPLAIN SELECT *  FROM ContractEmployee WHERE DOB='1990-04-12'; # check type

# DDL CREATE , ALTER , DROP 
DROP INDEX datOfBirth ON ContractEmployee;
CREATE INDEX datOfBirth ON ContractEmployee(DOB);  # This is non-clustered index
# CREATE INDEX fastSearchByBothName ON ContractEmployee(firstname, lastname); WHERE fistname="Gd" AND lastname="jgeek" 
EXPLAIN SELECT *  FROM ContractEmployee WHERE DOB='1990-04-12';

-- View indexes on your table
SHOW INDEXES FROM ContractEmployee;

/* 
Imlicit Cluster Index Creation once you create table...
CREATE TABLE t1 ( c1 int PRIMARY KEY);
SELECT * FROM c1=1;
1
2
3
4
5

# While MySQL adds a hidden clusters index even if a table doesn't have a Primary Key

CREATE TABLE t2 (c2 int); #MySQL will create index
SHOW INDEXES FROM t2;  #hidden

DROP TABLE t3;
CREATE TABLE t3 (c1 int PRIMARY KEY, c2 int UNIQUE KEY, c3 int UNIQUE KEY); #MySQL will create non clusted index for all UNIQUE keys internally
SHOW INDEXES FROM t3;  #hidden

+-------+------------+----------+--------------+-------------+-----------+-------------+----------+--------+------+------------+---------+---------------+---------+------------+
| Table | Non_unique | Key_name | Seq_in_index | Column_name | Collation | Cardinality | Sub_part | Packed | Null | Index_type | Comment | Index_comment | Visible | Expression |
+-------+------------+----------+--------------+-------------+-----------+-------------+----------+--------+------+------------+---------+---------------+---------+------------+
| t3    |          0 | PRIMARY  |            1 | c1          | A         |           0 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| t3    |          0 | c2       |            1 | c2          | A         |           0 |     NULL |   NULL | YES  | BTREE      |         |               | YES     | NULL       |
| t3    |          0 | c3       |            1 | c3          | A         |           0 |     NULL |   NULL | YES  | BTREE      |         |               | YES     | NULL       |
+-------+------------+----------+--------------+-------------+-----------+-------------+----------+--------+------+------------+---------+---------------+---------+------------+

*/







-- Index Are applied on based tables --- 
-- CREATE INDEX datOfBirth ON ContractorsWithAge(DOB);
-- Error Code: 1347. 'gd.contractorswithage' is not BASE TABLE	0.016 sec


-- >>>>>>>>>>>>>>> EXTRA Ignore:
-- How to reindex mysql table
# https://dev.mysql.com/doc/refman/8.0/en/optimize-table.html
OPTIMIZE TABLE ContractEmployee;
ALTER TABLE ContractEmployee FORCE;
# Other way for non InnoDB DB if done for InnoDB will get below warning
ALTER TABLE ContractEmployee ORDER BY datOfBirth;
-- ORDER BY ignored as there is a user-defined clustered index in the table 'contractemployee'
-- Output of above is : Table does not support optimize, doing recreate + analyze instead becuase of below-
-- OPTIMIZE TABLE is mapped to ALTER TABLE, which rebuilds the table to update index statistics and free unused space in the clustered index.
-- You can use ALTER TABLE t ORDER BY col; The allowed syntax of ORDER BY is as in SELECT statements.

