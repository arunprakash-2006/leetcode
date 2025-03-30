select name,bonus from
(SELECT e.empId, e.name, e.supervisor, e.salary, b.bonus
FROM Employee e
LEFT JOIN Bonus b
ON e.empId = b.empId)
AS joined_table
where bonus<1000 or bonus is null;

