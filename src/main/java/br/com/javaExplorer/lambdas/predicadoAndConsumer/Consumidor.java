package br.com.javaExplorer.lambdas.predicadoAndConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.NOME);

		Produto p1 = new Produto("Caneta", 3.34, 0.09);
		Produto p2 = new Produto("lapiz", 2.34, 0.09);
		Produto p3 = new Produto("Caderno", 22.34, 0.09);
		Produto p4 = new Produto("Borracha", 0.34, 0.09);
		Produto p5 = new Produto("Corretivo", 1.34, 0.09);
		imprimir.accept(p1);
		System.out.println();
		
		List<Produto> produtos =  Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimir);
		System.out.println();
		
		produtos.forEach(p -> System.out.println(p.PRECO));
		produtos.forEach(System.out:: println);
	}
	
	
}
