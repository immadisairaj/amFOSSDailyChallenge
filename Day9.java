// Link to Question https://codeforces.com/problemset/problem/798/A

import java.util.*;
import java.lang.*;
import java.io.*;

public class Day9 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
		
		String pal = scan.next();
		int c = 0, n = pal.length();
		for (int i = 0; i < n/2; i++) {
			if(pal.charAt(i) != pal.charAt(n-i-1))
				c++;
		}
		if(c == 0) {
			if(n%2 == 0)
				System.out.println("NO");
			else
				System.out.println("YES");
		} else {
			if(c == 1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		
        scan.close();
    }
}