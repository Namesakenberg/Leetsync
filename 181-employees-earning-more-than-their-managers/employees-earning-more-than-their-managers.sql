# Write your MySQL query statement below
select t1.name as Employee from Employee t1
where salary > (select salary from Employee t2 where t1.managerId = t2.id)