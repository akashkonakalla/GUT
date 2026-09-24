use gut;
/*
*MySQL*
1. Show the department with the highest payroll.

*PLSQL*
1. Create trigger preventing salary decrease greater than 20%
*/

use gut;
select temp.deptno,d.dname,d.loc,payroll from  dept d join (select deptno,sum(sal) as 'Payroll' from emp group by deptno order by sum(sal) desc limit 1) temp on temp.deptno = d.deptno;
-- select deptno,sum(sal) as 'Payroll' from emp group by deptno order by sum(sal) desc;

delimiter $$
drop trigger if exists prevSalDec $$
create trigger prevSalDec
before update
on emp
for each row
begin 

if ((old.sal-new.sal)/old.sal)*100 >20 then
signal sqlstate '45000'
set message_TEXT ="error - cannot decrease salary greater than 20%";

end if;

end
$$

select *from emp;

update emp set sal=10 where empno =7369;
