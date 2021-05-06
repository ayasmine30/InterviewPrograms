package sample;
import java.util.function.*;
public class LambdaDemo {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> biconsumer = (a, b) -> System.out.println(a+b);
		biconsumer.accept(10, 5);
	}

}
