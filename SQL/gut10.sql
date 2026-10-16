/*
 * *Day - 25*
*MySQL*
1. Determine the job role with the highest average salary.
*PLSQL*
1. Compare the performance of using a Cursor and a single UPDATE statement in MySQL to increase the salary of employees by 10% whose salary is below the company’s average salary. Which approach is faster and why?
*JavaScript*
1. Write a JavaScript program to compress a string.
Input: aaabbcc
 Output: a3b2c2
 */
 
 -- 1
 
 with res as (
 select job, dense_rank() over(order by sal desc)  as rnk from emp
 )
 select job from res where rnk=1;
 
 