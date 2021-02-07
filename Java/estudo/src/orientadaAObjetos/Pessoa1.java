package orientadaAObjetos;

public class Pessoa1 {
	
	private String nome;
	private int matricula;

	// construtor
	public Pessoa1(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	// encapasulamento
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	

	
}
