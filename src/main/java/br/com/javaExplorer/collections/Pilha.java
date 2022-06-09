package br.com.javaExplorer.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("Viagem ao Centro da Terra");
		livros.push("Pai Rico, Pai Pobre");
		livros.push("Algebra da Felicidade");
		
		System.out.println(livros.peek());
		System.out.println(livros.peek());
		System.out.println(livros.peek());
		
		System.out.println();
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());

	}

}
