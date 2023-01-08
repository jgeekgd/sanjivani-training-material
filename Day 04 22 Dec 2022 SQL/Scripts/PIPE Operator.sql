SET sql_mode='PIPES_AS_CONCAT';
SELECT username || ' has password as -' ||password
FROM login;