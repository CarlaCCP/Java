package lista1OrientacaoAObjetos;

import java.util.Scanner;

public class Cliente {
	Scanner leia = new Scanner(System.in);

	public String nome; // objeto 
	public char sexo;
	public int anoNascimento;
	public String produto;


	void detalhesCliente () {
		System.out.print("Esses são os detalhes do cliente: "); // método
		System.out.println("O seu nome é: " + nome);
		System.out.println("Seu sexo é: " + sexo);
		System.out.println("Sua idade é: " + (2020- anoNascimento) + " anos");
		System.out.println("O produto escolhido é: " + produto);
	}

	

}
