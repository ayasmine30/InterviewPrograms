package sample;
import java.util.function.*;

public class PredicateJoining {

	public static void main(String[] args) {
		Predicate<String> predlength= s -> s.length() > 5;
		System.out.println("The length is greather than 5:"+ predlength.test("Yasmine"));
        
		Predicate<String> predEven = s -> s.length() % 2 ==0;
		System.out.println("The length of string is even:"+ predEven.test("Salman"));
		
		System.out.println("the output of and is:"+ predlength.and(predEven).test("salman"));
		
		System.out.println("the output of or is:"+ predlength.or(predEven).test("Yasmine"));
		
		System.out.println("the output of negate is:"+ predlength.negate().test("Yasmine"));
	}

}
