# SQLP71

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### SQL Case Conditional Library Query

 **Case Study:**  A Library Management System is a software application that helps manage the various activities and operations of a library. The primary goal of this system is to efficiently organize and track books, members, loans, and reservations within the library. The library contains books from different genres, and members can borrow and reserve books.

- Dataset for a Library Management System, consisting of five tables: Books Table, Authors Table, Members Table, Loans Table and Reservations Table.
### Task
- Retrieve the title and author of books from the "Books" table. If the genre is 'Computer Science', display 'CS Book' as the category, else display 'Other Book' as the category.
- Use CASE WHEN.
- You can refer to the dataset here: “here”
### Expected Output Format

 **title** 
 **author** 
 **category**

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T07:02:47.453Z  

```sql
-- your code goes here
select title,author ,case when genre='Computer Science' then 'CS Book' else 'Other Book' end as category from books  ;
```

---

[View on CodeChef](https://www.codechef.com/problems/SQLP71)