package lista3InterfacePoli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ExCollections {

	public static void main(String[] args) {

		Collection<String> produtos = new ArrayList();
		
		produtos.add("Sapato");
		produtos.add("Camisa");
		produtos.add("Jeans");
		produtos.add("Calça");
		produtos.add("Vestido");
		
		for (String i: produtos) {
			System.out.println(" Os produtos são: " + i);
		}
		
		System.out.println(produtos + "\n");
		
		
		System.out.println("REMOVENDO PRODUTOS");
		produtos.remove("Sapato");
		produtos.remove("Vestido");
		
		System.out.println("\nNOVO ESTOQUE:\t" + produtos);
		
		System.out.println("\nATUALIZANDO PRODUTOS\n");
		Collection<String> maisProdutos = Arrays.asList("Relogio", "Sandalia", "Casaco");
		produtos.addAll(maisProdutos);
		System.out.println("NOVO ESTOQUE:\t" + produtos);
		
		System.out.println("\nAPRESENTANDO OS PRODUTOS\t");
		System.out.println(produtos);
		
	}

}
