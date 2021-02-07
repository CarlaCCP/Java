package lista3InterfacePoli;

public class Cavalo extends Animal {
	
private boolean corre;
	
	public Cavalo (String nome, int anoNascimento, boolean corre) {
		super(nome, anoNascimento);
		this.corre = corre;
		
	}
	
	
	
	public boolean isCorre() {
		return corre;
	}



	public void setCorre(boolean corre) {
		this.corre = corre;
	}



	@Override
	public void emiteSom () {
		System.out.println("O som que o cavalo faz é: uhauahfh");
	}
	
	@Override
	public void apresentaAnimal () {
		System.out.println("CAVALO");
		System.out.println("\nNome do animal: " + getNome());
		System.out.println("\nIdade do animal: "  + getAnoNascimento());
		System.out.println("\nAção do animal: " + isCorre());
		emiteSom();
	}
}