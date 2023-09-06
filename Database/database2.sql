CREATE TABLE emp_tab
(
	empno		INTEGER(10),
    empname		VARCHAR(50)	NOT NULL,
	job			VARCHAR(50),
    manager		INTEGER(10),
    hiredate	DATE,
    salary		DECIMAL(10,2),
    commision	DECIMAL(10,2),
    deptno		INTEGER(5),
    CONSTRAINT pk_emp_tab PRIMARY KEY (empno),
    CONSTRAINT fk_emp_tab_deptno FOREIGN KEY (deptno)
    REFERENCES dept_tab(deptno)
);

describe hplus.emp_tab;

CREATE TABLE country_tab
(
country_id		INTEGER(10),
country_name	VARCHAR(50),
constraint pk_country_tab PRIMARY KEY(country_id)
);

describe hplus.emp_tab;

CREATE TABLE state_tab
(
state_id		INTEGER(10),
state_name 		VARCHAR(50),
country_id		INTEGER(10),
CONSTRAINT pk_states_tab PRIMARY KEY (state_id),
CONSTRAINT fk_states_tab foreign key (country_id)
references dept_tab(deptno)
);

describe hplus.emp_tab;

select * from hplus.emp_tab;
insert into emp_tab
values (7010, 'KING','PRESIDENT',7003,STR_TO_DATE("August 17 1981", "%M %d %Y"),5000,null,40);

insert into emp_tab
values (7012, 'Queen','Lady_PRESIDENT',7004,STR_TO_DATE("August 18 1981", "%M %d %Y"),11000,null,30);

insert into emp_tab
values (7003, 'JACK','BODY_PRESIDENT',null,STR_TO_DATE("August 19 1981", "%M %d %Y"),3000,null,70);

insert into emp_tab
values (7004, 'ACE','KING_PRESIDENT',null,STR_TO_DATE("August 20 1981", "%M %d %Y"),2000,null,80);

insert into emp_tab
values (7005, 'JOKER','PAGAL_PRESIDENT',null,STR_TO_DATE("August 23 1981", "%M %d %Y"),1000,null,90);

insert into emp_tab
values (7006, 'JOKER','PAGAL_PRESIDENT',null,STR_TO_DATE("August 21 1981", "%M %d %Y"),1000,null,90);

insert into emp_tab
values (7007, 'JOKER','PAGAL_PRESIDENT',null,STR_TO_DATE("August 21 1981", "%M %d %Y"),3000,null,90);

select * from hplus.emp_tab;
select empname, 10*salary+100 from emp_tab;
select empname, 10*(salary+100) from emp_tab;
select empname, 10+salary+100 from emp_tab;
select empno AS ID, empname AS Employeee_Name FROM emp_tab;
SELECT empname + 'belongs to' + deptno + 'department number'  AS "Employee_Department" FROM emp_tab;
-- or we can do --
select concat(empname," belongs to department number : ",deptno) as new  from emp_tab;
select distinct empname,hiredate from hplus.emp_tab;

select empno,empname,salary,ID from emp_tab where salary>4000;
-- we can use table alies name(AS) but not use column alies name--
select deptno as dn from hplus.emp_tab as et where et.deptno = 40;
select * from emp_tab where salary NOT BETWEEN 2000 AND 5000;
select * from emp_tab where deptno IN (30,70);
select * from emp_tab where deptno NOT IN (30,70);
select * from emp_tab where empname like'_I%';
select empno FROM emp_tab where commision IS NULL;
SELECT * FROM emp_tab
WHERE hiredate =  STR_TO_DATE('August 23 1981','%M %d,%Y');

 -- DAY 12 --
 
 
SELECT * FROM emp_tab;
SELECT * FROM emp_tab WHERE empname LIKE 'J%' AND deptno=90;
SELECT * FROM emp_tab WHERE salary>3000 OR deptno>90;
SELECT * FROM emp_tab WHERE deptno NOT IN (40,70) AND salary>3000 AND empname LIKE 'Q%';

-- RULE Precedence --
SELECT empno,empname,deptno,salary FROM emp_tab WHERE deptno=30 OR deptno=40 AND salary>3000;
SELECT empno,empname,deptno,salary FROM emp_tab WHERE (deptno=30 OR deptno=40) AND salary>3000;

SELECT empno,empname,salary FROM emp_tab ORDER BY salary;
SELECT empno,empname as en,salary as se FROM emp_tab ORDER BY se DESC;

SELECT round(92.427,2) from dual; 
SELECT TRUNCATE(92.427,2) from dual; 
SELECT MOD(2100,500) from DUAL;
SELECT UPPER('deepak') from dual;
SELECT LOWER('DEEPAK') from dual;
SELECT INITCAP('deepak') from dual;

SELECT empno,empname,salary FROM emp_tab WHERE deptno=90 ORDER BY salary;
SELECT empno,empname,salary,hiredate FROM emp_tab ORDER BY hiredate desc;
SELECT * from emp_tab ORDER BY salary,deptno DESC;


SELECT CONCAT('Hello','World') FROM dual;
SELECT SUBSTR('HelloWorld',6,10) FROM dual;
SELECT LENGTH('HelloWorld') FROM dual;
SELECT INSTR('HelloWorld','e') FROM dual;

SELECT LPAD(5000,8,'*') from dual;
SELECT Lpad(100000,8,'*') from dual;
select rpad(10000,8,'*') from  dual;
select trim('d' from 'dhelloWorld') From dual;
select replace('helloworld','hello','Bye') from dual;

select sysdate() - interval 10 hour from dual;
select sysdate() + interval 10 minute from dual;
select sysdate() + interval 10 day from dual;
select sysdate() + interval 10 month from dual;
select sysdate() + interval 10 year from dual;
select sysdate() + interval 10 week from dual;
select sysdate() + interval 10 week from dual;

select adddate('2017-06-13',interval 10 day) from dual;
SELECT TIMESTAMPDIFF(MONTH, '2012-05-05', '2012-08-06') from dual;
SELECT TIMEDIFF("13:10:11", "13:09:10") from dual;

SELECT empname,YEAR(hiredate) FROM emp_tab;

SELECT empname,job,salary,
CASE job WHEN 'PRESIDENT' THEN truncate(1.20*salary,2)
WHEN 'Lady_PRESIDENT' THEN truncate(1.10*salary,2)
ELSE salary
END "Revised Salary"
from emp_tab;

-- SELECT empname,job,salary,
-- DECODE(job, 	'Lady_PRESIDENT',1.20*salary,
-- 				'PRESIDENT', 1.15*salary,
--                 salary)"Revised Salary"
-- from emp_tab;

SELECT SUM(salary) from emp_tab;
SELECT AVG(salary) from emp_tab;
select min(salary),max(salary) from emp_tab where deptno=90;
select count(*) from emp_tab;
select empname from emp_tab where manager=7003;
select count(empname) from emp_tab where manager=7003;
select count(distinct(empno)) from emp_tab;
select min(hiredate),max(hiredate) from emp_tab;
select min(empname), max(empname) from emp_tab;

select manager,MAX(salary) from emp_tab group by manager order by max(salary) desc;
select MAX(salary),max(empno) from emp_tab group by manager,empname;

select deptno,MAX(salary)>4000 from emp_tab  group by deptno;
select deptno,MAX(salary) from emp_tab  group by deptno having max(salary)>=4000;

select empno, empname, deptno, salary from emp_tab
where deptno=(select deptno from emp_tab where empno=7001);

select empno, empname, deptno, salary from emp_tab
where deptno=(select deptno from emp_tab where empno=7001);

select * from emp_tab;


select empno,empname,salary from emp_tab where salary=(select max(salary) from emp_tab);
select empno,empname,salary from emp_tab where salary IN (select salary from emp_tab where deptno=70);


-- DAY13 --
Insert into dept_tab values (15, '&name','&location');