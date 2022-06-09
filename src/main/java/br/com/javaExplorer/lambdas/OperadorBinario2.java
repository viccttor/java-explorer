package br.com.javaExplorer.lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import br.com.javaExplorer.lambdas.predicadoAndConsumer.Produto;

public class OperadorBinario2 {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Carteira",10000,0.1);
		
		BinaryOperator<Double> valorProduto = (n1,n2) -> n2 >= 0 ? n1 - (n1 * n2) : n1;
		UnaryOperator<Double> imposto = p -> p >= 2500 ? p + (p * 0.085) : p;
		UnaryOperator<Double> frete = p -> p >= 3000 ? p + 100 : p + 50;
		Function<Double, String> arredondarFormatar = p -> String.format("R$ %.2f", p).replace(".", ",");
		
		Double resultado = valorProduto
				.andThen(imposto)
				.andThen(frete)
				.apply(p1.getPRECO(), p1.getDESCONTO());
		
		
		Double valorP1 = valorProduto.apply(p1.getPRECO(), p1.getDESCONTO());
		UnaryOperator<Double> impostoValor = p -> p >= 2500 ? p * 0.085 : 0;
		UnaryOperator<Double> freteValor =	p -> p >= 3000d ? 100d : 50d;
		
		System.out.println(p1);
		System.out.println("\nValor Com Desconto: R$ " + valorP1);
		System.out.println("Valor do Imposto: R$ " + impostoValor.apply(valorP1));
		System.out.println("Valor do Frete: R$ " + freteValor.apply(resultado));
		System.out.println("\nTotal: " + arredondarFormatar.apply(resultado));
		
		
		
	}
}
