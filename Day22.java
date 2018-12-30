// Link to the Question https://codeforces.com/contest/1068/problem/A

import java.util.*;
import java.lang.*;
import java.io.*;

public class Day22 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out, true);
		
	    long n = scan.nextLong();
	    long m = scan.nextLong();
        long k = scan.nextLong();
	    long l = scan.nextLong();

        if(m > n || n < k+l) {
            pw.println("-1");
        } else {
            long out = ((k + l) + m - 1) / m;
            if(out*m > n)
                pw.println("-1");
            else
                pw.println(out);
        }
        
        scan.close();
        pw.close();
    }
}