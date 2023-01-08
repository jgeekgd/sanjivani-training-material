/*
	Author: GD P
    Date: 22 Dec 2022
*/
-- DML -----
DELETE FROM `gd_flipkart`.`login`;

INSERT INTO `gd_flipkart`.`login` 
VALUES 
('A001','admin@123'),
('A002','admin@123'),
('A003','admin@123'),
('A004','admin@123'),
('A005','admin@123')
;

# IDEMPOTENT 
INSERT INTO `gd_flipkart`.`login` 
VALUES ('A001','admin@123');

DELETE FROM `gd_flipkart`.`login`
WHERE username='A005';

UPDATE `gd_flipkart`.`login`
SET
`username` = 'A100',
`password` = 'ad@123'
WHERE `username` = 'A001';






