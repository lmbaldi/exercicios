package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Bianca", 9.5);
		Aluno a2 = new Aluno("Caio", 9.0);
		Aluno a3 = new Aluno("Bruna", 6.5);
		Aluno a4 = new Aluno("Felipe", 7.5);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >=7;
		Predicate<Aluno> reprovado = aprovado.negate();
		
		System.out.println(alunos.stream().allMatch(aprovado));//false
		System.out.println(alunos.stream().anyMatch(aprovado));//true
		System.out.println(alunos.stream().noneMatch(reprovado));//false
		
	}

}
