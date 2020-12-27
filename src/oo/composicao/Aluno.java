package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	final String nome;
	//lista constante foi instanciada na memoria apontando sempre para o mesmo endereco de memoria,nao pode ser alterada a referencia
	//nao podemos instanciar para uma nova lista
	//a lista pode ser modificada
	//cada aluno criado tera sua propria lista de cursos 
	final List<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso){
		this.cursos.add( curso);
		curso.alunos.add(this);
	}
	
	Curso obterCursoPorNome(String nome) {
		
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}

	
	public String toString() {
		return nome;
	}
}
