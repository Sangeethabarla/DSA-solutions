# SKDNBU04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Displaying Number using Assignment Operator

What will be the output of the following Java program?

```
class Codechef {
    public static void main(String[] args) {
        int number = 20;
        number = 15; 
        System.out.println("Number: " + number);
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T13:16:00.035Z  

```cpp
# cook your dish here
class Codechef {
    public static void main (String[] args) {
        int item1 = 30;
        int item2 = 50;
        int discount = 10;

        // 1. Calculate total price and final price after discount
        int totalPrice = item1 + item2;
        int finalPrice = totalPrice - discount;

        // 2. Find average price per item
        int averagePrice = totalPrice / 2;

        // 3. Print the final bill details matching expected output
        System.out.println("Total Price is : " + totalPrice);
        System.out.println("Final Price after the discount is : " + finalPrice);
        System.out.println("Average Price is : " + averagePrice);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SKDNBU04)