package PortugolJava;

import java.util.Scanner;

public class parRaiz {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		/*par raiz quadrada Math.sqrt(2)  Math.pow(x, y);
		Legenda:
			x = base
			y = potênciae impar elevado ao quadrado*/ 
		
		int num;
	
		System.out.print(" Digite um número: ");
		num = leia.nextInt();
		if (num%2 == 0 ) {
			System.out.print(" Este número é par e sua raiz quadrada é " + Math.sqrt(num));
		} else if (num%2 == 1) {
			System.out.print(" Este número é ímpar e ele elevado ao quadrado é " + Math.pow(num,2));
		} else if (num <=0) {
			System.out.print(" Escreva um número válido");
		}
	}

}
