package br.com.javaExplorer.fundamentos;

/**
 * @author viccttor
 */

/*
 * Convers�o String para double
 * 
*/

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) { 
		
		// OBS: Nem toda String pode ser convertido para n�mero

		String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor: ");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo valor: ");
		System.out.println(valor1 + valor2);
		// Note que ele juntou os valores ao inv�s de soma-los.

		// Convertendo para n�mero
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double soma = numero1 + numero2;
		System.out.printf("A soma dos valores inseridos s�o: %.2f", soma);
		
	}

}
