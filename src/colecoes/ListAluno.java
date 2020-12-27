package colecoes;

import java.util.ArrayList;

public class ListAluno {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Bianca");
		lista.add(u1);
		lista.add(new Usuario("Caio"));
		lista.add(new Usuario("Bruna"));
		lista.add(new Usuario("Felipe"));
		lista.add(new Usuario("Melissa"));
		lista.add(new Usuario("Sofia"));
		
		System.out.println(lista.get(3));
		System.out.println(">>>> " + lista.remove(4));
		System.out.println(lista.remove(new Usuario("Bruna")));
		
		System.out.println("Tem? " + lista.contains(new Usuario("Marcelo")));
		
		for(Usuario u : lista) {
			System.out.println(u.nome.toString());
		}
		
	}

}
