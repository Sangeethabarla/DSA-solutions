# SQLP74

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Analyzing Library Borrowing Patterns

 **Case Study:**  A Library Management System is a software application that helps manage the various activities and operations of a library. The primary goal of this system is to efficiently organize and track books, members, loans, and reservations within the library. The library contains books from different genres, and members can borrow and reserve books.

- Data-set for a Library Management System, consisting of five tables: Books Table, Authors Table, Members Table, Loans Table and Reservations Table.
### Task
- List the member names and their total number of loans from the "Members" and "Loans" tables. If a member has borrowed more than 3 books, label them as 'Frequent Borrower', else label them as 'Occasional Borrower'.
- Use CASE WHEN, LEFT JOIN.
- You can refer to the dataset here: “here”
### Expected Output Format

 **member_name** 
 **borrowing_status**

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T07:21:26.577Z  

```sql
-- your code goes here
select m.member_name,
    case when count(l.book_id)>3 then 'Frequent Borrower' 
    else 'Occasional Borrower' end as borrowing_status 
    from Members m left join  Loans l on m.member_id=l.member_id group by m.member_id,m.member_name;

```

---

[View on CodeChef](https://www.codechef.com/problems/SQLP74)