// Link to Question http://codeforces.com/problemset/problem/3/A

import java.util.*;
import java.lang.*;
import java.io.*;

public class Day13 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
		
        String from = scan.nextLine();
        String to = scan.nextLine();
        
        int a = from.charAt(0) - to.charAt(0);
        int c = a;
        if(a < 0) a*=-1;
        int b = from.charAt(1) - to.charAt(1);
        int d = b;
        if(b < 0) b*=-1;
        
        int moves = a>b ? a : b;
        int min = a>b ? b : a;
        System.out.println(moves);
        
        for(int i=0; i<min; i++) {
            if(c<0)
                System.out.print("R");
            else
                System.out.print("L");
            if(d<0)
                System.out.println("U");
            else
                System.out.println("D");
        }
        
        int k = moves - min;
        if(a>b) {
            for(int i=0; i<k; i++)
                if(c<0)
                    System.out.println("R");
                else
                    System.out.println("L");
        } else {
            for(int i=0; i<k; i++)
                if(d<0)
                    System.out.println("U");
                else
                    System.out.println("D");
        }
		
        scan.close();
    }
}