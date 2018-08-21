// Link to Question http://codeforces.com/problemset/problem/1004/A

import java.util.*;
import java.lang.*;
 
public class Day8 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
        int n = scan.nextInt();
        int d = scan.nextInt();

        int count = 2;
        int a = scan.nextInt();
        int b = a;
        n--;
        while(n-- > 0) {
            a = scan.nextInt();
            if(a-b >= 2*d)
                count += (a-b)-(2*d)+1 >= 2 ? 2 : 1;
            b = a;
        }
        
        System.out.println(count);
		scan.close();
	}
}