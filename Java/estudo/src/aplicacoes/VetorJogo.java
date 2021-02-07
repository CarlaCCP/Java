package aplicacoes;

import java.util.Scanner;

public class VetorJogo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String time[] = { "Corinthians", "Palmeiras", "São Paulo", "Santos" };
		int pontos[] = { 0, 0, 0, 0 }; // int [] pontos = new int [4];
		char resultado;
		char opcao = 'S';
		int contador = 0;

		System.out.print("\nANTES DOS JOGOS");

		for (int x = 0; x < time.length; x++) {
			System.out.printf("\nEQUIPE - %s PONTOS: %d", time[x], pontos[x]);
		}
		System.out.println("PROCESSO DE RODADAS");
		while (opcao == 'S') {
			contador++;
			System.out.print("\nRODADA Nº " + contador);
			for (int x = 0; x < time.length; x++) {
				System.out.printf("\nEQUIPE - %s Digite G - ganhou, E - empatou ou P - perdeu: ", time[x]);
				resultado = leia.next().toUpperCase().charAt(0);

				if (resultado == 'G') {
					pontos[x] = pontos[x] + 3;
				} else if (resultado == 'E') {
					pontos[x] = pontos[x] + 1;
				} else if (resultado == 'P') {
					pontos[x] = pontos[x] + 0;
				}

			}
			System.out.print("Continua S- sim ou N - não?: ");
			opcao = leia.next().toUpperCase().charAt(0);
		}

		System.out.print("\nDEPOIS DOS JOGOS");
		for (int x = 0; x < time.length; x++) {
			System.out.printf("\nEQUIPE - %s PONTOS: %d", time[x], pontos[x]);

		}
	}

}
