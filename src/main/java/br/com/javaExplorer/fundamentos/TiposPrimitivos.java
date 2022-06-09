package br.com.javaExplorer.fundamentos;

/**
 * @author viccttor
 */

/*
 * Tipos primitivos
 * 
 */

public class TiposPrimitivos {

	public static void main(String[] args) {
		/*
		 * Valores Padrão
		 * 
		 * byte, short, int, long -> 0;
		 * float, double -> 0.0;
		 * char -> '\u0000'
		 * boolean -> false
		 * 
		 */ 
		
		// Informações do funcionáro
 
		// Tipos númericos inteiros
		byte anosDeEmpresa = 21;
		System.out.println(anosDeEmpresa);
		short numeroDeVoos = 129;
		System.out.println(numeroDeVoos);
		int id = 56998;
		System.out.println(id);
		long pontosAcumulados = 313423111L;
		// Por que o "L", para indicar que e variável é do tipo long. Usar o L maisculo
		// para não confundir com inteiro
		System.out.println(pontosAcumulados);

		float salario = 11445.44F;
		System.out.println(salario);
		// Por que o "F" no final? para indicar o java que é do tipo Float. E por que?
		// Porque o padrão é do tipo double.
		double batidasDePonto = 31221112;
		System.out.println(batidasDePonto);
		// Tipo bolleano
		boolean estadoDeFerias = false;
		System.out.println(estadoDeFerias);
		// Tipo de caractere
		char status = 'A'; // ativo, lembrando que não pode colocar mais de um caractere
		System.out.println(status);

		boolean teste = (2 > 9);
		System.out.println(teste);

	}

}
