package sample;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		//String str1="silent";
		//String str2="listen";
		boolean anagram = true;
		System.out.println("Enter two strings");
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		String str2= scan.next();
		if(str1.length() != str2.length()) {
			anagram=false;	
		}
		else {
			char arr1[] = str1.toCharArray();
			char arr2[] = str2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			String sorted1 = new String(arr1);
			String sorted2 = new String(arr2);
			
			if(sorted1.equals(sorted2)) {
				anagram=true;
			}
		}
		
		if(anagram) {
			System.out.println("Given strings are anagram to ecah other");
		}
		else {
			System.out.println("Given strings are not anagram");
		}
	}

}
