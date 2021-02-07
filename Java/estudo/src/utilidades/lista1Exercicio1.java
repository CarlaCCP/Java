package utilidades;

import java.util.Scanner;

public class lista1Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int anos = 0;
		int meses = 0; 
		int dias = 0;
		int idadeDias = 0;
		System.out.println("Informe a sua idade em anos: ");
		anos = leia.nextInt();
		System.out.println("Informe a sua idade em meses: ");
		meses =leia.nextInt();
		System.out.println("Informe a sua idade em dias: ");
		dias = leia.nextInt();
		
		idadeDias = (anos *365)+ (meses * 30) + dias;
		System.out.printf("A sua idade em dias é %d dias", idadeDias);	 
	}
}