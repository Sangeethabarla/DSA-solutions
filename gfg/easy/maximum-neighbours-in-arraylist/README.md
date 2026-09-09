# Maximum Neighbours In ArrayList

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer ArrayList  **arr[],**  return the  **maximum**  for every adjacent pairs in the ArrayList. 

 **Examples:** 

```
Input: [1, 2, 2, 3, 4, 5]
Output: [2, 2, 3, 4, 5]
Explanation: Maximum of arr[0] and arr[1] is 2, that of arr[1] and arr[2] is 2,... and so on. For last two elements, maximum is 5.

```

```
Input: [5, 5]
Output: [5]
Explanation: We only have two elements so max of 5 and 5 is 5 only.
```

 **Constraints:** 
2 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T12:57:20.068Z  

```java
class Solution {
    public static ArrayList<Integer> maxNeighbour(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer>al=new ArrayList<>();
        int n=arr.size();
        for(int i=0;i<n-1;i++){
            al.add(Math.max(arr.get(i),arr.get(i+1)));
        }
        return al;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximum-neighbours-in-arraylist/1)