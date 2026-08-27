# Jewels and Stones

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You're given strings `jewels` representing the types of stones that are jewels, and `stones` representing the stones you have. Each character in `stones` is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so `"a"` is considered a different type of stone from `"A"`.

 

 **Example 1:** 

```
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3

```

 **Example 2:** 

```
Input: jewels = "z", stones = "ZZ"
Output: 0

```

 

 **Constraints:** 

- 1 <= jewels.length, stones.length <= 50
- jewels and stones consist of only English letters.
- All the characters of jewels are unique.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 11.24%)  
**Memory:** 43.3 MB (beats 36.12%)  
**Submitted:** 2026-08-27T09:37:51.380Z  

```java
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character>set=new HashSet<>();
        int count=0;
        for(char i:jewels.toCharArray()){
            set.add(i);
        }
        for(char s:stones.toCharArray()){
            if(set.contains(s)){
                count++;
            }
        }
        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/jewels-and-stones/)