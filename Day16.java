// Question Link http://codeforces.com/contest/946/problem/C

import java.util.*;
import java.lang.*;
import java.io.*;

public class Day16 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		char[] out = input.toCharArray();
		
		char character = 'a';
        for(int i=0; i<input.length(); i++) {
		    if(out[i] <= character) {
		        out[i] = character;
		        character++;
		    }
		    if(character > 'z') {
		        break;
		    }
        }
		    
        if(character > 'z') {
		    System.out.println(new String(out));
		} else {
		    System.out.println("-1");
		}
        
        scan.close();
    }
}