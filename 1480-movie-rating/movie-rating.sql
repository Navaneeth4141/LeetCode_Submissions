# Write your MySQL query statement below
(select u.name as results from MovieRating mr join USers u using (user_id) group by u.name order by count(*) desc, u.name asc limit 1) union all 
(select m.title as results from MovieRating mr join Movies m using (movie_id) where date_format(mr.created_at, '%Y-%m') = '2020-02' group by m.title order by avg(mr.rating) desc, m.title asc limit 1);