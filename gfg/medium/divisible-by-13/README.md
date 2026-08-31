# Divisible by 13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a number represented as a string  **s**  (which may be very large), check whether it is divisible by 13 or not.

 **Examples:** 

```
Input : s = "2911285"
Output : true
Explanation: 2911285 / 13 = 223945, which is a whole number with no remainder.
```

```
Input : s = "27"
Output : false
Explanation: 27 / 13 ≈ 2.0769..., which is not a whole number (there is a remainder).
```

**Constraints:
**1 ≤  s.size()  ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T16:37:45.571Z  

```java
class Solution {
    public boolean divby13(String s) {
        int remainder = 0;
        for (int i = 0; i < s.length(); i++) {
            remainder = (remainder * 10 + (s.charAt(i) - '0')) % 13;
        }
        return remainder == 0;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/divisible-by-13/1)