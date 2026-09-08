# TONKSS28

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Defining a Fixed Tax Rate

In this example, we will declare a  **constant tax rate**  using the  **`final`**  keyword to ensure its value remains unchanged throughout the program.
Since tax rates are fixed and do not change frequently, declaring them as `final` prevents accidental modification.

 **When executed, the code will show** :

```
Fixed Tax Rate: 0.18  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T11:59:38.513Z  

```java
class Codechef {
    public static void main(String[] args) {
        
        // Declaring and assigning a fixed tax rate
        final float FIXED_RATE = 0.18f;

        // Printing the Fixed Tax Rate
        System.out.println("Fixed Tax Rate: " + FIXED_RATE);

    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/TONKSS28)