package oo.composicao;

public class Item {

	String nome;
	int quantidade;
	double preco;
	//relacionamento bidirecional
	Compra compra;
	
	public Item(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
}
