/* *Day - 14*
*Java*
1. Given a string, find the first character that appears only once.
Example:
Input:
str = "VcubeJava"
Output:
V

2. Given a string, find the first repeating character.
Example:
Input:
str = "programming"
Output:
r
Constraint:
Time Complexity: O(n)
*PLSQL*
1. Create procedure to detect duplicate employee records

2. Create trigger preventing DELETE operations on weekends
*JavaScript*
1. Write a JavaScript program to swap two numbers.
Input: a = 5, b = 10
 Output: a = 10, b = 5
 */
 
 
 use gut;
 select *from emp;
 
 -- 1. Create procedure to detect duplicate employee records
 
 delimiter $$
 drop procedure if exists duplicateRecords $$
 create procedure duplicateRecords()
 begin

 WITH RES AS (
 select *,count(*) over(partition by empno, ename, job, mgr, hiredate, sal, comm, deptno) as C from emp 
 )
 SELECT *FROM RES WHERE C>=2;
 
 end
 $$
 call duplicateRecords();
 
 
 -- 2. Create trigger preventing DELETE operations on weekends
 delimiter $$
 drop trigger if exists preventDeleteWeekend $$
 create trigger preventDeleteWeekend
 before delete
 on emp
 for each row
 begin 
 select *from emp;
 end
 $$
 
 select date(curdate());
 select day(curdate());
 select date_format('2004-24-08','%Y-%d-%m');
 
 SELECT DATE_FORMAT("2017-06-15", "%D");
 
 SELECT DATE("The date is 2017-06-15"); 
 
 