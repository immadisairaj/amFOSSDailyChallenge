// Link to Question http://codeforces.com/contest/1030/problem/C

import java.util.*;
import java.lang.*;
import java.io.*;

public class Day20 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out, true);
		
		int n = scan.nextInt();
		scan.nextLine();
		String input = scan.nextLine();
		
		int sum = 0;
		int c = 0;
		int i = 0;
		int j = -1;
		
		while(j < 1001) {
		    j++;
	 	    sum = 0;
	 	    c = 0;
	 	    for(i=0 ; i<n ; i++) {
	 		    sum += input.charAt(i) - '0';
	 		    if(sum == j) {
	 		        sum = 0;
			        c++;	
		        }
		    }
	    	if(c > 1 && sum == 0) {
			    pw.println("YES");
			    return;
		    }
	    }
	    pw.println("NO");
	       
        
        scan.close();
        pw.close();
    }
}