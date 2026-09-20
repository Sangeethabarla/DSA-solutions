-- your code goes here

select publication_year,count(book_id) as num_books,case when count(book_id)>3 then 'Yes' else 'No' end as greater_than_three from Books group by publication_year;
