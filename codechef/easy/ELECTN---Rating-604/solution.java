import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            
            int count = 0;
            for (int i = 0; i < n; i++) {
                int age = sc.nextInt();
                if (age >= x) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}