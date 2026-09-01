# Multiply Left and Right Array Sums

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array of integers  **arr[]**, divide it into two subarrays  **left** and  **right** such that left contains the first half of the elements and right contains the remaining elements. If the size of the array is odd, the right subarray contains one extra element. Compute the sum of elements in both subarrays and return the product of these two sums.

 **Examples :** 

```
Input : arr = [1, 2, 3, 4]
Output : 21
Explanation: Sum up an array from index 0 to 1 = 3, Sum up an array from index 2 to 3 = 7. Their multiplication is 21.

```

```
Input : arr = [1, 2] 
Output :  2 
Explanation: Their multiplication is 1*2 is equal to 2.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-01T06:22:07.489Z  

```java
class Solution {
    public int multiply(int[] arr) {
        // code here
        int n=arr.length;
        int m=n/2;
        int sum1=0,sum2=0;
        for(int i=0;i<n;i++){
            if(i<m){
                sum1+=arr[i];
            }else{
                sum2+=arr[i];
            }
        }
        return sum1*sum2;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/multiply-left-and-right-array-sum1555/1)