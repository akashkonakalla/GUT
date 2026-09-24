/*

*MySQL*
3. Create procedure to transfer employees between departments with rollback handling
*PLSQL*
4. Create trigger to maintain salary history automatically

*/

DROP TRIGGER IF EXISTS prevSalDec;

explain select * from emp ;

UPDATE emp
SET deptno = 10
WHERE empno = 7839;
select  row_count() ;

delimiter $$ 
drop procedure if exists newProcedure $$
create procedure newProcedure(empn int, deptn int)
begin

declare exit handler for sqlexception
begin
select 'error';
rollback;
end;

start transaction;
savepoint s;

update emp set deptno = deptn where empno =empn;

end
$$

set autocommit =0;
call newProcedure(7839,60);
select *from emp;

rollback to s;



DELIMITER $$

DROP PROCEDURE IF EXISTS newProcedure $$

CREATE PROCEDURE newProcedure(empn INT, deptn INT)
BEGIN

    DECLARE EXIT HANDLER FOR SQLEXCEPTION
    BEGIN
        ROLLBACK;
        SELECT 'Error occurred. Full transaction rolled back.' AS message;
    END;

    START TRANSACTION;

    SAVEPOINT s;

    UPDATE emp
    SET deptno = deptn
    WHERE empno = empn;

    -- Undo only the changes made after savepoint s
    ROLLBACK TO s;

    COMMIT;

END $$

DELIMITER ;

call newProcedure(7839,60);

--------------------------------------------------------------------------------------------------------------


delimiter $$
drop trigger if exists sal_audit;
create trigger sal_audit
after update 
on emp
for each row
begin

insert into sal_audit values(old.empno,old.ename,old.sal,old.deptno,curdate());

end

$$
select *from emp;
select *from sal_audit;
update emp set sal=1000 where empno = 7369;
CREATE TABLE sal_audit (

empno int NOT NULL,

ename varchar(10) not NULL,

sal int not NULL,

deptno int not null,

updatedON date

);
