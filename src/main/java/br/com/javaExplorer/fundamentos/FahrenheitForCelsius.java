package br.com.javaExplorer.fundamentos;
/**
 * @author viccttor
 */

/*
 * Mini programa para realizar o c�lculo de convers�o de Fahrenheit para Celsius
Fins educacionais
*/

import java.util.Scanner;

public class FahrenheitForCelsius {
	
	public static void main(String[] args) {
		
		try{
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			double temp = 0;
			
			System.out.print("Digite a temperatura em Fahrenheit que deseja converter para Celsius: ");
			temp = scan.nextDouble();
			
			final double FORM = (temp-32)/1.8;
			double celsius = FORM;
			
			System.out.println("\nTemperatura �:  \n");
			System.out.println(String.format("Fahrenheit: %.2f�F \t Celsius: %.2f�C", temp, celsius)  );	
		} catch (Exception e) {
			System.out.println("Valor inv�lido!");
		}
		
		
	}
}
