package orientadaAObjetos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ExemploColecoesList {
	
	public static void main (String [] args) {
		
		
		Collection<String> nomes = new ArrayList();
		
		// adiciona elementos
		nomes.add("Mario");
		nomes.add("Maria");
		nomes.add("Juliana");
		nomes.add("Rafaela"); 
		System.out.println("Lista de nomes: " + nomes);
		
		
		/*pergunta se está vazia e retorna um valor 
		 * booleano true, se estiver vazia
		 */
		
		if (nomes.isEmpty() ) { 
			System.out.println("A lista está vazia");
		} else {
			System.out.println("Lista de nomes: " + nomes);
		}
		
		
		// tira um elemento
		//nomes.remove("Mario"); 
		//System.out.println("Lista de nomes: " + nomes);
		
		// limpa toda a coleção
		//nomes.clear(); 
		//System.out.println("Lista de nomes: " + nomes);
		
		//Procura o elemento e volta true ou false 
		System.out.println("Contém o nome Maria? " + nomes.contains("Maria"));
		System.out.println("Lista: " + nomes);
		
		
		// adicionando valores de uma outro collection

		Collection<String> nomes2 = Arrays.asList("Marcia" , "Joana");
		nomes.addAll(nomes2); // adiciona todos os elementos nomes2 em nomes
		System.out.println("Lista de nomes: " + nomes + "\n");
	
		// percorre todos os nomes da lista
		for (String name : nomes) { 
			System.out.println("Lista de nomes: " + name);
		}
	}
}
