package br.com.javaExplorer.classeObjeto.jantar;

public class Jantar {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Victor", 78.0);
		
		Comida c1 = new Comida("Feijão", 0.500);
		Comida c2 = new Comida("Arroz", 0.300);
		Comida c3 = new Comida("Carne", 0.200);
		
		System.out.println(p1.getPeso());
		
		Pessoa p2 = new Pessoa("Henrique", 70.0);
		System.out.println(p2.getPeso());
		
		// Usando o método comer e apresentar da classe pessoa
		
		p1.comer(c1);
		p1.comer(c2);
		p1.comer(c3);
		p1.apresentar(p2);
		
		p2.comer(c1);
		p2.comer(c2);
		p2.comer(c3);
		p2.apresentar(p2);
	}

}
