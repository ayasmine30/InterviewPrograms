package sample;

import java.util.stream.Stream;

public class StreamOfDemo {

	public static void main(String[] args) {
		String[] names= {"Yasmine", "Salman", "Ameer", "Saleem"};
		Stream.of(names).filter(x -> x.length()>5).forEach(x-> System.out.println(x));

	}

}
