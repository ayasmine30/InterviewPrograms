package sample;
import java.util.function.*;

public class ConsumerDemo {

	public static void main(String[] args) {
     Consumer<Integer> consumer = i -> System.out.println("Taking input and squaring:"+ i*i);		
     consumer.accept(5);
	}

}
