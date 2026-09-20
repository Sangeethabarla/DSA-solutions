-- your code goes here
select member_id,count(loan_id) as num_loans,case when count(loan_id)>=5 then 'VIP Member' when count(loan_id)>=3 then 'Regular Member' else 'Basic Member' end as membership_category from Loans group by member_id;
