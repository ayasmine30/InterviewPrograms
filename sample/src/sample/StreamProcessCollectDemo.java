package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProcessCollectDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        
        List<Integer> newFiltered= al.stream().filter(i -> i>=20).collect(Collectors.toList());
        newFiltered.forEach(x -> System.out.println(x));
	}

}
