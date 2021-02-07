package aplicacoes;

import java.util.Scanner;

public class QuartoPrograma {

	public static void main(String[] args) {
		
		// criar um teclado dentro do programa
		Scanner tec = new Scanner(System.in); // ira colocar para escrever
		
		String nome;
		int anoNascimento;
		int idade = 0;
		
		double salario;
		
		System.out.println("Escreva o nome do usuario: "); // é com +
		nome = tec.next();
		System.out.print("Escreva o ano de nascimento: "); // é com +
		anoNascimento = tec.nextInt();
		System.out.print("Escreva o salário: ");
		salario = tec.nextDouble();
		idade = 2020 - anoNascimento;
		
		System.out.printf("Oi %s, sua idade é %d em ano e seu salário %.2f é" , nome, idade, salario);
		tec.close(); // pode não funcionar se for legado e printf usa virgula

	}

}
