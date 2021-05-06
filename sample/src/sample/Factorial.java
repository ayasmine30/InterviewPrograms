package sample;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact=1,n;
		System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for(int i=1;i<=n;i++) {
        	fact = fact*i;
        }
        System.out.println(fact);
	}

}
