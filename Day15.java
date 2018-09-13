// Question Link http://codeforces.com/problemset/problem/869/B

import java.util.*;
import java.lang.*;
import java.io.*;

public class Day15 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
		
		long a = scan.nextLong();
		long b = scan.nextLong();
        
        if(b-a > 9) {
            System.out.println("0");
        } else if(a==b) {
            System.out.println("1");
        } else {
            int out = 1;
            for(long i=a+1; i<=b; i++) {
                out*=(i%10);
            }
            System.out.println(out%10);
        }
        
        scan.close();
    }
}