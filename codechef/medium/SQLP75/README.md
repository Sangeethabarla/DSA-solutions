# SQLP75

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T07:21:29.414Z  

```sql
-- your code goes here
select m.member_name,
    case when count(l.book_id)>3 then 'Frequent Borrower' 
    else 'Occasional Borrower' end as borrowing_status 
    from Members m left join  Loans l on m.member_id=l.member_id group by m.member_id,m.member_name;

```

---

[View on CodeChef](https://www.codechef.com/problems/SQLP75)