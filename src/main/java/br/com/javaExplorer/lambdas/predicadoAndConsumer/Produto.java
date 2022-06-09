package br.com.javaExplorer.lambdas.predicadoAndConsumer;

public class Produto {
	
	final String NOME;
	final double PRECO;
	final double DESCONTO;
	
	public Produto(String nOME, double preco, double desconto) {
		this.NOME = nOME;
		this.PRECO = preco;
		this.DESCONTO = desconto;
	}

	@Override
	public String toString() {
		return "Produto " + NOME + " R$ "+ PRECO ;
	}

	public String getNOME() {
		return NOME;
	}

	public double getPRECO() {
		return PRECO;
	}

	public double getDESCONTO() {
		return DESCONTO;
	}
	
	

}
