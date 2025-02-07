# Write your MySQL query statement below
select user_id , time_stamp as last_stamp from Logins t1
where YEAR(date(time_stamp)) = 2020
and time_stamp = (select time_stamp from Logins t2 where YEAR(date(time_stamp)) = 2020 and t1.user_id = t2.user_id order by time_stamp desc limit 1)