package sample;

public class WithoutLengthMetd {

	public static void main(String[] args) {
		String s1= "Yasu";
		int length = 0;
		for(char c: s1.toCharArray()) {
		length++;	
		}
        System.out.println("The length of given string is : "+ length);
	}

}
