package lista2Heranca;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private String telefone;

	// Encapsulamento
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
	
	// construtor 
	
	public Pessoa () {
		
	}
	
	public Pessoa(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public Pessoa(String nome, String telefone) {

		this.telefone = telefone;
		
	}
	
	public Pessoa(String endereco) {
		
		this.endereco = endereco;
	}
}
