package br.com.javaExplorer.classeObjeto.jantar;

public class Comida {
	
	private String comida;
	private Double peso;
	
	public Comida(String comida, Double peso) {
		this.comida = comida;
		this.peso = peso;
	}

	public String getComida() {
		return comida;
	}

	public void setNome(String comida) {
		this.comida = comida;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
}
