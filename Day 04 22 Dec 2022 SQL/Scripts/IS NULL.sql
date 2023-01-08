SELECT `gd_batch`.`S_ID`,
    `gd_batch`.`COLLEGE_NAME`,
    `gd_batch`.`STREAM`,
    `gd_batch`.`SCORES`
FROM `gd_flipkart`.`gd_batch`
WHERE STREAM IS NULL;


SELECT 1 IS NULL, 1 IS NOT NULL, NULL IS NULL;

# What is null or NULL -- Unknown value doen treat it was space, blank, empty, 0, 0,0
# Only compare null values with IS NULL operator.
 
SELECT 0 IS NULL, 0.0 IS NULL, '' IS NULL, ' ' IS NULL;
SELECT 0 IS NOT NULL, 0.0 IS NOT NULL, '' IS NOT NULL, ' ' IS NOT NULL;



