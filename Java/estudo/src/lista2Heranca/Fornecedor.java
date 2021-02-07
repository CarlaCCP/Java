package lista2Heranca;

public class Fornecedor extends Pessoa {
	private double valorDivida;
	private double valorCredito;

	public Fornecedor () {
		
	}
	
	public Fornecedor(String nome, String endereco, String telefone, double valorDivida, double valorCredito) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;

	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	// método

	void obterSaldo() {
		System.out.println("O saldo do funcionário " + this.getNome() + " é " + (this.valorCredito - this.valorDivida));
	}
	
	/*
	 * public double obterSaldo() { - se tiver algum parametro é melhor usar o this
	 * 
	 * return valorCredito - valorDivida
	 * }*/
}
