# Write your MySQL query statement below
SELECT p.product_name, s.year, s.price 
FROM Sales s 
JOIN Product p ON s.product_id = p.product_id 
-- INNER JOIN is fine here: every sale has a product (foreign key guarantees it)
-- so no rows will be lost â no need for LEFT JOIN