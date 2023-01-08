SHOW DATABASES;
USE GD;

-- Check current user and database server version
SELECT USER();
SELECT VERSION();

-- Show all users in mysql.user table
SELECT host, user, account_locked, password_expired
FROM mysql.user
ORDER BY 1,2;

-- Show current logged users
SELECT host, user, db, command 
FROM information_schema.processlist;

-- Check previlages on the account
DESCRIBE mysql.user;
SELECT * FROM mysql.user;

-- MySQL | CREATE USER Statement
-- CREATE USER user_account IDENTIFIED BY password;
-- Parameter 1: 
--  user_account- It is the name that the user wants to give to the database account.
-- 	The user_account should be in the format ‘username’@’hostname’ 
-- Parameter 2: 
--  password-It is the password used to assign to the user_account.The password is specified in the IDENTIFIED BY clause.

DROP USER IF EXISTS guest@'localhost';
DROP USER IF EXISTS acct@'localhost';

CREATE USER guest@localhost IDENTIFIED BY 'guest123';
CREATE USER acct@localhost IDENTIFIED BY 'accountant123';
-- Allowing a user account to connect from any host:
-- To allow a user account to connect from any host, the percentage (%) wildcard is used in the following way
DROP USER IF EXISTS dba@'%';
DROP USER IF EXISTS man@'%';

CREATE USER dba@'%' IDENTIFIED BY 'admin123';
CREATE USER man@'%' IDENTIFIED BY 'manager123';


-- Creating more than one user:
-- CREATE USER
-- 'guest1'@'localhost' IDENTIFIED BY 'efgh',
-- 'guest2'@'localhost' IDENTIFIED BY 'uvxy';
-- 'guest3'@'localhost' IDENTIFIED BY 'abcd';


-- Viewing permissions of an User Account: 
SHOW GRANTS FOR dba@'%';

-- If -> 
-- 	OUTPUT: GRANT USAGE ON *.* TO `dba`@`%`
--  The *.* in the output denotes that the “dba” user account can 
--  only login to the database server and has no other privileges

-- >>>>>>>>>>>>>>>>>>>>>>>> Data Control Lanagauge (DCL)<<<<<<<<<<<<<<<<<<<<<<<<<<<
-- Using the CREATE USER Statement only creates a new user 
-- but does not grant any privileges to the user account.
-- Therefore to grant privileges to a user account, the GRANT statement is used.

-- COMMAND: GRANT <privileges_names> ON <object> TO <user>;
-- Paramaters:
-- 	privileges_name: These are the access rights or privileges granted to the user.
-- 	object:It is the name of the database object to which permissions are being granted. In the case of granting privileges on a table, this would be the table name.
-- 	user:It is the name of the user to whom the privileges would be granted.

-- Here is a short list of commonly used permissions :
-- 	ALL - Allow complete access to a specific database. If a database is not specified, then allow complete access to the entirety of MySQL.
-- 	SHOW DATABASES- Allow a user to view a list of all databases.
-- 	CREATE - Allow a user to create databases and tables.
-- 	DROP - Allow a user to drop databases and tables.
-- 	INSERT - Allow a user to insert rows from a table.
-- 	SELECT - Allow a user to select data from a database.
-- 	DELETE - Allow a user to delete rows from a table.
-- 	UPDATE - Allow a user to update rows in a table.
-- 	EXECUTE - Allow a user to execute stored routines.
-- 	GRANT OPTION - Allow a user to grant or remove another user's privileges.

-- databasebame.* - This instructions MySQL to apply these rights for use in the entire databasebame database. 
-- You can replace the * with specific table names or DB objects if you wish.

GRANT ALL
ON *.*    # gd has the same privileges as the default root account, beware!
TO gd@'localhost';

SHOW GRANTS
FOR gd@'localhost';

GRANT SELECT, INSERT, UPDATE, DELETE 
ON gd.*   #On all the tables in a database
TO gd@'localhost';

SHOW GRANTS
FOR gd@'localhost';

GRANT SELECT, INSERT, UPDATE, DELETE
ON *.* 
TO gd@'localhost';

SHOW GRANTS
FOR gd@'localhost';

-- When finished making your permission changes, its good practice to reload all the privileges with the flush command!
-- To Reload newly assigned permissions run:
FLUSH PRIVILEGES;

-- Shows all PERMISSIONS to currenly logged in user
SHOW GRANTS;

-- Show all PERMISSIONS to specific user
SHOW GRANTS
FOR gd@'localhost';

REVOKE INSERT, UPDATE, DELETE 
ON gd.* 
FROM gd@'localhost';


GRANT GRANT OPTION 
ON *.* 
TO gd@'localhost';

SHOW GRANTS
FOR gd@'localhost';

REVOKE ALL PRIVILEGES, GRANT OPTION 
FROM gd@'localhost';

# The WITH GRANT OPTION clause gives the user the ability to give to other users any privileges the user has at the specified privilege level.


