]
/*
 * *Day - 16*
*Java*
1. Given a sentence, find the longest word.
Example:
Input:
str = "In Vcube, Java is simple"
Output:
Developer
Constraint:
Ignore punctuation & Symbols

2. Count substrings having equal consecutive 0s and 1s. All 0s are grouped together and all 1s are grouped together 
Example:
Input:
00110011
Output:
6
*PLSQL*
1. Create a procedure to generate monthly employee analytics.

2. Create autonomous transaction trigger for logging
(MySQL doesn't support Oracle autonomous transactions directly.)
Workaround:
Use separate logging table.
Logging still rolls back with transaction in MySQL.

*JavaScript*
1. Write a JavaScript program to reverse a string.
Input: hello
 Output: olleh
 */
 
 -- 1. Create a procedure to generate monthly employee analytics.

	use gut;
    delimiter $$
    drop procedure if exists generateM $$
    create procedure generateM( in mon int )
    begin 
    select mon as month_number,
    count(*) as total_employees,
    sum(sal) as total_salary,
    avg(sal) as average_salary,
    min(sal) as minimum_salary,
    max(sal) as maximum_salary
    from emp
    where month(hiredate) = mon;
    end
    
    $$

call generateM(06);

-- 2. Create autonomous transaction trigger for logging
 delimiter $$
 create trigger emp_del
 after delete on emp
 for each row 
begin 
insert into emp_log(empno,ename,action,log_time)
values(old.empno,old.ename,'delete',now());
end
 $$
 