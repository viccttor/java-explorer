package br.com.javaExplorer.fundamentos.estruturasControle;

/**
 * @author viccttor
 * 
 */

/*
 * Opera��es com IF e else
 * 
 * Programa para verificar se o n�mero � par ou �mpar
 * 
 * OBS: N�o utilziar o ";" na estrutura simples
 */

import javax.swing.JOptionPane;

public class IfEx01 {

	public static void main(String[] args) {

		String entrada = JOptionPane.showInputDialog("Digite um n�mero: ");
		int num = Integer.parseInt(entrada);

		if (num % 2 == 0) {
			System.out.println("N�mero par!");
		} else {
			System.out.println("N�mero �mpar!");
		}
	}

}
