package br.com.javaExplorer.classeObjeto;

public class Desafio {

	int a =3; // n�o pode mexer aqui
	static int b =5;
	
	public static void main(String[] args) {
		// S� pode mexer a partir daqui!
		
		Desafio p = new Desafio();
		System.out.println(p.a);
		 
		System.out.println(b);

	}
	
	
}
