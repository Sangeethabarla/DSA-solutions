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
		    int k=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    ArrayList<Integer>al1=new ArrayList<>();
		    ArrayList<Integer>al2=new ArrayList<>();
		    for(int i=k;i<n;i++){
		        al1.add(a[i]);
		    }for(int i=0;i<k;i++){
		        al2.add(a[i]);
		    }
		    al1.addAll(al2);
		    for(int x:al1){
		        System.out.print(x+" ");
		    }
		    System.out.println();
		    
		    
		}

	}
}
