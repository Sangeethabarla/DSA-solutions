-- your code goes here
select title,author ,case when genre='Computer Science' then 'CS Book' else 'Other Book' end as category from books  ;