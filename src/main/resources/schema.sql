CREATE TABLE IF NOT EXISTS employee
(
	employee_id int NOT NULL,
 	employee_name varchar(100) NOT NULL,
 	employee_address varchar(100) DEFAULT NULL,
 	employee_email varchar(100) DEFAULT NULL,
	UNIQUE (employee_name,employee_email),
 	PRIMARY KEY (employee_id)
);