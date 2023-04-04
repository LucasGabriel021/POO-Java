package lista01;

import java.util.Scanner;

public class CalcularMedia {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		String nome;
		double nota1, nota2, nota3, nota4;
		
		System.out.println("Informe o nome do estudante: ");
		nome = myObj.nextLine();
		// System.out.println(nome);
		
		System.out.println("Informe a primeira nota: ");
		nota1 = myObj.nextDouble();
		
		System.out.println("Informe a segunda nota: ");
		nota2 = myObj.nextDouble();
		
		System.out.println("Informe a terceira nota: ");
		nota3 = myObj.nextDouble();
		
		System.out.println("Informe a quarta nota: ");
		nota4 = myObj.nextDouble();
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
		double notaExame, mediaAluno, mediaRecalculada, somaMultiplicacao, somaPesos = 10;
		
		somaMultiplicacao = (nota1 * 2) + (nota2 * 3) + (nota3 * 4) + (nota4 * 1);
		mediaAluno = somaMultiplicacao / somaPesos;
		
		System.out.println("A média do aluno foi de: " + mediaAluno);
		
		if(mediaAluno >= 7.0) {
			System.out.println("O aluno foi aprovado!");
		} else if(mediaAluno < 5.0) {
			System.out.println("O aluno foi reprovado!");
		} else {
			System.out.println("Aluno em exame!");
			System.out.println("");
			
			System.out.println("Informe a nota do aluno em exame: ");
			notaExame = myObj.nextDouble();
			
			System.out.println("");
			System.out.println("Nota do aluno obtida no exame: " + notaExame);
			System.out.println("");
			
			mediaRecalculada = (notaExame + mediaAluno) / 2;
			
			if(mediaRecalculada >= 5.0) {
				System.out.println("O aluno foi aprovado!");
				System.out.println("Média do aluno após o exame: " + mediaRecalculada);
			} else {
				System.out.println("O aluno foi reprovado!");
				System.out.println("Média do aluno após o exame: " + mediaRecalculada);
			}
		}
		
	}
}
