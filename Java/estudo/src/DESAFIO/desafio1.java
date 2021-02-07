package DESAFIO;

import java.util.Scanner;

public class desafio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in)
				;
		String produto[] = {"Camisa  ", "Blusa   " , "Camiseta" , "Calça   " , "Bermuda " , "Calça J ", "Saia    " , "Bleaser " , "Vestido " , "Terno  "};
		int quantidade [] = {1, 2, 3,4,5,6,7,8,9,10};
		int preco [] = {20, 40 , 50 , 90, 30, 90 , 40, 90, 80, 150};
		int codigo [] = {0, 1 , 2 ,3 , 4,5,6,7,8,9};
		String carrinho[] = new String [10];
		int produtox, quantidadex;
		String cliente;
		int sexo;
		int opcao;
		int opcao1;
		int x = 0;
		System.out.print("-----------------------NOME DA LOJA------------------------");
		System.out.println();
		System.out.print("Olá cliente, bem vinde a nossa loja, antes das compras, por favor, digite seu nome: \n");
		cliente = leia.next();
		System.out.print("\nVocê se identifica como? Digite 1 - FEMINNO , 2 - MASCULINO , 3 - OUTROS: ");
		sexo = leia.nextInt();
		
		System.out.printf("\nOlá %s, vamos para as compras? Veja nosso estoque imperdivel!!\n", cliente);
		System.out.print("                        LISTA\n");
		
		System.out.print("CÓDIGO        PRODUTO             QUANTIDADE            PREÇO");
		for (x = 0; x< produto.length; x++) {
			System.out.printf("\n%d              %s              %d                   %d", codigo[x], produto[x], quantidade[x], preco[x]);
		}
	
	// produto escolhido até ser o certo, sai do loop quando o produto certo for escolhido	
	
	
		/*do {
		
		System.out.print("\nEscolheu o seu produto? Por favor, digite o código da peça: ");
		produtox = leia.nextInt();
		
		System.out.printf("\n\nLegal %s, agora precisamos saber a quantas peças você deseja. Digite a quantidade:  " , cliente);
		quantidadex = leia.nextInt();
		quantidadex = quantidadex - 1;
		
		for( x=0; x< produto.length; x++) {
				produto[x] = produto[produtox];	// associar o variavel com array
				carrinho[0] = produto[x];
				quantidade[x] = quantidade[quantidadex];
		} System.out.printf("\nO produto escolhido foi %s, está correto? Digite 1 - Para sim ou Digite 2 para escolher novamente", produto[produtox]);
			opcao = leia.nextInt(); // **na segunda tentativa não existe mudança na escolha, arrumar ***
			System.out.print("\nO seu carrinho é " + carrinho[0]);

	}  while ( opcao == 2); */
		
	int contador = 10;
	int z = 0;
		opcao = 1;
	
		while (opcao == 1) {
				z++;
			System.out.print("\nEscolheu o seu produto? Por favor, digite o código da peça: ");
			produtox = leia.nextInt();
			System.out.printf("\n\nLegal %s, agora precisamos saber a quantas peças você deseja. Digite a quantidade:  " , cliente);
			quantidadex = leia.nextInt();
			
			for( x=0; x< produto.length; x++) {
				
				produto[x] = produto[produtox];	// associar o variavel com array
				carrinho[x] = carrinho[x] + produto[x];
				quantidade[x] = quantidade[quantidadex];
			}
			System.out.print("Deseja comprar mais peças? Digite 1 para SIM e 2 para NÃO: ");
			opcao = leia.nextInt();
		}
		
		String carrinhox[] = new String [z];
		for(z=0; z< carrinhox.length; z++) {
			carrinho[x] = carrinhox[z];
			System.out.print(carrinhox[z]);
		}
		
	} 

}
