CREATE TABLE `login_backup` (
  `username` char(8) NOT NULL,
  `password` char(10) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

DELETE FROM `gd_flipkart`.`login_backup`;

-- full table copy
INSERT INTO `gd_flipkart`.`login_backup`
SELECT *
FROM `gd_flipkart`.`login`;

-- partial table copy with selective columns
INSERT INTO `gd_flipkart`.`login_backup` (`username`)
SELECT username
FROM `gd_flipkart`.`login`;


INSERT INTO `gd_flipkart`.`login_backup` (`username`)
SELECT username
FROM `gd_flipkart`.`login`
WHERE username='A001';   



