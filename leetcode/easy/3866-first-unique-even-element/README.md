# First Unique Even Element

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums`.

Return an integer denoting the first  **even**  integer (earliest by array index) that appears  **exactly**  once in `nums`. If no such integer exists, return -1.

An integer `x` is considered  **even**  if it is divisible by 2.

 

 **Example 1:** 

 **Input:**  nums = [3,4,2,5,4,6]

 **Output:**  2

 **Explanation:** 

Both 2 and 6 are even and they appear exactly once. Since 2 occurs first in the array, the answer is 2.

 **Example 2:** 

 **Input:**  nums = [4,4]

 **Output:**  -1

 **Explanation:** 

No even integer appears exactly once, so return -1.

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 1 <= nums[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.06%)  
**Memory:** 46.2 MB (beats 61.93%)  
**Submitted:** 2026-09-07T16:40:54.117Z  

```java
class Solution {
    public int firstUniqueEven(int[] nums) {
        int[] counts = new int[101];
        
        for (int num : nums) {
            counts[num]++;
        }
        
        for (int num : nums) {
            if (num % 2 == 0 && counts[num] == 1) {
                return num;
            }
        }
        
        return -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/first-unique-even-element/)