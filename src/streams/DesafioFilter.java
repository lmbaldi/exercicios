package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Lapis", 1.99, 0.12, 30);
		Produto p2 = new Produto("Notebook", 3500, 0.31, 0);
		Produto p3 = new Produto("Caderno", 19.99, 0.12, 10);
		Produto p4 = new Produto("Caneta",3.99, 0.12, 30);
		Produto p5 = new Produto("Monitor", 880.99, 0.40, 0);
		Produto p6 = new Produto("Gratife 0.7", 12.99, 0.12, 5);
		Produto p7 = new Produto("Impressora", 903.50, 0.45, 0);
		Produto p8 = new Produto("Cola bastao", 3.85, 0.12, 15);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8);
		
		Predicate<Produto> superPromocao = p -> p.desconto >= 0.30;
		Predicate<Produto> freteGratis = p -> p.valorFrete == 0;
		Predicate<Produto> precoRelevante = p -> p.preco >= 500;
		
		Function<Produto, String> chamadaPromocional = p -> "Aproveite! " + p.nome + " por R$ " + p.preco;
		
		produtos.stream()
			.filter(superPromocao)
			.filter(freteGratis)
			.filter(precoRelevante)
			.map(chamadaPromocional)
			.forEach(System.out::println);
	}

}
