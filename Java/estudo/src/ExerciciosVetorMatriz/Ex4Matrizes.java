package ExerciciosVetorMatriz; //arrumar código 

import java.util.Scanner;

public class Ex4Matrizes {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int linha = 0, coluna = 0;

		int matriz[][] = new int[2][2];
		int matriz2[][] = new int[2][2];
		int matriz3[][] = new int[2][2];
		int matriz4[][] = new int[2][2];
		int x = 2;
		int opcao;

		// leitura 1
		System.out.print("MATRIZ 1");
		for (linha = 0; linha < x; linha++) {
			for (coluna = 0; coluna < x; coluna++) {
				System.out.print("\nDigite um número: \n");
				matriz[linha][coluna] = leia.nextInt();

			}
		}
		// leitura 2
		System.out.print("MATRIZ 2");
		for (linha = 0; linha < x; linha++) {
			for (coluna = 0; coluna < x; coluna++) {
				System.out.print("\nDigite um número: ");
				matriz[linha][coluna] = leia.nextInt();

			}
		}
		System.out.print(
				"\nDigite 1 - Somar duas matrizes\n2 - Subtrair a primeira pela segunda\n3 - Imprir as matrizes: ");
		opcao = leia.nextInt();

		if (opcao == 1) {
			// soma
			for (linha = 0; linha < 2; linha++) {
				for (coluna = 0; coluna < 2; coluna++) {

					matriz3[linha][coluna] = matriz[linha][coluna] + matriz2[linha][coluna];
				
				}
			}
			// aqui 
			for (linha = 0; linha < 2; linha++) {
				for (coluna = 0; coluna < 2; coluna++) {

					System.out.print(matriz3[linha][coluna]);
				
				}
			}
			
			
		}
		
			if (opcao == 2) {
			// subtração
			for (linha = 0; linha < 2; linha++) {
				for (coluna = 0; coluna < 2; coluna++) {

					matriz4[linha][coluna] = matriz[linha][coluna] - matriz2[linha][coluna];

				}
			}
			
			
			for (linha = 0; linha < 2; linha++) {
				for (coluna = 0; coluna < 2; coluna++) {
					System.out.print(matriz4[linha][coluna]);
				}
			}
		} 
			
			if (opcao == 3) {
				
				for (linha = 0; linha < 2; linha++) {
					for (coluna = 0; coluna < 2; coluna++) {
						System.out.print("\nMatriz 1: " + matriz[linha][coluna]);
						System.out.print("\nMatriz 2: " + matriz2[linha][coluna]);
					}
				}
			
		}
		
	}

}
