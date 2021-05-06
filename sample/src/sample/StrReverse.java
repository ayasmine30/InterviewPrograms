package sample;

import java.util.Scanner;

public class StrReverse {

	public static void main(String[] args) {
		String old,rev=" ";
		System.out.println("Enter the string to be reversed:");
		Scanner scan = new Scanner(System.in);
        old = scan.next();
        for(int i=old.length()-1; i>=0; i--) {
        	rev= rev+old.charAt(i);
        }
        System.out.println("The reversed string is:"+ rev);
	}

}
