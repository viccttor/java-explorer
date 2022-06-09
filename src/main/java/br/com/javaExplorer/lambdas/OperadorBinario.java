package br.com.javaExplorer.lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		BinaryOperator<Double> media = ( n1, n2) -> (n1+n2) / 2;
		
		System.out.println("Notas: 5 e 7");
		
		System.out.println("BinaryOperator - Media: " + media.apply(5d, 7d));
		
		BiFunction<Double, Double, String> resultado = (n1,n2) -> (n1+n2) / 2 >= 7 ? "Aprovado" : "Reprovado";
		System.out.println("BiFunction - " + resultado.apply(5d, 7d));
		
		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
		System.out.println("Média Usando Composição de Funções: " + media.andThen(conceito).apply(5d, 7d));
		
	}

}
