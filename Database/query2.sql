create table country_tab1
(
country_id		INTEGER(10),
country_name   	VARCHAR(50),
CONSTRAINT pk_country_tab  PRIMARY KEY(country_id)
);

CREATE TABLE state_tab1
(
state_id		INTEGER(10),
state_name 		VARCHAR(50),
country_id		INTEGER(10),
CONSTRAINT pk_states_tab PRIMARY KEY (state_id),
CONSTRAINT fk_states_tab1 foreign key (country_id)
references country_tab1(country_id)
);


insert into country_tab1
values(1,'USA');
insert into country_tab1
values(2,'CANADA');
insert into country_tab1
values(3,'MEXICO');
insert into country_tab1
values(4,'INDIA');

select * from country_tab1;

insert into state_tab1
values(1,'Florida',1);
insert into state_tab1
values(2,'Taxas',1);
insert into state_tab1
values(3,'Hawaii',1);
insert into state_tab1
values(4,'Alberta',2);
insert into state_tab1
values(5,'Columbia',2);
insert into state_tab1
values(6,'Rajasthan',4);
insert into state_tab1
values(7,'Lahore',null);


select * from country_tab1 c INNER JOIN state_tab1 s ON
c.country_id=s.country_id;

select * from country_tab1 c LEFT JOIN state_tab1 s ON
c.country_id=s.country_id;

select * from country_tab1 c RIGHT JOIN state_tab1 s ON
c.country_id=s.country_id;

select * from country_tab1 c LEFT JOIN state_tab1 s ON
c.country_id=s.country_id
UNION
select * from country_tab1 c RIGHT JOIN state_tab1 s ON
c.country_id=s.country_id;

select * from country_tab1 c CROSS JOIN state_tab1 s ;
-- where c.country_id=s.country_id;

SELECT country_tab1 c, state_tab1 s
FROM country_tab1
CROSS JOIN state_tab1;

select * from state_tab1 where country_id=
(select country_id from state_tab1 where state_name = 'Florida');
select * from state_tab1 where country_id=(1);


-- DAY 13 --
use sys;
select * from sys_config;

CREATE TABLE states (state_id INT(10),state_name VARCHAR(20), state_region VARCHAR(20), country_id INT(10), 
total_customers INT(20), profit_state_level INT(20), 
CONSTRAINT pk_state_states_id PRIMARY KEY(state_id),
CONSTRAINT fk_states_country_id FOREIGN KEY(country_id)
 REFERENCES
country_tab1(country_id));

Alter table states modify total_customers int not null;

Insert into states values(01,"Haryana","north",1,45,71);
Insert into states values(02,"Haryana2","west",2,46,78);
Insert into states values(03,"Haryana2","west",2,46,78);



Create TABLE ADDRESS(
	Address_Line1 Varchar(255),
    Address_Line2 Varchar(255),
    City VARCHAR(255),
    state VARCHAR(255),
    PERSON_ID INTEGER(10));

create table person 
(
id int not null ,
lname varchar(20) not null ,
fname varchar(20) not null ,
age int
);
ALTER TABLE person
ADD CONSTRAINT pk_id PRIMARY KEY (id);
describe person;
alter table address 
add constraint fk_person_address_id FOREIGN KEY(person_id) REFERENCES person(id);
describe address;
select * from address;

ALTER TABLE address
ADD FOREIGN KEY (person_id) references Person(id);

 

INSERT INTO Person values(123,"A","B",30);
INSERT INTO address values("123 Lane1","345 Lane2","MNO","PQR",123);
INSERT INTO address values("123 Lane1","345 Lane2","MNO","PQR",789);

-- unique constraint --
ALTER TABLE states
ADD UNIQUE (state_region);
Insert into states values(02,"Haryana2","west",2,46,78);
Insert into states values(03,"Haryana2","west",2,46,78);

ALTER table states
rename to states_sales_tab;
 
 ALTER table states_sales_tab
rename column state_region to states_direction;

ALTER TABLE states_sales_tab
MODIFY COLUMN states_direction CHAR(30);

Alter table states_sales_tab
drop column states_direction;






-- DAY 13 --

DROP PROCEDURE hplus.insertEmployee;
DELIMITER // ;
CREATE PROCEDURE hplus.insertEmployee
(IN in_id INT,
IN in_name VARCHAR (20),
IN in_role VARCHAR (20),
IN in_city VARCHAR (25),
IN in_country VARCHAR (25),
OUT out_result VARCHAR (25))
BEGIN
INSERT INTO hplus.EMPLOYEE (EMPID, NAME, ROLE, CITY, COUNTRY) values (in_id,in_name,in_role,in_city,in_country);
commit;
SET out_result :='TRUE';
END;


drop table hplus.employee;
CREATE TABLE hplus.employee(EMPID INT,
NAME VARCHAR(25),
            ROLE VARCHAR(25),
            CITY VARCHAR(25),
            COUNTRY VARCHAR(25));

commit;            
select * from employee;


-- DAY 13 bakchodi --
select * from hplus.employee;


select * from employee;
select * from emp_tab;

update emp_tab set manager=7000 where empname = 'KING2';
ALTER TABLE emp_tab
MODIFY COLUMN empno DECIMAL(5,2);