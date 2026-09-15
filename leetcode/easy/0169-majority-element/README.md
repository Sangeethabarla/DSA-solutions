# Majority Element

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array `nums` of size `n`, return  *the majority element*.

The majority element is the element that appears more than `⌊n / 2⌋` times. You may assume that the majority element always exists in the array.

 

 **Example 1:** 

```
Input: nums = [3,2,3]
Output: 3

```

 **Example 2:** 

```
Input: nums = [2,2,1,1,1,2,2]
Output: 2

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 5 * 104
- -109 <= nums[i] <= 109
- The input is generated such that a majority element will exist in the array.

 

 **Follow-up:**  Could you solve the problem in linear time and in `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 16 ms (beats 20.47%)  
**Memory:** 55.3 MB (beats 70.27%)  
**Submitted:** 2026-09-15T17:10:27.814Z  

```java
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num,freq.getOrDefault(num,0) + 1);
        }
        for(Map.Entry<Integer,Integer> e : freq.entrySet()){
            if(e.getValue() > n/2){
                return e.getKey();
            }
        }
        return -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/majority-element/)