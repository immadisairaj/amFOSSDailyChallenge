// link to code http://codeforces.com/gym/101375/problem/D

import java.util.*;
import java.lang.*;
import java.io.*;

public class Day18 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out, true);
		
		int n = scan.nextInt();
		long[] a = new long[n];
		
		for(int i=0; i<n; i++) {
		    a[i] = scan.nextLong();
		}
		
	    long sum = 0;
		for(int i=0; i<n; i++)
		    sum += a[i];
		long sums = 0;
		for(int i=0; i<n; i++)
		    sums += a[i]*a[i];
		long out = ((sum*sum) - sums)/2;
		        
	    pw.println(out);
        
        scan.close();
        pw.close();
    }
}