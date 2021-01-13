package streams;

public class Aluno {
	
	final String nome;
	final double nota;
	final boolean bomcomportamento;
	
	public Aluno(String nome, double nota) {
		this(nome, nota, true);
	}
	
	public Aluno(String nome, double nota, boolean bomComportamento) {
		this.nome = nome;
		this.nota = nota;
		this.bomcomportamento = bomComportamento;
	}
	

}
