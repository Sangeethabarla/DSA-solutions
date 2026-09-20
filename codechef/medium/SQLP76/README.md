# SQLP76

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### SQL Library Membership Classification

 **Case Study:**  A Library Management System is a software application that helps manage the various activities and operations of a library. The primary goal of this system is to efficiently organize and track books, members, loans, and reservations within the library. The library contains books from different genres, and members can borrow and reserve books.

- Data-set for a Library Management System, consisting of five tables: Books Table, Authors Table, Members Table, Loans Table and Reservations Table.
### Task
- Classify members based on the number of loans they have made. Members with 5 or more loans are classified as 'VIP Member' members with 3 or more loans are classified as 'Regular Member' and the rest are classified as 'Basic Member'.
- Use CASE WHEN, COUNT.
- You can refer to the dataset here: “here”
### Expected Output Format

 **member_id** 
 **num_loans** 
 **membership_category**

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T07:31:56.643Z  

```sql
-- your code goes here
select member_id,count(loan_id) as num_loans,case when count(loan_id)>=5 then 'VIP Member' when count(loan_id)>=3 then 'Regular Member' else 'Basic Member' end as membership_category from Loans group by member_id;

```

---

[View on CodeChef](https://www.codechef.com/problems/SQLP76)