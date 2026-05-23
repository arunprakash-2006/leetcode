# Write your MySQL query statement below
select q.query_name,round(avg(q.rating/q.position),2) as quality,
ROUND(100 * SUM(CASE WHEN rating < 3 THEN 1 ELSE 0 END) / COUNT(*), 2) as poor_query_percentage 
from Queries q group by q.query_name ;