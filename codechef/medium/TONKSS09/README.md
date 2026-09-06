# TONKSS09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Output of ImplicitConversion

What will be the output of the following Java program?

```
class Codechef {
    public static void main(String[] args) {
        float num = 15; // Implicit conversion from int to float
        double result = num; // Implicit conversion from float to double

        System.out.println("Result: " + result);
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T14:35:41.004Z  

```cpp
class Codechef {
    public static void main(String[] args) {
        // Step 1: Declare and initialize an int variable
        int age = 25;

        // Step 2: Assign int value to a double variable (implicit conversion)
        double convertedAge = age;

        // Step 3: Print both values
        System.out.println("Integer Age: " + age);
        System.out.println("Converted Age (double): " + convertedAge);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/TONKSS09)