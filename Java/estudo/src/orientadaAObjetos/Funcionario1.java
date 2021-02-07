package orientadaAObjetos;

public class Funcionario1 extends Pessoa1 {
	private String departamento;

	// construtor
	public Funcionario1 (String nome, int matricula, String departamento) {
		super(nome, matricula); // esta criando uma relação com a superclasse (Pessoa1);
	this.departamento = departamento;
	
	}
	// encapsulamento

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
}
