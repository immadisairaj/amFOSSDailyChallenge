// Question Link http://codeforces.com/problemset/problem/1027/B

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out, true);
		
		long n = scan.nextLong();
		long q = scan.nextLong();
		
		while(q-- > 0) {
		    long x = scan.nextLong();
		    long y = scan.nextLong();
		    long c = (y + 1 + n*(x-1))/2;
		    if(x+y - 2*((x+y)/2) == 0) {
		        pw.println(c);
		    } else {
		        pw.println((n*n+1)/2 + c);
		    }
		}
        
        scan.close();
        pw.close();
    }
}