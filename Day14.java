// Link for Question https://www.codechef.com/problems/ORMATRIX

import java.util.*;
import java.lang.*;
import java.io.*;

public class Day14 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		while(t-- > 0) {
		    int n = scan.nextInt();
		    int m = scan.nextInt();
		    
		    int[][] arr = new int[n][m];
		    int[] col = new int[n];
		    int[] row = new int[m];
		    boolean zero = true;
		    
		    scan.nextLine();
		    for(int i=0; i<n; i++) {
		        String k = scan.nextLine();
		        for(int j=0; j<m; j++) {
		            arr[i][j] = Character.getNumericValue(k.charAt(j));
		            if(arr[i][j] != 0) {
		                col[i] = 1;
		                row[j] = 1;
		                zero = false;
		            }
		        }
		    }
		    
		    if(zero) {
		        for(int i=0; i<n; i++) {
		            for(int j=0; j<m; j++)
		                System.out.print("-1 ");
		            System.out.println();
		        }
		    } else {
		        for(int i=0; i<n; i++) {
		            for(int j=0; j<m; j++) {
		                if(arr[i][j] == 1)
		                    System.out.print("0 ");
		                else {
		                    if(col[i] == 1 || row[j] == 1)
		                        System.out.print("1 ");
		                    else
		                        System.out.print("2 ");
		                }
		            }
		            System.out.println();
		        }
		    }
		}
		
		scan.close();
    }
}