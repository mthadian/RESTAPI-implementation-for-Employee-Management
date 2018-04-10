# --- !Ups
CREATE TABLE employees(
	id bigint(20) NOT NULL ,
	name varchar(255) NOT NULL,
	PRIMARY KEY (id)

	
);

INSERT INTO employees(id,name)  VALUES(10,'Martin');
INSERT INTO employees(id,name)  VALUES(1,'Martines');
INSERT INTO employees(id,name)  VALUES(2,'Maoreen');
INSERT INTO employees(id,name)  VALUES(3,'Kasyoki');
INSERT INTO employees(id,name)  VALUES(11,'Krostov');
INSERT INTO employees(id,name)  VALUES(17,'Rusev');
INSERT INTO employees(id,name)  VALUES(8,'Muthama');
INSERT INTO employees(id,name)  VALUES(4,'Mohammed');
INSERT INTO employees(id,name)  VALUES(9,'Wafula');

# --- !Downs
DROP TABLE employees;
