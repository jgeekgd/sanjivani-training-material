/*
	Author: GD P
    Date: 22 Dec 2022
*/

-- DQL Script
SELECT `login`.`username`, `login`.`password`  # Relation Algebra : SELECTION Operation
FROM `gd_flipkart`.`login`;   


SELECT *
FROM `gd_flipkart`.`login`
WHERE username='A001' ; # Relation Algebra : PROJECTION Operation


-- NOTE: ` operator not single quote.