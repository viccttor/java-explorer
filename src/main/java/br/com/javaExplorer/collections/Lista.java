package br.com.javaExplorer.collections;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		// Duas formas de adicionar a lista
		Usuario u1 = new Usuario("Victor");
		lista.add(u1);
		// Outra forma de adicionar a lista
		lista.add(new Usuario("Henrqiue"));
		lista.add(new Usuario("Silva"));
		lista.add(new Usuario("Morais"));
		lista.add(new Usuario("Carla"));
		lista.add(new Usuario("Ana"));
		lista.add(new Usuario("Kettilym"));
		
		for ( Usuario conteudoLista: lista) {
			System.out.print(" | " +conteudoLista.nome+" | "); // Note que ir� sair em ordem de introdu��o na lista
		}
		
		System.out.println("\n" + lista.get(2).nome); // para imprimir o nome, temos que colcoar o .nome, para que n�o seja impresso o objeto em si//m
		System.out.println("\n" + lista.get(2));//Note que foi impresso o Obejto. para eviar isso, deve-se colocar o m�todo toString. Na classe Usu�rio
		for ( Usuario conteudoLista: lista) {
			System.out.print(" | " +conteudoLista+" | "); // Note que usando o m�todo toString. Ir� sair de putra forma
		}
		
		//Remo��o da lista por indice e por obejto
		lista.remove(2);
		lista.remove(new Usuario("Ana"));
		System.out.println();
		for ( Usuario conteudoLista: lista) {
			System.out.print(" | " +conteudoLista+" | "); 
		}
		//Verificando se contem 
		System.out.println();
		System.out.println(lista.contains(new Usuario("Victor")));
		
	}

}
