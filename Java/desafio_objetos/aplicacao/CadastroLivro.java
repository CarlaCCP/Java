package aplicacao;

import java.util.Scanner;

import entidades.Autor;
import entidades.Cliente;
import entidades.Ebook;
import entidades.Livro;
import entidades.LivroFisico;

public class CadastroLivro {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int opc;
		Ebook ebook1 = new Ebook();
		LivroFisico livro = new LivroFisico ();
		Cliente cliente1 = new Cliente ();
		
		System.out.println("Digite uma opcao");
		System.out.println("[ 1 ] Cliente \n[ 2 ] Autor");
		opc = leia.nextInt();
		
		if (opc == 1) {
			
		}
	
	}

}
