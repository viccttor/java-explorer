package br.com.javaExplorer.lambdas;

import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = num -> num %2 == 0 ? "Par" : "Ímpar";
		System.out.println(parOuImpar.apply(32));
		System.out.println();
		
		Function<String, String> excalmacao = valor -> valor + " !!!";
		
		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
		String resutladoFinal = parOuImpar.andThen(oResultadoE).andThen(excalmacao).apply(39);
		System.out.println(resutladoFinal);
	}
}
