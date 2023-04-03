package lista01;

import java.util.Scanner;

public class CalculaFatorial {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Descobrir o fatorial de um número");
		System.out.println(" ");
		System.out.println(" ");
		
		int numero, fatorial, count;
		
		System.out.println("Informe o número a seguir para o cálculo do fatorial: ");
		numero = myObj.nextInt();
		
		if(numero == 0 || numero == 1) {
			System.out.println("O fatorial do número " + numero + " é 1!");
		} else {
			for(fatorial = 1; numero > 1; numero = numero - 1) {
				fatorial *= numero;
			}
			System.out.println("O fatorial do número " + numero + " é " + fatorial);
		}
	}
}
