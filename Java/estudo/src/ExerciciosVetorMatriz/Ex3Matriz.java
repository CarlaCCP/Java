package ExerciciosVetorMatriz;

import java.util.Scanner;

public class Ex3Matriz {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int matriz[][] = new int[3][3];
		int x = 3;
		int y = 3;
		int linha = 0;
		int coluna = 0;
		int contador = 0;

		for (linha = 0; linha < x; linha++) {
			for (coluna = 0; coluna < x; coluna++) {
				System.out.print("Digite um número: ");
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		
		for (linha = 0; linha < x; linha++) {
			for (coluna = 0; coluna < x; coluna++) {
				System.out.print("\t"+ matriz[linha][coluna]);
			}
		}
		
		for (linha = 0; linha < x; linha++) {
			for (coluna = 0; coluna < x; coluna++) {
				if (matriz[linha][coluna] > 10) {
					contador++;
				}
			}
		}
		System.out.print("\nA quantidade de valores maiores de 10 é: " + contador);
		

	}

}
