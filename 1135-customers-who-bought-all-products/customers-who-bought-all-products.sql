# Write your MySQL query statement below
select customer_id from customer t1
group by t1.customer_id 
having count(distinct(product_key)) = (select count(*)from Product)
