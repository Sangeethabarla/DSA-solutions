# TONKSS13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Converting Employee ID

In this example, we will store an employee ID using the `long` data type and observe how Java requires explicit type casting when converting it to an `int`.
Since `long` has a larger range than `int`.

 **When executed, the code will show** :

```
Employee ID (Long): 1234567890  
Converted Employee ID (Int): 1234567890  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T14:37:50.505Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Step 1: Declare and assign employee ID as long
        long employeeID = 1_234_567_890L;  // Employee ID within int range

        // Step 2: Explicitly convert long to int
        int convertedID = (int) employeeID;  

        // Step 3: Print both values
        System.out.println("Employee ID (Long): " + employeeID);
        System.out.println("Converted Employee ID (Int): " + convertedID);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/TONKSS13)