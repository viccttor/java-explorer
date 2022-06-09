package br.com.javaExplorer.fundamentos;

/**
 * @author viccttor
 */

/*
 * Conversão String para double
 * 
*/

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) { 
		
		// OBS: Nem toda String pode ser convertido para número

		String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor: ");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo valor: ");
		System.out.println(valor1 + valor2);
		// Note que ele juntou os valores ao invés de soma-los.

		// Convertendo para número
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double soma = numero1 + numero2;
		System.out.printf("A soma dos valores inseridos são: %.2f", soma);
		
	}

}
