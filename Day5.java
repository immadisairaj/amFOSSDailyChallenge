// Link to Question https://codeforces.com/problemset/problem/263/A

import java.util.*;
import java.lang.*;
 
public class Day5 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
	    int n, a = 0, b = 0;
	    for(int i=1; i<=5; i++)
	        for(int j=1; j<=5; j++) {
	            n = scan.nextInt();
	            if(n == 1) {
	                a = i; b = j;
	            }
	        }
	    
	    if(a-3 < 0)
	        a = 3-a;
	    else
	        a = a-3;
	        
	    if(b-3 < 0)
	        b = 3-b;
	    else
	        b = b-3;
	        
	    System.out.println(a+b);
	    
		scan.close();
	}
}