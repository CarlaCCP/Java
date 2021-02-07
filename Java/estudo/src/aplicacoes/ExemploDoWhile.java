package aplicacoes;

import java.util.Scanner;

public class ExemploDoWhile {
	public static void main(String[] args) { 
		
Scanner leia = new Scanner(System.in);
		
		int idade;
		System.out.print("\nDigite sua idade: ");
		idade = leia.nextInt();
		
		do  {
			
			System.out.print("\nA sua idade é: " + idade);
			if(idade >= 18) {
				System.out.print("\nVocê é maior de idade");
			} else {
				System.out.print("\nVocê é menor de idade");
			}
			System.out.print("\nDigite sua idade: ");
			idade = leia.nextInt();
			
		} while (idade >=1);
	}
}
