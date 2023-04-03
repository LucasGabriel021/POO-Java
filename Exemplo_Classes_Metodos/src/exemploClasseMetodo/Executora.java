package exemploClasseMetodo;

import java.util.Arrays;

public class Executora {

	public static void main(String[] args) {

		int primeiroArray[] = new int[10];
		int[] segundoArray = {1,3,8,2};
		String nomes[] = new String[10];
		
		nomes[0] = "Diego";
		nomes[9] = "Diego";
		
		primeiroArray[0]=4;
		System.out.println(primeiroArray[0]);
		
		System.out.println(nomes[9]);
		System.out.println(nomes[9].length());

		segundoArray[0] = 10;
		System.out.println(segundoArray.length);

		for(int i=0;i<segundoArray.length;i++){
			System.out.println(segundoArray[i]);	
		}

		Arrays.sort(segundoArray);
		
		System.out.println("------ORDENADO--------");
		
		for(int numero : segundoArray){
			System.out.println(numero);
		}		
		
		// -----------------
		
		System.out.println("Exemplo classes e atributos");

		Carro fusca = new Carro();
		
		fusca.cor = "Amarelo";
		fusca.modelo = "Fusca";
		fusca.ano = 1994;
		
		System.out.println("Cor: " + fusca.cor);
		
		// -----------------

		System.out.println("Exemplo classes e métodos");
		
		Calcula calcula = new Calcula();
		int soma = calcula.soma(10, 5);
		System.out.println("Soma: " + soma);

		// -----------------		
		
		Cliente cliente = new Cliente();

		cliente.cpf = "999.888.777-10";
		cliente.nome = "João Silva";
		
		System.out.println("Utilize o token \npara retirada: " + cliente.pagar(50));
		System.out.println(cliente.retirar("TOKEN"));		
		System.out.println(cliente.retirar("TOKEN-XPTO"));

		// -----------------
		
		Cliente2 clientes[] = new Cliente2[2];
		clientes[0] = new Cliente2("Diego", "999");
		clientes[1] = new Cliente2("Maria", "888");
		
		System.out.println(clientes[0].nome);
		
		for(Cliente2 ocliente : clientes) {
			System.out.println("Cliente: " + ocliente.nome);
		}
	}
}
