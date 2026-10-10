use gut;

select *from emp;

-- Get the department wise average salary where the total salary of the department is greater than 10000;
select deptno, avg(sal) avg_sal, sum(sal) total_sal from emp group by deptno having sum(sal) > 10000;

-- 

delimiter $$
drop function if exists sumOfSal $$
create function sumOfSal(eNO int)
returns int
deterministic
begin 
declare total_sal int default 0;
declare emp_sal int default 0;
declare mgr_sal int default 0;


select sal into emp_sal from emp where empno = eNo;
select m.sal into mgr_sal from emp  e join emp m on e.mgr = m.empno where e.empno  = eNo ;
set total_sal = emp_sal + mgr_sal;

return total_sal;
end
$$

select sumOfsal(7369);



