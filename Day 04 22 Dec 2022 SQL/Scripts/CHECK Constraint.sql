SELECT * FROM gd_flipkart.books;

CREATE TABLE Persons (
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    CHECK (Age>=18)
);

INSERT INTO `gd_flipkart`.`persons`
(`ID`,
`LastName`,
`FirstName`,
`Age`)
VALUES
(200,'GD','P',18);


ALTER TABLE Persons
DROP CHECK persons_chk_1;

ALTER TABLE Persons
ADD CONSTRAINT CHK_PersonAge CHECK (Age>=18 AND Age<=60);

SELECT `persons`.`ID`,
    `persons`.`LastName`,
    `persons`.`FirstName`,
    `persons`.`Age`
FROM `gd_flipkart`.`persons`;


