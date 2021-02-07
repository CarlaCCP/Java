package PortugolJava;

import java.util.Scanner;

public class auxilioEmergencial {

	public static void main(String[] args) {
		// chefe de familia e 18 + recebe 600 reais
		// se for feminino o dobro
		
		Scanner leia = new Scanner(System.in);
		
		
		String nome;
		int anoNascimento;
		int idade = 0;
		char chefe;
		char genero;
		
	
		System.out.println(" Qual é o seu nome: ");
		nome = leia.next();
		System.out.println(" Qual é o ano do seu nascimento: ");
		anoNascimento = leia.nextInt();
		idade = 2020 - anoNascimento;
		System.out.println(" Você se idenifica em qual gênero? Digite F - Feminino ou M -Masculino ou X - Não Binário ");
		genero = leia.next().toUpperCase().charAt(0);
		System.out.println(" Você é chefe de família? Digite S ou N: ");
		chefe = leia.next().toUpperCase().charAt(0);
		
		
		if (chefe == 'S' && idade >18 && genero == 'M') {
			System.out.printf("Você recebe o 600 reais de auxilo emergencial");		
		}  
		
		else if (chefe == 'S' && idade >18 && genero == 'F') {
			System.out.printf("Você recebe o 1200 reais de auxilo emergencial");
		} 
		
		else {
			System.out.printf("Você não recebe o auxilo emergencial");
		} 
	
	}  
}
