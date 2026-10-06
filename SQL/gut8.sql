/*

GUT - 06/10/2026

*MySQL*
1. Identify duplicate job roles within departments.
2. Find employees whose salary rank is less than 5. 
*JavaScript*
*/

use gut;

select e.deptno,e.job  from emp e group by e.deptno, e.job having count(job)>1;

with res as(
select *,rank() over(order by sal desc) as rnk from emp
)
select * from res where rnk < 5;

select *from emp;