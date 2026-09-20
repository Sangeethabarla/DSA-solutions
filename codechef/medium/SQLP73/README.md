# SQLP73

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Analyzing Book Genre Availability SQL

 **Case Study:**  A Library Management System is a software application that helps manage the various activities and operations of a library. The primary goal of this system is to efficiently organize and track books, members, loans, and reservations within the library. The library contains books from different genres, and members can borrow and reserve books.

- Data-set for a Library Management System, consisting of five tables: Books Table, Authors Table, Members Table, Loans Table and Reservations Table.
### Task
- Find the total number of books available in each genre from the "Books" table. If the count is less than 5, label the genre as 'Limited', else label it as 'Abundant'.
- Use CASE WHEN.
- You can refer to the dataset here: “here”
### Expected Output Format

 **genre** 
 **availability**

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T07:09:52.309Z  

```sql
-- your code goes here
select genre,case when count(book_id)<5 then 'Limited' else 'Abundant' end as availability from Books group by genre;

```

---

[View on CodeChef](https://www.codechef.com/problems/SQLP73)