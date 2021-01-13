package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
	
	//tem que implementar um comparator

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Bianca", 9.5);
		Aluno a2 = new Aluno("Caio", 9.0);
		Aluno a3 = new Aluno("Bruna", 6.5);
		Aluno a4 = new Aluno("Felipe", 4.5);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
			if(aluno1.nota > aluno2.nota) return 1;
			if(aluno1.nota < aluno2.nota) return -1;
			//notas iguais
			return 0;
		};
		
		Comparator<Aluno> piorNota = (aluno1, aluno2) -> {
			if(aluno1.nota > aluno2.nota) return -1;
			if(aluno1.nota < aluno2.nota) return 1;
			//notas iguais
			return 0;
		};
		
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(piorNota).get());
		
		System.out.println(alunos.stream().max(piorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());
		
	}

}
