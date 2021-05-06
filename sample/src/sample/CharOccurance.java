package sample;

import java.util.HashMap;

public class CharOccurance {

	public static void main(String[] args) {
		String str="aabbbcdddddefffffffff";
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(char c: str.toCharArray()) {
        	if(map.containsKey(c)) {
        		map.put(c, map.get(c)+1);
        	}
        	else {
        		map.put(c,1);
        	}
        }
        StringBuffer sb = new StringBuffer();
        for(char c: map.keySet()) {
        	sb.append(map.get(c)+ ""+c);
        }
        System.out.println(sb.toString());
	}

}
