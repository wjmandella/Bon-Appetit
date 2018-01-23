// My solution to the HackerRank problem "Bon Appetit."
// https://www.hackerrank.com/challenges/bon-appetit/problem

import java.util.Scanner;

public class BonAppetitApp {
    static int bonAppetit(int n, int k, int b, int[] ar) {
        // Complete this function
    	int result = 0;
    	int sum = 0;
    	for(int i = 0; i < ar.length; i++) {
    		if(i == k) {
    			continue;
    		}
    		sum += ar[i];
    	}
    	int annaShare = sum/2;
    	System.out.println("Sum = "+sum+", result = "+result);
     	
    	result = b - annaShare; 
    	return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of dinner items, n (integer 2 - 100000): ");
        int n = in.nextInt();
        System.out.print("Enter the kth item Anna does NOT eat (integer 1 to n): ");
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            System.out.print("Enter the cost of dinner item #"+(ar_i+1)+"(integer 0 - 10000): ");
            ar[ar_i] = in.nextInt();
        }
        System.out.print("Enter the amount Brian charged Anna (integer 0 to sum total): ");
        int b = in.nextInt();
        int result = bonAppetit(n, k, b, ar);
        if(result != 0) {
            System.out.println(result);
        }
        else {
        	System.out.println("Bon Appetit");
        }
        
        in.close();
    }
}
