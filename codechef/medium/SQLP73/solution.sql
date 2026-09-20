-- your code goes here
select genre,case when count(book_id)<5 then 'Limited' else 'Abundant' end as availability from Books group by genre;
