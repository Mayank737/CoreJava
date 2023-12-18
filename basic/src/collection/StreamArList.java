package collection;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamArList {
   

	public static void main(String[] args) {

		// From array
				String[] team = { "Ram", "Shyam", "Ajay", "Vijay" };
				Stream<String> stream1 = Arrays.stream(team);
				stream1.forEach(li -> System.out.println(li));

				// Stream can be created by a Collection
				List<String> items = Arrays.asList("One", "Two", "Three", "Three", "Four");

				Stream<String> stream = items.stream();

				// Print all elements of collection
				System.out.println("#Print all elements of collection");
				stream.forEach(e -> {
					System.out.println(e);
				});

				// From file
				//Stream<String> stream = Files.lines(Paths.get("marksheets.txt"));

				// Generator
				Random random = new Random();

				Stream<Integer> randomNumbers = Stream.generate(random::nextInt);
				//Stream<Double> randomNumbers = Stream.generate(Math::random);
				randomNumbers.limit(5).forEach(System.out::println);

				System.out.println("Input ends");

}
}