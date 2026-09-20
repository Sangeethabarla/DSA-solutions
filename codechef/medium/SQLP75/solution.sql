-- your code goes here
select m.member_name,
    case when count(l.book_id)>3 then 'Frequent Borrower' 
    else 'Occasional Borrower' end as borrowing_status 
    from Members m left join  Loans l on m.member_id=l.member_id group by m.member_id,m.member_name;
