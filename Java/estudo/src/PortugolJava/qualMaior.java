package PortugolJava;

import java.util.Scanner;

public class qualMaior {
		
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num1 , num2 , num3;
		
		System.out.print("Escreva um número: ");
		num1 = leia.nextInt();
		System.out.print("Escreva um número: ");
		num2 = leia.nextInt();
		System.out.print("Escreva um número: ");
		num3 = leia.nextInt();
		if (num1> num2 && num1 > num3) {
			System.out.printf("O número %d é o maior número digitado ", num1);
		} else if (num2> num1 && num2 > num3) {
			System.out.printf("O número %d é o maior número digitado ", num2);
		} else {
			System.out.printf("O número %d é o maior número digitado ", num3);
		}

	}

}
