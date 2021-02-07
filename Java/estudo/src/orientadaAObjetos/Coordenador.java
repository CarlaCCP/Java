package orientadaAObjetos;

public class Coordenador extends Pessoa1 {
	private String cursoCoordenado;

	// construtor
	public Coordenador(String nome, int matricula, String cursoCoordenado) {
		super(nome, matricula);
		
		this.cursoCoordenado = cursoCoordenado;
		
	}

	public String getCursoCoordenado() {
		return cursoCoordenado;
	}

	public void setCursoCoordenado(String cursoCoordenado) {
		this.cursoCoordenado = cursoCoordenado;
	}

	
	
	

}
