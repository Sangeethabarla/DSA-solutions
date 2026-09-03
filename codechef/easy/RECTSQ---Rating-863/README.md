# RECTSQ - Rating 863

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Alternate Additions

Chef has $2$ numbers $A$ and $B$ $(A \lt B)$.

Chef will perform some operations on $A$.

In the $i^{th}$ operation:

- Chef will add $1$ to $A$ if $i$ is odd.
- Chef will add $2$ to $A$ if $i$ is even.

Chef can stop at any instant. Can Chef make $A$ equal to $B$?

### Input Format
- The first line contains a single integer $T$ — the number of test cases. Then the test cases follow.
- The first and only line of each test case contains two space separated integers $A$ and $B$.
### Output Format

For each test case, output `YES` if Chef can make $A$ and $B$ equal, `NO` otherwise.

Note that the checker is case-insensitive. So, `YES`, `Yes`, `yEs` are all considered same.

### Constraints
- $1 \leq T \leq 1000$
- $1 \leq A \lt B \leq 10^9$
### Sample 1:
Input
Output

```
4
1 2
3 6
4 9
10 20

```

```
YES
YES
NO
YES

```

### Explanation:

 **Test case 1:**  Chef may perform one operation to make $A$ equal to $B$: $1 \xrightarrow{+1} 2$

 **Test case 2:**  $3 \xrightarrow{+1} 4 \xrightarrow{+2} 6$

 **Test case 3:**  It can be shown that it is impossible to make $A$ and $B$ equal.

 **Test case 4:**  $10 \xrightarrow{+1} 11 \xrightarrow{+2} 13 \xrightarrow{+1} 14 \xrightarrow{+2} 16 \xrightarrow{+1} 17 \xrightarrow{+2} 19 \xrightarrow{+1} 20$

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T04:56:59.821Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    
		    int diff=b-a;
		    
		    if(diff%3==2){
		        System.out.println("NO");
		    }else{
		        System.out.println("YES");
		    }
		    
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/RECTSQ)