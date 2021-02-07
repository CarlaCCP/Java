package aplicacoes;

import java.util.Scanner;

public class InversaoValores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int x;
		int y;
		System.out.print("Escreva o número A: ");
		x = leia.nextInt();
		System.out.print("Escreva o número B: ");
		y = leia.nextInt();
		System.out.printf("Os números antes da inversão são %d e %d ", x , y);
		
		x = x + y;
		y = x-y;
		x = x-y;
		System.out.println();
		System.out.printf("Os números depois da inversão são %d e %d ", x , y);
	}
}
