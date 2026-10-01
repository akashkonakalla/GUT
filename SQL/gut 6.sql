
/*
 * *Day - 15*
*Java*
1. Given two strings, determine whether they are anagrams.
Example:
Input:
str1 = "listen"
str2 = "silent"
Output:
true
Constraint:
Ignore character order

2. Given a string and a character, count its occurrences.
Example:
Input:
str = "banana"
ch = 'a'
Output:
3
Constraint:
Time Complexity: O(n)
*PLSQL*
1. Create procedure to auto-correct invalid salary grades

2. Create trigger to prevent duplicate employee names
*JavaScript*
1. Write a JavaScript program to perform basic arithmetic operations.
Input: 10 + 5
 Output: 15
 */
 
 CREATE TABLE `emp_grade` (
  `empno` int NOT NULL,
  `ename` varchar(10) NOT NULL,
  `job` varchar(15) NOT NULL,
  `mgr` int DEFAULT NULL,
  `hiredate` date NOT NULL,
  `sal` int NOT NULL,
  `comm` int DEFAULT NULL,
  `deptno` int NOT NULL,
  `grade` int default 0,
  PRIMARY KEY (`empno`),
  FOREIGN KEY (`deptno`) REFERENCES `dept` (`deptno`)
) 
 
 select * from emp_grade;
 drop table emp_grade;
 insert into emp_grade(empno, ename, job, mgr, hiredate, sal, comm, deptno) select *from (select e.* from emp e join salgrade s on e.sal between losal and hisal) as temp;
 
 
 -- 1.Create procedure to auto-correct invalid salary grades
 
 
 
 
 use gut;
 delimiter $$
 drop procedure if exists invalidSal $$
 create procedure invalidSal()
 begin


update emp_grade grd join salgrade s on grd.sal between s.losal and s.hisal set grd.grade = s.grade 
where grd.empno>0;
		
 end
 $$
 
 call invalidSal();
 select * from emp_grade;
 
 -- 2. Create trigger to prevent duplicate employee names
 delimiter $$
 drop trigger if exists duplicateEmp $$
 create trigger duplicateEmp 
 before insert
 on emp
 for each row
 begin
 if exists (select 1 from emp where ename = new.ename) then
 signal sqlstate '45000'
 set message_text= "Employee already exists";
 end if;
 end
 $$
 select * from emp;
 insert into emp values(36999,'SMITH','CLERK',7902,'1980-12-17',1000,0 ,30);
 
 SHOW TRIGGERS LIKE 'emp';
 
 SHOW VARIABLES LIKE 'log_bin_trust_function_creators';
 SET GLOBAL log_bin_trust_function_creators = 1;
 
 