# NIBBLE - Rating 592

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T06:50:01.429Z  

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
		    int x=a*10;
		    int y=b*5;
		    if(x>y){
		        System.out.println("FIRST");
		    }else if(y>x){
		        System.out.println("SECOND");
		    }else{
		        System.out.println("ANY");
		    }
		}
		
		

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NIBBLE)