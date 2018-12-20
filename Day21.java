// Link to the Question http://codeforces.com/problemset/problem/82/A

import java.util.*;
import java.lang.*;
import java.io.*;

public class Day21 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out, true);
		
		String[] person = new String[] {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
		int n = scan.nextInt();
		
		while(n > 5) {
		    n -= 5;
        if( (n/2)*2 != n) {
            n /= 2;
            n++;
        } else {
            n /= 2;
        }
	    }
	    pw.println(person[n-1]);
	       
        
        scan.close();
        pw.close();
    }
}
