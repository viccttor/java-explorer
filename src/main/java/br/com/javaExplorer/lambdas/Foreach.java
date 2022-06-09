package br.com.javaExplorer.lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana","Bia","Gui", "Lia");
		
		System.out.println("Forma Tradicional...");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println();
		
		//Usando Lambdas
		
		System.out.println("Lambdas #01:");
		aprovados.forEach((nome)->{System.out.println(nome + "!!!");});
		System.out.println();
		aprovados.forEach((nome)->System.out.println(nome + "!"));
		
		System.out.println();
		System.out.println("Method Reference...");
		aprovados.forEach(System.out::println);
		System.out.println();

		System.out.println("Lambdas #02:");
		aprovados.forEach(nome-> meuImprimir(nome));
		aprovados.forEach(Foreach::meuImprimir);
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Meu nome é "+ nome);
	}
}
