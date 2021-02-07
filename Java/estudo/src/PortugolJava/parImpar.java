package PortugolJava;

import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num;
		System.out.print("Escreva um número: ");
		num = leia.nextInt();
		
		if(num > 0) {
			if(num % 2 ==0) {
				System.out.println("Este número é par");
			} else {
				System.out.println("Este número é ímpar");
			}
			
		} else if(num == 0) {
			System.out.println(" Número nulo ");
		} else {
			System.out.println("Número negativo");
		}

	}

}
