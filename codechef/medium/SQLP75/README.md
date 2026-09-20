# SQLP75

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Analyze Library Books by Year

 **Case Study:**  A Library Management System is a software application that helps manage the various activities and operations of a library. The primary goal of this system is to efficiently organize and track books, members, loans, and reservations within the library. The library contains books from different genres, and members can borrow and reserve books.

- Data-set for a Library Management System, consisting of five tables: Books Table, Authors Table, Members Table, Loans Table and Reservations Table.
### Task
- Display the number of books published in each year, along with a column indicating if the number of books is greater than 3. If the count is greater than 3, display "Yes" otherwise "No"
- Use CASE WHEN.
- You can refer to the dataset here: “here”
### Expected Output Format

 **publication_year** 
 **num_books** 
 **greater_than_three**

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T07:28:44.035Z  

```sql
-- your code goes here

select publication_year,count(book_id) as num_books,case when count(book_id)>3 then 'Yes' else 'No' end as greater_than_three from Books group by publication_year;

```

---

[View on CodeChef](https://www.codechef.com/problems/SQLP75)