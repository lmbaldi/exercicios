package generics;

public class ParesTest {
	
	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Bianca");
		resultadoConcurso.adicionar(2, "Caio");
		resultadoConcurso.adicionar(3, "Bruna");
		resultadoConcurso.adicionar(4, "Felipe");
		resultadoConcurso.adicionar(5, "Melissa");
		resultadoConcurso.adicionar(5, "Sofia");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(2));
		
	}

}
