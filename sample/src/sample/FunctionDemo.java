package sample;
import java.util.function.*;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<Integer, Integer> square = i -> i*i;
        System.out.println("The square of 5 is:"+ square.apply(5));
	}

}
