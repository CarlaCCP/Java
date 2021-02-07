package lista1OrientacaoAObjetos;

import java.util.Scanner;

public class ex4Funcionario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
	Funcionario funcionario1 = new Funcionario("Carla", 'M', 2);
	
	System.out.println("Digite o nome do usuário: ");
	funcionario1.nome = leia.next();
	System.out.println(funcionario1.nome);
	
	funcionario1.mostraSexo();
	funcionario1.mostraTipo();
	
	}

}
