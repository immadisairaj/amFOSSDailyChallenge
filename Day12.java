// Link for Question https://codeforces.com/problemset/problem/805/B

import java.util.*;
import java.lang.*;
import java.io.*;

public class Day12 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
		
        int n = scan.nextInt();
        for(int i=0; i<n; i++) {
            if(i%4 < 2)
                System.out.print("b");
            else
                System.out.print("a");
        }
		
        scan.close();
    }
}