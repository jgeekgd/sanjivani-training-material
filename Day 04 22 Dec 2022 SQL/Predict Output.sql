SET sql_mode='PIPES_AS_CONCAT';
SELECT 'CD'  ||  '-ROM' as Title;
SELECT 'This'    ' is' ' a' ' mysql'      ' string' as Title;
SELECT NULL, 1+NULL, CONCAT('Invisible',NULL);
SELECT TRUE, true, FALSE, false;