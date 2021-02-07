package aplicacoes; // Exemplo de modulação e sequencial

import java.util.Scanner;

public class janela {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		int resultado;
		resultado = soma(6, 4);

		System.out.print("Digite o nome do usuário: ");
		nome = leia.next();

		System.out.print("+-----------------------------+\n");
		System.out.print("        " + nome + "           \n");
		System.out.println(resultado);
		System.out.print("+-----------------------------+\n");

	}

	// função em java

	public static void linha() {

	}

	public static int soma(int valor1, int valor2) {
		return valor1 + valor2;
	}

}
