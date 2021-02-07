package lista1OrientacaoAObjetos;

public class Funcionario {
	public String nome;
	public int anoNascimento;
	public char sexo;
	public String funcao;
	public double salario;
	public int tipoFuncionario;

	// construtor
	
	public Funcionario (String nome,  char sexo, int tipoFuncionario) {
		this.nome = nome;
		this.sexo = sexo;
		this.tipoFuncionario = tipoFuncionario;
		
	}
	
	void mostraSexo() {
		if (this.sexo == 'F') {
			System.out.println("Olá, bem vinda");
		} else if (this.sexo == 'M') {
			System.out.println(" Olá, bem vindo");
		} else if (this.sexo == 'O') {
			System.out.println("Olá, bem vinde");
		} else {
			System.out.println(" Você não digitou uma opcao válida");
		}
	}
	
	void mostraTipo () {
		if (this.tipoFuncionario == 1 && this.sexo == 'M') {
			System.out.println("Você é um novo funcionário");
		} else if (this.tipoFuncionario == 2 && this.sexo == 'M') {
			System.out.println("Você é um antigo funcionário");
		} else if (this.tipoFuncionario == 1 && this.sexo == 'F') {
			System.out.println("Você é uma nova funcionária");
		} else if (this.tipoFuncionario == 2 && this.sexo == 'F') {
			System.out.println("Você é uma antiga funcionária");
		} else if (this.tipoFuncionario == 1 && this.sexo == 'O') {
			System.out.println("Você é umx novx funcionárix");
		} else if (this.tipoFuncionario == 2 && this.sexo == 'O') {
			System.out.println("Você é umx antigx funcionárix");
		}
	}
	
}
