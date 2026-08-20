# Write your MySQL query statement below
select customer_id , count(Visits.visit_id) as count_no_trans 
from Visits left join Transactions on Transactions.visit_id = Visits.visit_id
where transactions.visit_id is null
group by customer_id;

-- SELECT customer_id, COUNT(v.visit_id) as count_no_trans 
-- FROM Visits v
-- LEFT JOIN Transactions t ON v.visit_id = t.visit_id
-- WHERE transaction_id IS NULL
-- GROUP BY customer_id