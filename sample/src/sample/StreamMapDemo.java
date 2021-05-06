package sample;

import java.util.ArrayList;

public class StreamMapDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        
        al.stream().map(i -> i*i).forEach(x -> System.out.println("Square of numbers are:"+ x));
	}

}
