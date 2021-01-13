package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Bianca", 9.2);
		Aluno a2 = new Aluno("Caio", 9.0);
		Aluno a3 = new Aluno("Bruna", 5.2);
		Aluno a4 = new Aluno("Felipe", 9.1);
		Aluno a5 = new Aluno("Melissa", 8.2);
		Aluno a6 = new Aluno("Sofia", 5.0);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> saudacaoAprovado = a -> "Parabéns " + a.nome + "! Você foi aprovado(a)!";
		
		alunos.stream()
			.filter(aprovado)
			.map(saudacaoAprovado)
			.forEach(System.out::println);

	}

}

