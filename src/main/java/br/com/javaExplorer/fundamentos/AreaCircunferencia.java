package br.com.javaExplorer.fundamentos;
/**
 * @author viccttor
 * 
 */

/* Mini programa para realizar o c�lculo da �rea da circunfer�ncia
Fins educacionais*/

import java.util.Scanner;

public class AreaCircunferencia {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			double raio = 0;
			final double PI = 3.14;

			System.out.println("Programa para calcular � �rea da circinfer�ncia de um C�rculo \n ");
			System.out.print("Ditite o valor do raio: ");
			raio = scan.nextDouble();
			double area = PI * raio * raio;
			System.out.println(String.format("\nA �rea da circunfer�ncia � %.2f: ", area));
		} catch (Exception e) {
			System.out.println("Valor inv�lido!");
		}

	}

}
