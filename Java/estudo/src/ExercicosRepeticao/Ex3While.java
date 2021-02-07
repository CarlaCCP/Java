package ExercicosRepeticao;

import java.util.Scanner;

public class Ex3While {
	public static void main(String[] args) {
		/*
		 * Solicitar a idade de várias pessoas e imprimir: 
		 * Total de pessoas com menos de 21 anos. 
		 * Total de pessoas com mais de 50 anos. 
		 * O programa termina quando idade for =-99. (WHILE)
		 * */
		Scanner leia = new Scanner(System.in);
		int idade; 
		int contadorMenos=0;
		int contadorMais = 0;
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		while (idade >=0) {
			if(idade < 21) {
				contadorMenos++;
			} else if (idade > 50) {
				contadorMais++;
			}
			System.out.println();
			System.out.print("Digite sua idade: "); // para sair do loop
			idade = leia.nextInt(); 
		}
				System.out.printf("Total de pessoas com menos de 21 anos é %d pessoas", contadorMenos);
				System.out.printf("\nTotal de pessoas com mais de 50 anos é %d pessoas", contadorMenos);
	}
}
