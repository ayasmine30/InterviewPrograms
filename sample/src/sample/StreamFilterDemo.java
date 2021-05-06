package sample;
import java.util.ArrayList;
import java.util.stream.*;

public class StreamFilterDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(25);
        al.add(50);
        al.add(75);
        al.add(100);
        al.add(200);
        
        al.stream().filter(i -> i%2 == 0).forEach(x -> System.out.println(x));
	}

}
