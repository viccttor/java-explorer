package br.com.javaExplorer.lambdas;

import java.util.function.UnaryOperator;

public class OperadorUniario {
	public static void main(String[] args) {
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> xDois = n -> n * 2;
		UnaryOperator<Integer> quadrado = n -> n * n;
		
		Integer resultado = maisDois.andThen(xDois).andThen(quadrado).apply(2);
		
		System.out.println("Resultado Num 2: " + resultado);
		
		Integer resultado2 = maisDois.compose(xDois).compose(quadrado).apply(2);
		System.out.println("Resultado2 Num 2: " + resultado2);
	}
}
