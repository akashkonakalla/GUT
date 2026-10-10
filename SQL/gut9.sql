use gut;

select *from emp;

-- Get the department wise average salary where the total salary of the department is greater than 10000;
select deptno, avg(sal) avg_sal, sum(sal) total_sal from emp group by deptno having sum(sal) > 10000;

-- 
