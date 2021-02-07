package lista1OrientacaoAObjetos;

import java.util.Scanner;

public class ex3ProdutoEletronico {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		ProdutoEletronico produto = new ProdutoEletronico();
		
		System.out.println("Digite o nome do produto: ");
		produto.nome = leia.next();
		
		System.out.println("Digite o preço do produto: ");
		produto.preco = leia.nextDouble();
		
		System.out.println("Digite a voltagem do produto - 220 ou 110: ");
		produto.voltagem = leia.nextInt();
		
		produto.liga();
		
		

	}

}
