package fundamentos.oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 2.5, 30);
		compra1.adicionarItem(new Produto("Notebook", 1897.99), 2);
		
		Compra compra2 = new Compra();
		compra1.adicionarItem("Caderno", 12.5, 10);
		compra1.adicionarItem(new Produto("Impressora", 897.99), 1);
		
		Cliente cliente = new Cliente("Bianca Cristina");
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
		

	}

}
