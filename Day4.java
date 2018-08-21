// Link to Question http://codeforces.com/problemset/problem/672/B

import java.util.*;
import java.lang.*;
 
public class Day4 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
	    int n = scan.nextInt();
	    String s = scan.next();
	    
	    if(n > 26) {
	        System.out.println("-1");
	    } else {
	        Set<Character> c = new TreeSet<Character>();
	        for(int i=0; i<n; i++) {
	            c.add(s.charAt(i));
	        }
	        int k = c.size();
	        System.out.println(n - k);
	    }
	    
		scan.close();
	}
}