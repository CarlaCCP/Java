package utilidades;

import java.util.Scanner;

public class lista1Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		int anosUsuario = 0;
		int mesesUsuario = 0;
		int diasUsuario = 0;
		int diasTotais = 0;
		System.out.println("Qual é a sua idade em dias? \n");
		diasTotais = leia.nextInt();
		anosUsuario = (diasTotais/365);
		mesesUsuario = (diasTotais%365)/30;
		diasUsuario = (diasTotais%365)%30;
		System.out.printf("Você tem %d anos, %d meses e %d dias", anosUsuario, mesesUsuario, diasUsuario);
		
	}

}
