# Write your MySQL query statement below
SELECT e.name from Employee as e
INNER JOIN Employee as m
On e.id=m.managerId
group by m.managerId
having count(*)>=5