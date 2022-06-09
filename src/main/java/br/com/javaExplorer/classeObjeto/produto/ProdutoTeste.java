package br.com.javaExplorer.classeObjeto.produto;

public class ProdutoTeste {
	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 3466.78);
		System.out.println(p1.nome);
		System.out.println(p1.precoComDesconto());

		Produto p2 = new Produto();
		p2.nome = "Caneta Vermelha";
		p2.preco = 2;
		System.out.println(p2.nome);
		System.out.println(p2.precoComDesconto());

	}
}
