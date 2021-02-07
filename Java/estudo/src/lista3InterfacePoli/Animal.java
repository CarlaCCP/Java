package lista3InterfacePoli;

public abstract class Animal {
	
	private String nome;
	private int anoNascimento;
	

	public Animal(String nome, int anoNascimento) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
	}
	
	public Animal () {
		
	}


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

	public void emiteSom() {
		System.out.println();
	}

	
	
	public void apresentaAnimal () {
	
		System.out.println("Nome do animal: " + getNome());
		System.out.println("Idade do animal: "  + getAnoNascimento());
		//System.out.println("Ação do animal: " + getAcao());
		
	}
}
