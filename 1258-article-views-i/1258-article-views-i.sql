# Write your MySQL query statement below
SELECT DISTINCT author_id AS id -- table might have duplicate rows
FROM Views 
WHERE author_id = viewer_id
ORDER BY id ASC -- sorted in ascending order, HAVING can be only use after group by