# Find All Anagrams in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings `s` and `p`, return an array of all the start indices of `p`'s anagrams in `s`. You may return the answer in  **any order**.

 

 **Example 1:** 

```
Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

```

 **Example 2:** 

```
Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".

```

 

 **Constraints:** 

- 1 <= s.length, p.length <= 3 * 104
- s and p consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 10 ms (beats 80.94%)  
**Memory:** 46.9 MB (beats 58.96%)  
**Submitted:** 2026-08-22T05:02:12.901Z  

```java
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> res = new ArrayList<>();
        s=s.toLowerCase();
        p=p.toLowerCase();
        int n=s.length();
        int m=p.length();
        if(m>n)
        return res;
        int c1[] = new int[26];
        int c2[] = new int[26];
        for(int i=0;i<m;i++)
        {
            c1[p.charAt(i) - 'a']++;
            c2[s.charAt(i) - 'a']++;
            }
            if(Arrays.equals(c1,c2))
            res.add(0);
            for(int i=m;i<n;i++)
            {
            c2[s.charAt(i) - 'a']++;
            c2[s.charAt(i - m) - 'a']--;
            if(Arrays.equals(c1,c2))
            res.add(i-m+1);
        }
return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-all-anagrams-in-a-string/)