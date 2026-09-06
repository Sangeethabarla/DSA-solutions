# TONKSS14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Explicit Type Casting in Java

A shipping company tracks the weight of packages in kilograms using a double data type. However, for billing purposes, the weight must be converted to a whole number (`int`).

```
class Codechef {
    public static void main(String[] args) {
        double packageWeight = 12.75;
        int roundedWeight = __ packageWeight; // Perform explicit conversion

        System.out.println("Package Weight: " + roundedWeight + " kg");
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T14:38:10.951Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/TONKSS14)