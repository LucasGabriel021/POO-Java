package exemploClasseMetodo;

public class Cliente2 {
	String nome;
	String cpf;
	
	public Cliente2(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	String pagar(float valor) {
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
