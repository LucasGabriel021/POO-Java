package java01;

public class Fatorial {
	public static void main(String[] args) {
		int numero = 6, count;
		
		if(numero <= 1) {
			System.out.println("O fatorial deste número é 1!");
		} else {
			for(count = 1; numero > 1; numero = numero - 1) {
				count *= numero;
			}
			System.out.println("O fatorial do número informado é: " + count);
		}
	}
}
