# TONKSS15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Student Performance Tracker

A university system stores student roll numbers as `int` but requires explicit casting to `short` for certain operations.
It also tracks whether a student has passed or failed using a `boolean` variable.

 **Expected Output:** 
If stored and printed correctly, your output should look something like:

```
Student Roll Number (Int): 12345  
Converted Roll Number (Short): 12345  
Has Passed: true  

```

Run the code, modify values, and test different student records!

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T14:38:59.859Z  

```java
class Codechef {
    public static void main (String[] args) {
        // Declare and assign student roll number as int
        int rollNumber = 12345; // Roll number within short range
        
        // Explicitly convert int to short
        short convertedRollNumber = (short) rollNumber;
        
        // Declare and assign student pass status
        boolean hasPassed = true; // True if the student has passed, false otherwise
        
        // Print all values
        System.out.println("Student Roll Number (Int): " + rollNumber);
        System.out.println("Converted Roll Number (Short): " + convertedRollNumber);
        System.out.println("Has Passed: " + hasPassed);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/TONKSS15)