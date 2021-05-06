package sample;

public class MaxOccuranceChar {

	public static void main(String[] args) {
		String s="Hai Yasmineaa aaaa";
		int charCount = 0;
        for(char c: s.toCharArray()) {
        	if(c=='a') {
        		charCount++;	
        	}
        }
        System.out.println("the occurance of character 'a' in string madame is:"+ charCount);
	}

}
