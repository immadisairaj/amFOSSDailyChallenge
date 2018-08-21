// Link to Question http://codeforces.com/problemsets/acmsguru/problem/99999/123

import java.util.*;
import java.lang.*;
 
public class Day1 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
	    int n = scan.nextInt();
	    
	    int sum;
	    if(n == 1)
	        sum = 1;
	    else if(n == 2)
	        sum = 2;
	    else {
	        sum = 2;
	        int a = 1, b = 1, c;
	        for(int i=3; i<=n; i++) {
	            c = a+b;
	            sum += c;
	            a = b;
	            b = c;
	        }
	    }
	    
	    System.out.println(sum);
	    
		scan.close();
	}
}