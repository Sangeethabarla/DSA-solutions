# Distinct Characters In Sorted Manner

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**, return a string containing all distinct characters from s in non-decreasing order.

 **Examples:** 

```
Input: s = "abdbc"
Output: "abcd"
Explanation: The distinct characters in s are 'a', 'b', 'd', and 'c'. When sorted, they form "abcd".
```

```
Input: s = "fdfdfd"
Output: "df"
Explanation: The distinct characters in s are 'f' and 'd'. When sorted, they form "df".
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T13:26:46.882Z  

```java
class Solution {
    public String sortedDistinct(String s) {
        // code here
        TreeSet<Character>ts=new TreeSet<>();
        for(int i=0;i<s.length();i++){
            ts.add(s.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        for(char c:ts){
            sb.append(c);
        }
        return sb.toString();
    }
    
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-different-characters-in-sorted-manner/1)