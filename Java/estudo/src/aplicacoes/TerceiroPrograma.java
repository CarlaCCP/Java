package aplicacoes;

public class TerceiroPrograma {

	public static void main(String[] args) {
		int valor = 10; //tipo primitivo
		char opcao = 'x'; //caracter
		double salario = 1000.50; // real, evite usar float
		String nome = "Aula de java"; //string é uma classe
		
		
		System.out.print("Exemplo do print \n");
		System.out.println("Nome do usuário: " + nome + " salario: "+ salario);
		System.out.println("Exemplo do print \n");
		System.out.printf("Nome do usuario: %s e salario: %.0f com acrescimo de 10 por cento", nome, (salario + (salario* 0.1))); // outra forma de printar com texto corrido
	}

}
