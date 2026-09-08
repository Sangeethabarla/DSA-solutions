# TONKSS30

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Speed Limit Enforcement System

A traffic management system enforces a maximum speed limit on highways to ensure road safety. Since speed limits are fixed and do not change frequently, they should be declared using the final keyword.

 **Steps to Complete** 

- Declare a constant final int SPEED_LIMIT and assign a fixed value 80.
- Declare an int variable named currentSpeed and assign a value 75.
- Print both values to verify the speed enforcement system.

Run your code and check the output. Click "Submit" when you're ready!

 **Expected Output** 
If stored and printed correctly, your output should look something like:

```
Speed Limit: 80 km/h  
Current Speed: 75 km/h 

```

Feel free to modify the current speed to test different scenarios!

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T12:04:03.634Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Declare and assign a fixed speed limit using final
            final int SPEED_LIMIT=80;
            

        // Declare and assign current speed
            int currentSpeed=75;


        // Print the speed limit and current speed
        System.out.println("Speed Limit: " + SPEED_LIMIT + " km/h");
        System.out.println("Current Speed: " + currentSpeed + " km/h");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/TONKSS30)