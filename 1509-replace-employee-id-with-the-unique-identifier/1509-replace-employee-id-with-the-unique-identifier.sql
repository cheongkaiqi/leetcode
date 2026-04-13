# Write your MySQL query statement below
SELECT eu.unique_id, e.name
FROM Employees e
LEFT JOIN EmployeeUNI eu ON e.id = eu.id

-- LEFT JOIN because: employees without a unique_id should still appear (with NULL)
-- INNER JOIN would be wrong here â it would drop employees missing from EmployeeUNI
-- No DISTINCT needed: Employees.id is a primary key, so no duplicate names
-- No ORDER BY needed: problem says "any order"