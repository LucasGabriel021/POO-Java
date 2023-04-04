package lista01;

import java.util.Scanner;

public class ScannerTipos {
	public static void main(String[] args) {
		
		// Variáeveis
		int inteiro;
		float flt;
		double dbl;
		char letra;
		boolean tf;
		String nome;
		
		// Para utilizar a classe deve-se criar um objeto para poder utilizar seus métodos;
		Scanner myObj = new Scanner(System.in); // Create Object
		
		System.out.println("Informe um número inteiro: ");
		inteiro = myObj.nextInt(); // Aramazena o dado na variável.
		
		System.out.println("Informe um número float: ");
		flt = myObj.nextFloat(); // Aramazena o dado na variável.

		System.out.println("Informe um número double: ");
		dbl = myObj.nextDouble(); // Aramazena o dado na variável.
		
		System.out.println("Informe uma letra: ");
		letra = myObj.next().charAt(0); // Aramazena o dado na variável.
		
		System.out.println("Informe uma boolean: ");
		tf = myObj.nextBoolean(); // Aramazena o dado na variável.
		
		System.out.println("Informe um nome: ");
		myObj.nextLine();
		nome = myObj.nextLine(); // Aramazena o dado na variável.
		
		
		System.out.println(" ");
		System.out.println("-----");
		System.out.println("  ");
		
		System.out.println("Inteiro informado: " + inteiro);
		System.out.println("Double informado: " + dbl);
		System.out.println("Float informado: " + flt);
		System.out.println("Letra informado: " + letra);
		System.out.println("Boolean informado: " + tf);
		System.out.println("Nome informado: " + nome);
	}
}
