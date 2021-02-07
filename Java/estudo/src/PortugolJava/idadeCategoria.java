package PortugolJava;

import java.util.Scanner;

public class idadeCategoria {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade; 
		System.out.print(" Digite sua idade: ");
		idade = leia.nextInt();

		if(idade >=10 && idade <= 14) {
			System.out.printf(" Sua idade é de %d é sua categoria é Infantil ", idade );
		} else if (idade >=15 && idade <= 17) {
			System.out.printf(" Sua idade é de %d é sua categoria é Juvenil ", idade );
		} else {
			System.out.printf(" Sua idade é de %d é sua categoria é Adulto ", idade );
		}

	}

}
