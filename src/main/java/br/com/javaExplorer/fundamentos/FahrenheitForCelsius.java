package br.com.javaExplorer.fundamentos;
/**
 * @author viccttor
 */

/*
 * Mini programa para realizar o cálculo de conversão de Fahrenheit para Celsius
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
			
			System.out.println("\nTemperatura é:  \n");
			System.out.println(String.format("Fahrenheit: %.2fºF \t Celsius: %.2fºC", temp, celsius)  );	
		} catch (Exception e) {
			System.out.println("Valor inválido!");
		}
		
		
	}
}
