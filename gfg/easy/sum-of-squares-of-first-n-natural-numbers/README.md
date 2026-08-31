# Sum of Squares of First n Natural Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer  **n.**  The task is to calculate the sum of the squares of the first   **n**  natural numbers.

 **Examples:** 

```
Input: n = 2
Output: 5
Explanation: 12 + 22 = 5
```

```
Input: n = 3
Output: 14
Explanation: 12 + 22 + 32 = 14
```

 **Constraints:** 
0 <= n <= 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T16:32:16.829Z  

```java
class Solution {
    // Function to calculate the sum of squares of first 'number' natural numbers
    public int sumOfSquares(int n) {
        // code here
        int ans=0;
        for(int i=1;i<=n;i++){
            ans+=i*i;
        }
        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sum-of-squares-of-first-n-natural-numbers/1)