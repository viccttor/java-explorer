package br.com.javaExplorer.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		Set<String> lista = new HashSet<>(); // Desta forma, não está ordenada
		lista.add("Nome");
		lista.add("Sobrenome");
		lista.add("Victor");
		
		System.out.println(lista);
		
		for (String conteudo: lista) {
			System.out.println(conteudo);//Como o HASHSET não é ordenado, não sai na ordem de inserção
		}
		
		System.out.println("\n\n");
		
		
		Set<String> lista2 = new TreeSet<>();//O TREESET é por ordem de inserção, por isso sairá ordenado
		lista2.add("Nome");
		lista2.add("Sobrenome");
		lista2.add("Victor");
		
		System.out.println(lista2);
		
		for (String conteudo: lista2) {
			System.out.println(conteudo);
		}

		System.out.println("\n\n");
		
		
		SortedSet<String> lista3 = new TreeSet<>();//O SORTEDSET é ordenado, podendo ser definido o tipo de ordenação
		lista3.add("Nome");
		lista3.add("Sobrenome");
		lista3.add("Victor");
		
		System.out.println(lista3);
		
		for (String conteudo: lista3) {
			System.out.println(conteudo);
		}
		
		System.out.println("\n\n");
		
		
		TreeSet<String> lista4 = new TreeSet<>();//O TREESET é por ordem de inserção, por isso sairá ordenado
		lista4.add("Nome");
		lista4.add("Sobrenome");
		lista4.add("Victor");
		
		System.out.println(lista4);
		
		for (String conteudo: lista4) {
			System.out.println(conteudo);
		}
		

	}

}
