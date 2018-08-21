// Link to Question https://codeforces.com/problemset/problem/514/B

import java.util.*;
import java.lang.*;
 
public class Day6 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
	    int n = scan.nextInt();
	    double a,b;
	    int c = 0, d = 0;
	    double x = scan.nextDouble();
	    double y = scan.nextDouble();
	    
	    Set<Double> po = new TreeSet<>();
	    while(n-- > 0) {
	        a = scan.nextDouble();
	        b = scan.nextDouble();
	        
	        if(b != y || a != x) {
	            if(a != x) {
	                if(b != y)
	                    po.add( (double) (b-y) / (a-x));
	                else
	                    d = 1;
	            } else
	                c = 1;
	        }
	        
	    }
	        
	    System.out.println(po.size() + c + d);
	    
		scan.close();
	}
}