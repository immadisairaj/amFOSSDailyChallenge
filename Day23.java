// Link to the question https://codeforces.com/problemset/problem/399/A

import java.util.*;
import java.lang.*;
import java.io.*;

public class Day23 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out, true);
		
	    int n = scan.nextInt();
	    int p = scan.nextInt();
        int k = scan.nextInt();

        int f = p-k, t = p+k;
        if(p-k > 1) {
            pw.print("<< ");
            f = p-k;
        } else if(p-k < 1) {
            f = 1;
        }
        
        if(p+k < n) {
            t = p+k;
        } else if(p+k > n) {
            t = n;
        }
        
        for(int i=f; i<p; i++) {
            pw.print(i + " ");
        }
        
        pw.print("(" + p + ") ");
        
        for(int i=p+1; i<=t; i++) {
            pw.print(i + " ");
        }
        
        if(p+k < n) {
            pw.print(">>");
        }
        
        scan.close();
        pw.close();
    }
}