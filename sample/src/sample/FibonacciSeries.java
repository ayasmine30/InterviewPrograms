package sample;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1;
		System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print(a+ " "+b);
        for(int i=2; i<n; i++) {
        	int c= a+b;
        	System.out.print(" "+c);
        	a=b;
        	b=c;
        }
	}

}