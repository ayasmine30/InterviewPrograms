package sample;
import java.util.function.*;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> pred = i -> i>10;
        System.out.println("The given no is greather than 10:"+ pred.test(9));
	}

}
