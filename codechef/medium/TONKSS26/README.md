# TONKSS26

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Check for the issue

A weather monitoring system records temperature data throughout the day.
The current temperature should be accessible globally, while the morning temperature should be restricted to a specific block to ensure proper scope management.

In the program, it is giving some errors. Can you help fix it?

 **Expected Output** 

```
Morning Temperature: 18.5
Current Temperature: 25.2

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T11:59:22.026Z  

```java
class Codechef {
    public static void main (String[] args) {
        double currentTemperature = 25.2; // Accessible globally

        {
            float morningTemperature = 18.5f; // Block-level variable
            System.out.println("Morning Temperature: " + morningTemperature);
        }

        System.out.println("Current Temperature: " + currentTemperature);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/TONKSS26)