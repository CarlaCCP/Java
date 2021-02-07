package desafio2;

import java.util.Scanner;

public class testeLoja {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		Cliente cliente = new Cliente ();
		Produtos lista = new Produtos();
		// , 10, 10 , 10 , 10, 20.50, 90.0, 30.0, 100.0
		//lista.setPreco("Camisa", "Calça", "Vestido", "Blusa");
		
		
		
		System.out.println("Digite o seu nome: ");
		cliente.setNome(leia.nextLine());
		
		System.out.println("Digite sua idade: ");
		cliente.setIdade(leia.nextInt());
		
		System.out.println("Digite o seu sexo, F- Feminino, M- Masculino, O - Outros");
		cliente.setSexo(leia.next().toUpperCase().charAt(0)); // impedir outra entrada
		
		cliente.cadastroCliente();
		
		
	}

}
