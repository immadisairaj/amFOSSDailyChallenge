// Link to Question https://codeforces.com/problemset/problem/450/A

import java.util.*;
import java.lang.*;
import java.io.*;

public class Day19 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out, true);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k, l, max = 0, index = -1;
		
		for(int i=0; i<n; i++) {
		    k = scan.nextInt();
		    l = ceil(k,m);
		    if(l >= max) {
		        max = l;
		        index = i;
		    }
		}
		        
	    pw.println(index+1);
        
        scan.close();
        pw.close();
    }
    
    public static int ceil(int n, int m) {
        if(n%m == 0)
            return n/m;
        return n/m + 1;
    }
}