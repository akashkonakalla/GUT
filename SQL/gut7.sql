/*
PLSQL
1. Create procedure to compare current and previous salary trends

2. Create procedure for department-wise ranking generation
*JavaScript*
1. Write a JavaScript program to check whether a string is a palindrome.
Input: madam
Output: Palindrome
 */
 
 delimiter $$
drop procedure if exists newP $$
create procedure newP()
begin
declare oldsal decimal(10,2) ;
declare newsal decimal(10,2);

select sal  into oldsal from sal_audit;
select sal into newsal from emp;

if oldsal is null then
select 'old salary is unvailable';
elseif newsal > oldsal then
select 'salary is increased';
elseif oldsal> newsal then
select 'salary decreased';
else 
select newsal, oldsal, 'salary is unchanges';
end if;
end
 $$