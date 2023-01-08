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
