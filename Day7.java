// Link to Question http://codeforces.com/problemset/problem/4/C

import java.util.*;
import java.lang.*;
 
public class Day7 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
        int n = scan.nextInt();
        scan.nextLine();

        HashMap<String, Integer> map = new HashMap<>();
        while(n-- > 0) {
            String s = scan.nextLine();
            if(map.containsKey(s)) {
                int k = map.get(s);
                System.out.println(s+k);
                map.replace(s, k+1);
                map.put(s+k,1);
            } else {
                map.put(s,1);
                System.out.println("OK");
            }
        }
	    
		scan.close();
	}
}