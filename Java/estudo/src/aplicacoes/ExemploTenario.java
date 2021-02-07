package aplicacoes;

import java.util.Scanner;

public class ExemploTenario {

	public static void main(String[] args) {
		String nomeAluno;
		char sexoAluno; // M - Masculino e F - Feminino
		int notaAnual; 
		String mensagem = " ";
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Nome: ");
		nomeAluno  = leia.next().toUpperCase();
		System.out.print("Digite o sexo: M - Masculino e F - Feminino: ");
		sexoAluno = leia.next().toUpperCase().charAt(0);
		System.out.print(" Digite a nota anual: ");
		notaAnual = leia.nextInt();
		System.out.println("----------------- DADOS DO ALUNO ----------------");
		System.out.println();

		
		if(sexoAluno == 'M') {
			System.out.printf("Oi prezado aluno %s, obrigado pelo acesso!! ", nomeAluno);
		} else if (sexoAluno == 'F') {
			System.out.printf("Oi prezada aluna %s, obrigada pelo acesso!! ", nomeAluno);
		} else {
			System.out.print(" Escreva uma letra válida, por favor");
		}
		
		// tenário  ()? positivo : nagativo
		mensagem = ((notaAnual < 5) && (sexoAluno == 'M')) ? "Reprovado" : "Aprovado";
		//mensagem =  ((notaAnual < 5) && (sexoAluno == 'F')) ? "Reprovada" : "Aprovada";
		System.out.printf("Oi %s você está %s ", nomeAluno , mensagem);
		leia.close();
		

	}

}
