USE GD;
DROP FUNCTION Func_Calculate_Age;
-- >>>>>>>>>>>>>>>>>>>>>>>>>>>> Functions <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
-- Typically, a stored procedure contains multiple statements separated by semicolons (;). 
-- To compile the whole stored procedure as a single compound statement, 
-- you need to temporarily change the delimiter from the semicolon (;) to another delimiter such as $$ or //:
-- By default, mysql itself recognizes the semicolon as a statement delimiter, so you must redefine the delimiter temporarily to 
-- cause mysql to pass the entire stored program definition to the server. 
-- To redefine the mysql delimiter, use the delimiter command.
-- A routine is considered “deterministic” if it always produces the same result for the same input parameters, and “not deterministic” otherwise. 
-- If neither DETERMINISTIC nor NOT DETERMINISTIC is given in the routine definition, the default is NOT DETERMINISTIC. 
-- To declare that a function is deterministic, you must specify DETERMINISTIC explicitly.
DELIMITER $$
CREATE FUNCTION Func_Calculate_Age
(
 dob date
)
RETURNS INT deterministic
BEGIN
    DECLARE TodayDate DATE;   -- int x;
    SELECT CURRENT_DATE() INTO TodayDate;  -- x=10;
    RETURN YEAR(TodayDate) - YEAR(dob);   -- return x*x;
END$$
DELIMITER;


-- Calling the above MySQL function:
SELECT Func_Calculate_Age('1987-05-20');
SELECT Func_Calculate_Age('1985-05-20') AS AGE;

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

CREATE VIEW ContractorsWithAge
AS
 SELECT EmployeeId, Name, Salary, DOB, Func_Calculate_Age(DOB) AS Age FROM ContractEmployee;

SELECT * FROM  ContractorsWithAge;

-- >>>>>>>>>>>>>>>>>>>>>>>>> STORED PROCEDURES <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

DELIMITER //
CREATE PROCEDURE GetAllContractorsWithAge()
BEGIN
	SELECT *  FROM ContractorsWithAge;
END //
DELIMITER ;
CALL GetAllContractorsWithAge();


# We will use Sakila sample Database for below queries: https://dev.mysql.com/doc/index-other.html 
DROP PROCEDURE IF EXISTS GetAllCitiesFromInputCountry;
DELIMITER //
CREATE PROCEDURE GetAllCitiesFromInputCountry(country CHAR(3))
BEGIN
	SELECT * 
    FROM world.city
	WHERE CountryCode = country;
END //
DELIMITER ;
CALL GetAllCitiesFromInputCountry('IND');

DROP PROCEDURE IF EXISTS citycount;
DELIMITER //
CREATE PROCEDURE citycount (IN country CHAR(3), OUT cities INT)
BEGIN
	SELECT COUNT(*) INTO cities FROM world.city
	WHERE CountryCode = country;
END//
DELIMITER ;

CALL citycount('IND', @cities); -- cities in india 
SELECT @cities;
CALL citycount('FRA', @cities); -- cities in France
SELECT @cities;