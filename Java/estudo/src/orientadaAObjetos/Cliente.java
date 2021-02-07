package orientadaAObjetos;

public class Cliente {

	private String nome; // somente você  pode utilizar 
	private int anoNascimento;
	private char sexo;

	// Construtor - cria uma forma de pegar os dados/ responsabilidade da classe
	// botão direito - source - construtor using fields
	public Cliente(String nome, int anoNascimento, char sexo) { // pode mudar qual variavel vc quer

		super();
		this.nome = nome; // nome azul claro (atributo) - nome azul escuro variavel
		this.anoNascimento = anoNascimento;
		this.sexo = sexo;

	}

	public Cliente(int anoNascimento) { // sobrecarga de parametro

		this.anoNascimento = anoNascimento;
	}
	
	public Cliente(int anoNascimento, String nome) {
		this.anoNascimento = anoNascimento;
		this.nome = nome;
	}
	
	
	
	// perguntas, quando precisamos passar parâmetros?
	// eu não preciso printar o void ? É só chamar dentro do main?
	
	public int mostraIdade () { // quando ele coloca só o int?
		return 2020 - this.anoNascimento;
	}
	
	//////// encapsulamento . source . generete setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
/////////////////////////////////////////////////
	public void mostraSexo() {
		
		if(this.sexo == 'F') {
			System.out.println("PESSOA FEMININA");
		} else if (this.sexo == 'M') {
			System.out.println("PESSOA MASCULINA");
		} else if (this.sexo == 'O') {
			System.out.println("PESSOA DO JEITO QUE QUISER");
		} else {
			System.out.println("Você não digitou um dado correto");
		}
	}
	
	public void linha () { // sobrecarga de método
		System.out.println("---------------------------------");
	}

	public void linha(int tamanho) { // sobrecarga metodo
		for (int x=1; x<= tamanho; x++) {
			System.out.print("-");
		}
		
		System.out.println();
	}
	
	
}
