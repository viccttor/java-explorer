package br.com.javaExplorer.lambdas.calculo;


public class execut {

	public static void main (String[] args) {
		// Método normal 
		
		Calculo calculo = new Somar();
		System.out.println(calculo.executar(5, 2));
		calculo = new Multiplicar();
		System.out.println(calculo.executar(5, 2));
		System.out.println();
		// Funções Lambdas
		
		Calculo soma = (x,y) -> { return x + y; };
		Calculo subtracao = (x,y) -> { return x - y; };
		Calculo multiplica = (x,y) ->  x * y; ;
		Calculo dividir = (x,y) ->  x / y; ;
		
		System.out.println(soma.executar(1,3));
		System.out.println(multiplica.executar(1,3));
		System.out.println(String.format("%.2f", dividir.executar(1,3)));
		System.out.println(subtracao.executar(1,3));
		
		System.out.println();
		System.out.println(calculo.lega());
		System.out.println(Calculo.massa());
	}

}
