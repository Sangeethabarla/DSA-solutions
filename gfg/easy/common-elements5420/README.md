# Common Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two integer arrays **a[]**  and  **b[]**, return an array containing all elements common to both arrays in  **sorted**  order.

If an element appears multiple times in both arrays, it should appear in the output as many times as it is common to both arrays.

 **Example:** 

```
Input: a[] = [3, 4, 2, 2, 4], b[] = [3, 2, 2, 7]
Output: [2, 2, 3]
Explanation: The common elements in sorted order are 2, 2, 3.
```

```
Input: a[] = [3, 6, 1, 7, 9, 8, 2, 2], b[] = [9, 7, 3, 4, 9]
Output: [3, 7, 9]
Explanation: The common elements in sorted order are 3, 7, 9.
```

 **Constraints:** 

1 ≤ a.size(), b.size() ≤ 105
1 ≤ a[i], b[i] ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-10T18:11:27.383Z  

```java
import java.util.*;

class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : b) {
            if (map.getOrDefault(num, 0) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        Collections.sort(result);

        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/common-elements5420/1)