SELECT e.unique_id,et.name
FROM EmployeeUNI e
RIGHT JOIN Employees et
ON e.id = et.id;