package br.com.javaExplorer.lambdas.calculo;

public interface Calculo {

	public abstract double executar( double a, double b);
	
	
	default String lega() {
		return "Legal";
	}
	
	static String massa() {
		return "Massa";
	}
}
