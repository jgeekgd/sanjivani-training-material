SELECT * FROM gd_flipkart.alien;

SELECT * FROM gd_flipkart.alien LIMIT 2; # Top two
SELECT * FROM gd_flipkart.alien ORDER BY 1 DESC LIMIT 2;  # Second last two

SET @a=1;
PREPARE STMT FROM 'SELECT * FROM gd_flipkart.alien LIMIT ?, 2';
EXECUTE STMT USING @a;     