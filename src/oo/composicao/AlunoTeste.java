package oo.composicao;

public class AlunoTeste {
	
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Caio");
		Aluno aluno2 = new Aluno("Bianca");
		Aluno aluno3 = new Aluno("Melissa");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2023");
		Curso curso3 = new Curso("React Native");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		
		for(Aluno aluno: curso1.alunos) {
			System.out.println("Aluno matriculado no curso " + curso3.nome + "...");
			System.out.println("Nome do aluno matriculado: " + aluno.nome);
			System.out.println();
		}
		//cursos do aluno e os alunos daquele curso
		System.out.println(aluno1.cursos.get(0).alunos);
		
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
			
		}
		
	}

}
