# Write your MySQL query statement below
select t2.Id from Weather t1
join Weather t2
on Datediff(t2.recordDate , t1.recordDate)=1
Where  t2.temperature > t1.temperature
