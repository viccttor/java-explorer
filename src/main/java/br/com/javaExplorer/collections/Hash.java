package br.com.javaExplorer.collections;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {

		HashSet<Usuario> usuario = new HashSet<>();
		usuario.add(new Usuario ("Victor"));
		usuario.add(new Usuario ("Kettilym"));
		usuario.add(new Usuario ("Dry"));
		
		System.out.println(usuario.contains(new Usuario("Dry")));
		
	}

}
