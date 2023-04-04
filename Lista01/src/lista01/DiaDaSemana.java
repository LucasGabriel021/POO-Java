package lista01;

import java.util.Scanner;

public class DiaDaSemana {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		int diaDaSemana;
		
		System.out.println("Informe um número de 1 a 7 para saber qual é o dia da semana: ");
		diaDaSemana = myObj.nextInt();
		// System.out.println(diaDaSemana);

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Dia da semana: ");
		
		switch(diaDaSemana) {
			case 1: 
				System.out.println("Domingo!");
				break;
			case 2: 
				System.out.println("Segunda-Feira!");
				break;
			case 3: 
				System.out.println("Terça-Feira!");
				break;
			case 4: 
				System.out.println("Quarta-Feira!");
				break;
			case 5: 
				System.out.println("Quinta-Feira!");
				break;
			case 6: 
				System.out.println("Sexta-Feira!");
				break;
			case 7: 
				System.out.println("Sábado!");
				break;
			default:
				System.out.println("Este número informado não é valido!");
		}
	}
}

