package exemploClasseMetodo;

public class Cliente {
	String nome;
	String cpf;
	
	String pagar(float valor) {
		//
		return "TOKEN-XPTO";
	}
	
	boolean retirar(String token) {
		
		if(token=="TOKEN-XPTO") {
			return true;	
		}else {
			return false;
		}
		
	}
}
