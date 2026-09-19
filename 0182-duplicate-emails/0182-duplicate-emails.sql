# Write your MySQL query statement below
select Email From Person
GROUP BY email
HAVING COUNT(*)>1;