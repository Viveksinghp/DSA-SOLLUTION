# Write your MySQL query statement below
SELECT e.employee_id from  Employees as e
LEFT JOIN Employees as m
ON m.employee_id=e.manager_id
WHERE e.salary < 30000 
AND e.manager_id is NOT NULL
AND m.employee_id is NULL
Order by e.employee_id;