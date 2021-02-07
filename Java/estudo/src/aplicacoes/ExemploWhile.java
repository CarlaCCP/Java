package aplicacoes;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade;
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		while (idade >=1) {
			System.out.print("A sua idade é: " + idade);
			if(idade >= 18) {
				System.out.print("\nVocê é maior de idade");
			} else {
				System.out.print("\nVocê é menor de idade");
			}
			System.out.println();
			System.out.print("Digite sua idade: "); // para sair do loop
			idade = leia.nextInt(); 
		}
	}

}
