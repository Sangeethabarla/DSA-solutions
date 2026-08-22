# FLOW007 - Rating 588

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Reverse The Number

Given an Integer  **N**, write a program to reverse it.

### Input

The first line contains an integer  **T**, total number of testcases. Then follow  **T**  lines, each line contains an integer  **N**.

### Output

For each test case, display the reverse of the given number  **N**, in a new line.

### Constraints
- 1 ≤ T ≤ 1000
- 1 ≤ N ≤ 1000000
### Sample 1:
Input
Output

```
4
12345
31203
2123
2300
```

```
54321
30213
3212
32
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T07:02:08.737Z  

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
		    int n=sc.nextInt();
		    int rem=0,sum=0;
		    while(n>0){
		        rem=n%10;
		        sum=sum*10+rem;
		        n=n/10;
		    }
		    System.out.println(sum);
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FLOW007)