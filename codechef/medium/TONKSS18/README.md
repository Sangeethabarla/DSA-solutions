# TONKSS18

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Employee Details

In this example, we demonstrate how  **block-level scope**  ensures that variables declared inside a block are only accessible within that block, while variables declared outside remain accessible everywhere within the method.

 **When executed, the code will show** :

```
Employee Details - ID: 101, Salary: 50000
Outside the block - Employee ID: 101

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T16:35:02.021Z  

```java
class Codechef {
    public static void main(String[] args) {
        int employeeId = 101; // Employee ID is accessible throughout the method

        {
            int salary = 50000; // Salary is only accessible inside this block
            System.out.println("Employee Details - ID: " + employeeId + ", Salary: " + salary);
        }

        System.out.println("Outside the block - Employee ID: " + employeeId);
        // System.out.println("Salary: " + salary); // Uncommenting this line will cause a compilation error
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/TONKSS18)