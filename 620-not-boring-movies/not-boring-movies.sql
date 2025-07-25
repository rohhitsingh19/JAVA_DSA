-- Write your PostgreSQL query statement below
select a.id, a.movie, a.description, a.rating
from Cinema a
where a.id % 2 = 1 
and a.description != 'boring'
order by rating desc; 