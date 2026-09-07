# TONKSS19

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Secure PIN Handling with block level

A banking system is designed to handle customer authentication where the account number should be accessible globally, but the PIN should remain restricted to a specific block for security reasons.

Which of the following code snippets correctly demonstrates block-level scope for securing the PIN?

Option 1

```
int accountNumber = 12345;
System.out.println("Account Number: " + accountNumber);

```

Option 2

```
{
    int pin = 6789;
}
System.out.println(pin);

```

Option 3

```
int accountNumber = 12345;
{
    int pin = 6789;
    System.out.println("PIN Verified: " + pin);
}

```

Option 4

```
int accountNumber = 12345, pin = 6789;
System.out.println("Account Number: " + accountNumber + ", PIN: " + pin);

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T16:35:14.947Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/TONKSS19)