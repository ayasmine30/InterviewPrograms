package sample;

public class reversingOfSentance {

	public static void main(String[] args) {
		String s="Java is programming language";
		StringBuffer reverse = new StringBuffer();
		String revers= "";
        String[] words= s.split(" ");
		/*
		 * for(String word: words) { String rev= new
		 * StringBuilder(word).reverse().toString(); revers = reverse.append(rev+
		 * " ").toString(); } System.out.println(revers);
		 */
        
        for(int i=words.length-1; i>=0; i--) {
        	revers = revers+words[i];
        }
        System.out.println(revers);
	}

}
