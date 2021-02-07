package ExercicosRepeticao;

import java.util.Random;
import java.util.Scanner;

public class Ex2ParImpar {

	/*Random random = new Random();
int numero = random. nextInt(100);
double numero random. nextDouble() * 100; //Número aleatório de 0 à 100.*/
	
	public static void main(String[] args) {
		// Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		Scanner leia = new Scanner(System.in);
		Random random = new Random();
		
		int contador = 0 , contadorImpar= 0;
		int x= 0;
		int numero;
		
		
		for(x = 1; x <= 10; x++) {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			if (numero%2 == 0) {
				contador++;
				
			} else {
				contadorImpar++;
				
			}
		}
		System.out.printf("\nVocê digitou %d números pares",contador);
		System.out.printf("\nVocê digitou %d números impares",contadorImpar);
	}

}
