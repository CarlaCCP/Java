package exemploPoliformismo;

public class PessoaFisica extends Pessoa3 {
	private long cpf;

	public PessoaFisica() {

	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getNome() { // super, você utiliza para usar algum dado da superclasse tanto dentro do
								// construtor quanto no método
		return "Pessoa Fisica: " + super.getNome() + " - CPF: " + this.getCpf();
	}

}
