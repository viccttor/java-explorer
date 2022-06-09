package br.com.javaExplorer.lambdas.calculo;

import java.util.function.BinaryOperator;

public class Calculo2 {

	public static void main(String[] args) {
		// não permite int -> Double
		// double -> Double
		
		BinaryOperator<Double> calculo = (x,y) -> { return x + y; };
		System.out.println(calculo.apply(5.0, 2.0));
		System.out.println();
		
		calculo = (x,y) ->  x * y; 
		System.out.println(calculo.apply(1D,3D));
		
	}

}
