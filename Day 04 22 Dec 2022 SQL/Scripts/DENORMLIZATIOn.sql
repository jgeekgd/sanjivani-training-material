DROP TABLE IF EXISTS contacts;

CREATE TABLE contacts (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL
);

INSERT INTO contacts(first_name,last_name, email)
VALUES('john','doe','john.doe@mysqltutorial.org');


SELECT 
    id, 
    CONCAT('Mr. ',first_name, ' ', last_name) as FullName, 
    email
FROM
    contacts;
    
 # Above code is fine for small tables but for large tables we do denormalization
 # intentionally adding extra column to save computation time and quick query response.
 
 DROP TABLE IF EXISTS contacts;

CREATE TABLE contacts (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    fullname varchar(101) GENERATED ALWAYS AS (CONCAT(first_name,' ',last_name)),
    email VARCHAR(100) NOT NULL
);

INSERT INTO contacts(first_name,last_name, email)
VALUES('GD','Junior','gd@revature.com');

SELECT `contacts`.`id`,
    `contacts`.`first_name`,
    `contacts`.`last_name`,
    `contacts`.`fullname`,   # Denormalization e.g you can age column compute using DATE methods in Mysql currendate-birthdate & get age.avg
    `contacts`.`email`
FROM `gd_flipkart`.`contacts`;






/*
 
With LIKE you can use the following two wildcard characters in the pattern:
	% matches any number of characters, even zero characters.
	_ matches exactly one character.
    
*/  
SELECT * 
FROM gd_flipkart.books
WHERE (NUM_OF_PAGES BETWEEN 480 AND 600)
    AND
	 PUBLISHER_NAME LIKE 'T%';   # MySQL case insensitive allow both upper, lowe or mix case, oracel does not allow this  

