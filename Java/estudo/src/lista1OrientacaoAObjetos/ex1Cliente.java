package lista1OrientacaoAObjetos;

import java.util.Scanner;

public class ex1Cliente {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		Cliente cliente1 = new Cliente ();
		
		System.out.print("Digite o seu nome: ");
		cliente1.nome = leia.next();
		
		System.out.print("Digite se F - FEMININO, M- MASCULINO, O - OUTRO: ");
		cliente1.sexo = leia.next().toUpperCase().charAt(0);
		
		System.out.print(" Digite seu ano de nascimento: ");
		cliente1.anoNascimento = leia.nextInt();
		
		System.out.print("Digite o nome do produto que você deseja comprar: ");
		cliente1.produto = leia.next();
		
		cliente1.detalhesCliente();

	}
	

}
