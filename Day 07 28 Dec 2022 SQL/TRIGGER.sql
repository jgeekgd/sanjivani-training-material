-- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> TRIGGERS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

-- Types of Triggers in MySQL?
-- We can define the maximum six types of actions or events in the form of triggers:
-- 	Before Insert: It is activated before the insertion of data into the table.
-- 	After Insert: It is activated after the insertion of data into the table.
-- 	Before Update: It is activated before the update of data in the table.
-- 	After Update: It is activated after the update of the data in the table.
-- 	Before Delete: It is activated before the data is removed from the table.
-- 	After Delete: It is activated after the deletion of data from the table.

USE gd_sanjivani;

DROP TABLE IF EXISTS members;

CREATE TABLE members (
    id INT AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(255),
    birthDate DATE,
    PRIMARY KEY (id)
);

DROP TABLE IF EXISTS reminders;

CREATE TABLE reminders (
    id INT AUTO_INCREMENT,
    memberId INT, 
    message VARCHAR(255) NOT NULL,
    PRIMARY KEY (id , memberId)
);

/*
CREATE TRIGGER [IF NOT EXISTS] trigger_name
    trigger_time trigger_event
    ON tbl_name FOR EACH ROW
    trigger_body

trigger_time: { BEFORE | AFTER }
trigger_event: { INSERT | UPDATE | DELETE }

# Within the trigger body, the OLD and NEW keywords enable you to access columns in the rows affected by a trigger. 
# OLD and NEW are MySQL extensions to triggers; they are not case-sensitive.
# In an INSERT trigger, only NEW.col_name can be used; there is no old row. 
# In a DELETE trigger, only OLD.col_name can be used; there is no new row. 
# In an UPDATE trigger, you can use OLD.col_name to refer to the columns of a 
  row before it is updated and NEW.col_name to refer to the columns of the row after it is updated.

*/
DELIMITER $$ 

CREATE TRIGGER after_members_insert 
	AFTER INSERT
	ON members FOR EACH ROW
BEGIN # {
    IF NEW.birthDate IS NULL THEN
        INSERT INTO reminders(memberId, message)
        VALUES(NEW.id,CONCAT('Hi ', NEW.name, ', please update your date of birth.'));
    END IF;
END$$  # }

DELIMITER ;


INSERT INTO members(name, email, birthDate)
VALUES
    ('John Doe', 'john.doe@example.com', NULL),
    ('Smart Bear', 'sam@gmail','2022-01-01');

SELECT * FROM members;  
SELECT * FROM reminders;  

SHOW TRIGGERS;    
DROP TRIGGER after_members_insert;