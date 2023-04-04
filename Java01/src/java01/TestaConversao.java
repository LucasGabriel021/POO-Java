package java01;

public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1270.50;
		
		// Basicamente na variável abaixo estamos forçando uma conversão de double para int, 
		//isso pq um numero int não aceita um doble, todavia um double aceita um int.
		int valor = (int) salario;
	}
}
