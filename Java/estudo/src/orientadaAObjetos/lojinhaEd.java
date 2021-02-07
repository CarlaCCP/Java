package orientadaAObjetos;

import java.util.Scanner;

public class lojinhaEd {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
	
		// usando construtor
		Cliente cliente1 = new Cliente("Carla", 1996 , 'F'); // isso aqui é instanciar
		Cliente cliente2 = new Cliente (1996);
		Cliente cliente3 = new Cliente (1996, "Carla"); // esta private
		
		cliente3.setNome("KARINA"); // SÓ USAR O NOME SE USAR O SET POR SER PRIVATE
			
		System.out.println(cliente3.mostraIdade()); // com retorno
		
		cliente1.mostraSexo(); // void - sem retorno
	
		cliente1.linha(); 
		// sobrecarga de método
		cliente2.linha(50);
		
	}

}
