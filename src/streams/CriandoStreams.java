package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<String> print =  System.out::print;
		
		Stream<String> langs = Stream.of("PHP ", "Java ", "Dart ", "Kotlin\n ");
		langs.forEach(print);
		
		String[] moreLangs = {"Python ", "C++ ", "Go ", "C#\n" };
		Stream.of(moreLangs).forEach(print);
		Arrays.stream(moreLangs).forEach(print);
		Arrays.stream(moreLangs, 1, 2).forEach(print);
		Arrays.stream(moreLangs, 2, 4).forEach(print);
		
		List<String> otherLangs = Arrays.asList("Perl ", "Javascript ", "Lua\n");
		otherLangs.stream().forEach(print);
		otherLangs.parallelStream().forEach(print);
		
	}

}
