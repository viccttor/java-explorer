package br.com.javaExplorer.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Ofter e ADD -> Adicionam elementos a fila. A diferença é que o comportamento
		// ocorre quando a fila está cheia"
		fila.add("Victor");//Lança uma exceção
		fila.offer("Henrique"); //Retorna falso
		fila.offer("Kettilym"); 
		fila.add("Adriely");
		fila.offer("Fabi"); 
		fila.add("Silva");
		
		// Peak e ekemente -> Obter o próximo elemento da fila sem remover o mesmo
		// Diferença ocorre quando a fila está vazia!
		System.out.println(fila.peek());//Retorna falso
		System.out.println(fila.peek());
		System.out.println(fila.element());//Lança uma exceção
		
		//fila.size(); Verifica o tamanho
		// fila.clear(); limpar a fila
		// fila.isEmpty(); Saber se a fila está vazia
		
		// O poll retorna o primeiro elemento da fila, removendo o mesmo
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	
	}

}
