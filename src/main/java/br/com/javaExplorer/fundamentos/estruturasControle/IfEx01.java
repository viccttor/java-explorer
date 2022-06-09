package br.com.javaExplorer.fundamentos.estruturasControle;

/**
 * @author viccttor
 * 
 */

/*
 * Operações com IF e else
 * 
 * Programa para verificar se o número é par ou ímpar
 * 
 * OBS: Não utilziar o ";" na estrutura simples
 */

import javax.swing.JOptionPane;

public class IfEx01 {

	public static void main(String[] args) {

		String entrada = JOptionPane.showInputDialog("Digite um número: ");
		int num = Integer.parseInt(entrada);

		if (num % 2 == 0) {
			System.out.println("Número par!");
		} else {
			System.out.println("Número Ímpar!");
		}
	}

}
