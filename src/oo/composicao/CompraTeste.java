package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		Compra compra1 = new Compra();
		compra1.cliente = "Bianca";
//		compra1.itens.add(new Item("Caneta", 20, 2.50));
//		compra1.itens.add(new Item("Lapis", 10, 1.50));
//		compra1.itens.add(new Item("Borracha", 5, 3.50));
//		compra1.itens.add(new Item("Caderno", 3, 18.50));
		
		//relacionamento bidirecional
		compra1.adicionarItem(new Item("Caneta", 20, 2.50));
		compra1.adicionarItem(new Item("Lapis", 10, 1.50));
		compra1.adicionarItem(new Item("Borracha", 5, 3.50));
		compra1.adicionarItem(new Item("Caderno", 3, 18.50));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
		
		//so para mostrar a relacao bidirecional
		double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
		System.out.println("O total e " + total);
	}

}
