CREATE TABLE dept_tab
	(deptno INT(5), dname VARCHAR(50), mgr_id INT(10), location_id   INT(10),
	CONSTRAINT pk_dept_tab  PRIMARY KEY (deptno) );
    
select distinct (dname) from hplus.dept_tab;
select * from hplus.dept_tab;
select count(*) from hplus.dept_tab;
INSERT INTO dept_tab VALUES
   ( 111
   , NULL
   , 205
   , 1700
   );
   INSERT INTO dept_tab VALUES
   ( 500
   , NULL
   , 205
   , 1700
   );
INSERT INTO dept_tab VALUES
   ( 30
   , 'Purchasing'
   , 114
   , 1700
   );

   INSERT INTO dept_tab VALUES
   ( 40
   , 'Human Resources'
   , 203
   , 2400
   );



   INSERT INTO dept_tab VALUES
   ( 70
   , 'Public Relations'
   , 204
   , 2700
   );

   INSERT INTO dept_tab VALUES
   ( 80
   , 'Sales'
   , 145
   , 2500
   );

   INSERT INTO dept_tab VALUES
   ( 90
   , 'Executive'
   , 100
   , 1700
   );

INSERT INTO dept_tab VALUES
   ( 100
   , 'Finance'
   , 108
   , 1700
   );

   INSERT INTO dept_tab VALUES
   ( 110
   , 'Accounting'
   , 205
   , 1700
   );

INSERT INTO dept_tab VALUES
   ( 120
   , 'Treasury'
   , NULL
   , 1700
   );

INSERT INTO dept_tab VALUES
   ( 130
   , 'Corporate Tax'
   , NULL
   , 1700
   );

INSERT INTO dept_tab VALUES
   ( 140
   , 'Control And Credit'
   , NULL
   , 1700
   );

INSERT INTO dept_tab VALUES
   ( 150
   , 'Shareholder Services'
   , NULL
   , 1700
   );

INSERT INTO dept_tab VALUES
   ( 160
   , 'Benefits'
   , NULL
   , 1700
   );

INSERT INTO dept_tab VALUES
   ( 170
   , 'Manufacturing'
   , NULL
   , 1700
   );

INSERT INTO dept_tab VALUES
   ( 180
   , 'Construction'
   , NULL
   , 1700
   );

INSERT INTO dept_tab VALUES
   ( 190
   , 'Contracting'
   , NULL
   , 1700
   );

INSERT INTO dept_tab VALUES
   ( 200
   , 'Operations'
   , NULL
   , 1700
   );

INSERT INTO dept_tab VALUES
   ( 210
   , 'IT Support'
   , NULL
   , 1700
   );

INSERT INTO dept_tab VALUES
   ( 220
   , 'NOC'
   , NULL
   , 1700
   );

INSERT INTO dept_tab VALUES
   ( 230
   , 'IT Helpdesk'
   , NULL
   , 1700
   );

INSERT INTO dept_tab VALUES
   ( 240
   , 'Government Sales'
   , NULL
   , 1700
   );

INSERT INTO dept_tab VALUES
   ( 250
   , 'Retail Sales'
   , NULL
   , 1700
   );

INSERT INTO dept_tab VALUES
   ( 260
   , 'Recruiting'
   , NULL
   , 1700
   );

INSERT INTO dept_tab VALUES
   ( 270
   , 'Payroll'
   , NULL
   , 1700
   );  

commit;


-- DAY13 --
CREATE table dept_copy_tab
(
deptno INT(5), dname VARCHAR(50), mgr_id INT(10), location_id   INT(10)
);

create table old_emp_tab
(
	empno		INTEGER(10),
    empname		VARCHAR(50)	NOT NULL,
	job			VARCHAR(50),
    manager		INTEGER(10),
    hiredate	DATE,
    salary		DECIMAL(10,2),
    commision	DECIMAL(10,2),
    deptno		INTEGER(5)
);

select * from old_emp_tab;
insert into dept_copy_tab select * from dept_tab where deptno=230;
select * from dept_copy_tab;

update emp_tab set salary=8000 where empno=7001;
select * from emp_tab;

update emp_tab as e set manager=(select manager from emp_tab where empno=7010),
salary=(select salary from emp_tab where empno=7010) where empno=7011;

update emp_tab set deptno=500 where deptno=90;
update emp_tab set deptno=500 where deptno=40;

update emp_tab as e set e.manager = (select * from (select manager from emp_tab where empno=7001) as e3),
e.salary = (select * from (select salary from emp_tab  where empno =7001)as e4);
select * from emp_tab;

insert into old_emp_tab select * from emp_tab;
select * from old_emp_tab;

update emp_tab set salary=9000 where empname = 'QUEEN';
select * from emp_tab ;

update old_emp_tab set empname=(select empname from emp_tab where empno=7002) where empno=7001;
select * from old_emp_tab;

delete from old_emp_tab where empno=7002; 

delete from old_emp_tab where salary=(select salary from emp_tab where deptno=80);
select * from old_emp_tab;

delete from dept_tab where deptno=30;

-- MERGE into dept_copy_tab dc
-- USING dept_tab d ON(dc.deptno=d.deptno) WHEN
-- MATCHED THEN UPDATE SETdc.mgr_id=300
-- WHEN NOT MATCHED THEN
-- INSERT
-- VALUES(d.deptno,d.name,d.mgr_id,d.location_id);

create table employee_deptno500 AS (select empno,empname,job,salary from emp_tab where deptno=500);
select * from employee_deptno500;
desc employee_deptno500;