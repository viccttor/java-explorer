package br.com.javaExplorer.classeObjeto;

public class Desafio {

	int a =3; // não pode mexer aqui
	static int b =5;
	
	public static void main(String[] args) {
		// Só pode mexer a partir daqui!
		
		Desafio p = new Desafio();
		System.out.println(p.a);
		 
		System.out.println(b);

	}
	
	
}
