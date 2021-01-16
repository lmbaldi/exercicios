package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class OutrosMetodos {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Bianca", 9.5);
		Aluno a2 = new Aluno("Caio", 9.0);
		Aluno a3 = new Aluno("Bruna", 6.5);
		Aluno a4 = new Aluno("Felipe", 4.5);
		Aluno a5 = new Aluno("Caio", 9.0);
		Aluno a6 = new Aluno("Sofia", 6.0);
		Aluno a7 = new Aluno("Bento", 3.5);
		Aluno a8 = new Aluno("Felipe", 4.5);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		Predicate<Aluno> aprovado = a -> a.nota >=7;
		
		System.out.println("distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
			.distinct()
			.skip(2)
			.limit(2)
			.forEach(System.out::println);
		
		System.out.println("\ntakeWhile");
		alunos.stream()
			.distinct()
			.takeWhile( a -> a.nota >=7)
			.forEach(System.out::println);

	}

}
