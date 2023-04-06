package java01;

public class TesteForEncadeado {
	public static void main(String[] args) {
		for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for(int numero = 1; numero <= 10; numero++) {
				System.out.print(numero + " X " + multiplicador + " = " + (multiplicador * numero));
				System.out.print("  ||  ");
			}
			System.out.println();
		}
	}
}
