package ExercicosRepeticao;

import java.util.Scanner;

public class Ex5DoWhile {
/*Crie um programa que leia um número 
	do teclado até que encontre um número igual a zero.
	No final, mostre a soma dos números digitados.(DO...WHILE)*/
	
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int num; 
		int soma = 0;
		
		System.out.print("Digite um número: ");
		num= leia.nextInt();
		 do {
			 System.out.print("Digite um número: ");
			num= leia.nextInt();
			 soma = soma + num;
				
		 } while (num >0);
		 
		 System.out.print("\nA soma dos números é : " + soma);
	}

}
