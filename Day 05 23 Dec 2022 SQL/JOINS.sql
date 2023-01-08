DROP DATABASE IF EXISTS gd_sanjivani;
CREATE DATABASE gd_sanjivani;
USE gd_sanjivani;
# SQL Joins
# CROSS JOIN or CARTESIAN PRODUCT:
DROP TABLE IF EXISTS Meals;
DROP TABLE IF EXISTS Drinks;
CREATE TABLE Meals(MealName VARCHAR(100), Price DECIMAL(5,2) );  #xxx.xx
CREATE TABLE Drinks(DrinkName VARCHAR(100), Price DECIMAL(5,2));  #xxx.xx

INSERT INTO Drinks
VALUES('Orange Juice', 120.00), ('Tea',60.00), ('Cofee',80.00);
INSERT INTO Meals
VALUES('Omlet',220.00), ('Fried Egg',250.00), ('Pasta',350.00);

SELECT *
FROM Meals;
SELECT *
FROM Drinks;

SELECT *
FROM Meals,Drinks;


SELECT CONCAT(MealName,' - ',DrinkName) AS Menu, CONCAT('₹ ', M.Price+D.Price) AS Price
FROM Meals M CROSS JOIN Drinks D
ORDER BY 2;



/*
What is Inner Join in SQL?
# The Inner Join in SQLis used to returns only the matching rows from
# both the tables involved in the join by removing the non-matching rows. 
# That means Inner join results only the matching rows from both the tables involved in the join. 
*/
DROP TABLE IF EXISTS Company;
CREATE TABLE Company
(
    CompanyId TinyInt AUTO_INCREMENT Primary Key,
    CompanyName varchar(50) NULL
);
INSERT Company(CompanyName) VALUES('DELL'),('HP'),('IBM'),('Microsoft');
DROP TABLE IF EXISTS Candidate;
CREATE TABLE Candidate
(
    CandidateId tinyint AUTO_INCREMENT primary key,
    FullName varchar(50) NULL,
    CompanyId tinyint REFERENCES Company(CompanyId)
);

INSERT Candidate(FullName, CompanyId) VALUES('Ron',1),('Pete',2),('Steve',3),('Steve',NULL),('Ravi',1),('Raj',3),('Kiran',NULL);

SELECT * FROM Company;
SELECT * FROM Candidate;

SELECT  Cand.CandidateId, 
        Cand.FullName, 
		Cand.CompanyId, 
		Comp.CompanyName
FROM Candidate Cand INNER JOIN Company Comp
ON Cand.CompanyId = Comp.CompanyId;

# INNER JOIN  can be written without INNER Keyword simply as JOIN Both mean same

SELECT Cand.CandidateId, 
       Cand.FullName, 
       Cand.CompanyId, 
       Comp.CompanyName 
FROM Candidate Cand JOIN Company Comp 
ON Cand.CompanyId = Comp.CompanyId;

# Joining three Tables in SQL:
# Now we will see how to JOIN three tables in SQL. 
# Already we have Company and Candidate tables. 
# Let us introduce the third table i.e. the Address table. 
# So, we are going to use the following Address table along with the Company and Candidate tables.
DROP TABLE IF EXISTS Address;
CREATE TABLE Address
(
    AddressId INT AUTO_INCREMENT PRIMARY KEY,
    CandidateId tinyint REFERENCES Company(CompanyId),
    Country VARCHAR(50),
    State VARCHAR(50),
    City VARCHAR(50)
);

INSERT INTO Address (CandidateId,Country,State,City)
Values 
	(1, 'India', 'Odisha', 'BBSR'),
	(2, 'India', 'Maharashtra', 'Mumbai'),
	(3, 'India', 'Maharashtra', 'Pune'),
	(4, 'India', 'Odisha', 'Cuttack');
 
SELECT * FROM Address;

# Check ER Diagram using Workbench for all three table Menu->Database->Reserver Engineer
COMMIT;

SELECT  Cand.CandidateId, 
  Cand.FullName, 
  Cand.CompanyId, 
  Comp.CompanyName,
  Addr.Country,
  Addr.State,
  Addr.City
FROM Candidate Cand INNER JOIN Company Comp
ON Cand.CompanyId = Comp.CompanyId
INNER JOIN Address Addr
ON Addr.CandidateId = Cand.CandidateId;

# Validate the Execution plan and flow from address table to company table. Saved image for reference.

/*
OUTER JOINS:
# LEFT OUTER JOIN or LEFT JOIN : If you want to retrieve all the matching records from both the tables 
    involved in the join as well as the non-matching records from the left side table then 
    we need to use Left Join or Left Outer Join in SQL. For Right side not matching record null will be populated. 
# RIGHT OUTER JOIN or RIGHT JOIN: If you want to retrieve all the matching records from both the tables 
    involved in the join as well as the non-matching records from the right side table then 
    we need to use Right Join or Right Outer Join in SQL. For Left side not matching record null will be populated. 
# FULL OUTER JOIN: Used to retrieve all the matching records from both the tables involved in the join as well as all 
      the non-matching records from both the tables. FULL OUTER JOIN= LEFT JOIN + RIGHT JOIN
*/

SELECT * FROM Company;
SELECT * FROM Candidate;

SELECT Cand.CandidateId, 
       Cand.FullName, 
       Cand.CompanyId, 
       Comp.CompanyId, 
       Comp.CompanyName 
FROM Candidate Cand 
LEFT OUTER JOIN Company Comp 
ON Cand.CompanyId = Comp.CompanyId
ORDER BY  Cand.CompanyId;   # For Steve & Kiran No Company Assigned Yet.

# How to Get only the non-matching rows from the left table in SQL
# Simply add this condition - WHERE Comp.CompanyId IS NULL;
SELECT Cand.CandidateId, 
       Cand.FullName, 
       Cand.CompanyId, 
       Comp.CompanyId, 
       Comp.CompanyName 
FROM Candidate Cand 
LEFT OUTER JOIN Company Comp 
ON Cand.CompanyId = Comp.CompanyId
WHERE Comp.CompanyId IS NULL   # check this is not added after FROM but after JOIN clause
ORDER BY  Cand.CompanyId;   # For Steve & Kiran No Company Assigned Yet.


# RIGHT OUTER JOIN or RIGHT JOIN: 
SELECT * FROM Company;
SELECT * FROM Candidate;

SELECT Cand.CandidateId, 
 Cand.FullName, 
 Cand.CompanyId, 
 Comp.CompanyId, 
 Comp.CompanyName 
FROM Candidate Cand 
RIGHT OUTER JOIN Company Comp 
ON Cand.CompanyId = Comp.CompanyId;  # No Candidate selected for Microsoft yet.

# How to Get only the non-matching rows from the left table in SQL
# Simply add this condition - WHERE Cand.CompanyId IS NULL;
SELECT Cand.CandidateId, 
       Cand.FullName, 
       Cand.CompanyId, 
       Comp.CompanyId, 
       Comp.CompanyName 
FROM Candidate Cand 
RIGHT OUTER JOIN Company Comp 
ON Cand.CompanyId = Comp.CompanyId
WHERE Cand.CompanyId IS NULL;

# FULL OUTER JOIN: Combination of Both LEFT & RIGHT
# MYSQL DO not support FULL OUTE JOIN KEYWORD They are trying since 2006.
# https://bugs.mysql.com/bug.php?id=18003
# Interim We Use this Solution: # https://dev.mysql.com/worklog/task/?id=1604
/* DOES NOT WORK ON MySQL, Microsoft SQL Server & Oracle Support it.
SELECT  Cand.CandidateId, 
 Cand.FullName, 
 Cand.CompanyId, 
 Comp.CompanyId, 
 Comp.CompanyName
FROM Candidate Cand
FULL OUTER JOIN Company Comp
ON Cand.CompanyId = Comp.CompanyId
*/

SELECT Cand.CandidateId, 
       Cand.FullName, 
       Cand.CompanyId, 
       Comp.CompanyId, 
       Comp.CompanyName 
FROM Candidate Cand 
LEFT OUTER JOIN Company Comp 
ON Cand.CompanyId = Comp.CompanyId
UNION # Or UNION ALL
SELECT Cand.CandidateId, 
       Cand.FullName, 
       Cand.CompanyId, 
       Comp.CompanyId, 
       Comp.CompanyName 
FROM Candidate Cand 
RIGHT OUTER JOIN Company Comp 
ON Cand.CompanyId = Comp.CompanyId
#  ORDER BY Cand.CompanyId	- Error Code: 1250. Table 'Cand' from one of the SELECTs cannot be used in global ORDER clause	0.000 sec
#  ORDER BY Comp.CompanyId	- Error Code: 1250. Table 'Cand' from one of the SELECTs cannot be used in global ORDER clause	0.000 sec
#  ORDER BY CompanyId	- Error Code: 1052. Column 'CompanyId' in order clause is ambiguous
ORDER BY 3; # This only works we cant give even CompanyId since two duplicate columns are coming post UNION, if you omit one column name then you can use column name instead of column ordinal 

# Only Show non matching from both LEFT & RIGHT Side
SELECT Cand.CandidateId, 
       Cand.FullName, 
       Cand.CompanyId, 
       Comp.CompanyId, 
       Comp.CompanyName 
FROM Candidate Cand 
LEFT OUTER JOIN Company Comp 
ON Cand.CompanyId = Comp.CompanyId
WHERE Comp.CompanyId IS NULL   # check this is not added after FROM but after JOIN clause
UNION  # Or UNION ALL
SELECT Cand.CandidateId, 
       Cand.FullName, 
       Cand.CompanyId, 
       Comp.CompanyId, 
       Comp.CompanyName 
FROM Candidate Cand 
RIGHT OUTER JOIN Company Comp 
ON Cand.CompanyId = Comp.CompanyId
WHERE Cand.CompanyId IS NULL;


# SELF Join:
# What is Self Join in SQL?
# The Self Join is nothing a concept where we need to join a table by itself. 
# You need to use Self Join when you have some relations between the columns of the same table.

DROP TABLE IF EXISTS Employee;
CREATE TABLE Employee
(
  EmployeeID INT PRIMARY KEY,
  Name VARCHAR(20),
  ManagerID INT,
  FOREIGN KEY (ManagerID) REFERENCES Employee(EmployeeID)
);
# Order of insertion is very important since foriegn key violation will result. 
# Manage should exist first as employee followed by reporting employee
# The Oldest/Senior employees exist in system first followed by junior/newcomers.

INSERT INTO Employee VALUES(3, 'Greg', NULL),
(1, 'Abhinav', 3),
(5, 'Rogger', 3),
(4, 'Vikrant', 5),
(2, 'Kartik', 4);

/*
        Greg
      /      \
  Abhinav    Rogger
               \ 
               Vikrant
                 \
                Kartik
  
*/

SELECT E.Name as Employee, M.Name as Manager
FROM Employee E LEFT JOIN Employee M
ON E.ManagerId = M.EmployeeId;

# Show only employees who has managers/boss 
SELECT E.Name as Employee, M.Name as Manager
FROM Employee E
INNER JOIN Employee M
ON E.ManagerId = M.EmployeeId

