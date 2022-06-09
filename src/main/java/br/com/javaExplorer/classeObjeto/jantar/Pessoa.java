package br.com.javaExplorer.classeObjeto.jantar;

public class Pessoa {
	private String nome;
	private Double peso;
	
	public Pessoa(String nome, Double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	public void comer(Comida comida) {
		if (comida.getPeso() != null ) {
			this.peso = peso + comida.getPeso();
		}
	}
	
	public void apresentar(Pessoa pessoa) {
		System.out.println(String.format("Olá eu sou o %s e estou com %.2f quilos", nome,peso));
	}
}
