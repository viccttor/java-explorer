package br.com.javaExplorer.lambdas.predicadoAndConsumer;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {

		Predicate<Produto> isCaro = prod -> prod.PRECO * (1-prod.DESCONTO) >= 750;
		
		Produto produto = new Produto("Notebook", 2582.22, 0.15);
		System.out.println(isCaro.test(produto));
		
	}

}
