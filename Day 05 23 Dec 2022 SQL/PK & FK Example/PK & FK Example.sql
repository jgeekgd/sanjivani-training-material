USE gd_sanjivani;
DROP TABLE IF EXISTS Student;
DROP TABLE IF EXISTS IdProof;

CREATE TABLE IdProof(
	Id VARCHAR(255) PRIMARY KEY,	
	Type VARCHAR(255),
	Document VARCHAR(255)
);
CREATE TABLE Student(
	Sid VARCHAR(255) PRIMARY KEY,	
	Name	VARCHAR(255),
	Address VARCHAR(255),
    Id VARCHAR(255),
    foreign key (Id) REFERENCES IdProof(Id)
);



#1. While creation of table --- Careful the PK table should exist 1st then FK table.
#2. Define all FK later using ALTER TABLE  Student ADD CONSTRINT FK_Id (Id)
