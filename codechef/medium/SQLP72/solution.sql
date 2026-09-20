-- your code goes here
select member_name,case when address like '%Delhi%' then 'Delhi Resident' else 'Other City' end as city_status from Members;
