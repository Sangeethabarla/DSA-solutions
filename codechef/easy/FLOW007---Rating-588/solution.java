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
