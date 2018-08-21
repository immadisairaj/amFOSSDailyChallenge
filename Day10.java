// Link to Question https://www.codechef.com/ISCC2018/problems/T21

import java.util.*;
import java.lang.*;
import java.io.*;

public class Day10 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
		
        int t = scan.nextInt();
        scan.nextLine();
        while (t-- > 0) {
            long m=0 , n=0;
            String x = scan.next();
            String y = scan.next();
            for(int i=0; i<x.length(); i++)
                m+= Long.valueOf(x.charAt(i));
            for(int i=0; i<y.length(); i++)
                n+= Long.valueOf(y.charAt(i));
            long a = m/3, b = n/3;
            long out = (m-(a*3))*(n-(b*3));
            System.out.println(out-(out/3)*3);
        }
		
        scan.close();
    }
}