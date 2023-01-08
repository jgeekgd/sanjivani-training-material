# Which one shall I use, when?
# DELETE - Empty Table, Where Possible, Rollback is possible, DML (Not Autocomit), Slower, Triggers are Fired
# TRUNCATE  - Empty Table, No Where Possible, Rollback is not posssible, DDL (Autcomit), Faster, Triggers are Not Fired
# DROP  - Remove Table, No Where Possible


CREATE TABLE Alien(
	alien_id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,   # AUTO_INCREMENT must be used with PRIMARY KEY
    alien_name VARCHAR(255)
);

# Run 10 Times
INSERT INTO Alien(alien_name)
VALUES ('Jadu');

SELECT * 
FROM Alien;

# Run 10 Times
TRUNCATE Alien;

# Run 10 Times
DELETE FROM Alien;
