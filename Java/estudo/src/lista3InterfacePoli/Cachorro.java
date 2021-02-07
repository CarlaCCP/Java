package lista3InterfacePoli;

public class Cachorro extends Animal{

	private boolean corre;
	
	public Cachorro (String nome, int anoNascimento, boolean corre) {
		super(nome, anoNascimento);
		this.corre = corre;
		
	}
	
	@Override
	public void emiteSom () {
	System.out.println("O som que o cachorro faz é: auau");
	}
	
	
	public boolean isCorre() {
		return corre;
	}


	public void setCorre(boolean corre) {
		this.corre = corre;
	}

	@Override
	public void apresentaAnimal () {
		System.out.println("CACHORRO");
		System.out.println("\nNome do animal: " + getNome());
		System.out.println("\nIdade do animal: "  + getAnoNascimento());
		System.out.println("\nO animal corre? " + isCorre());
		emiteSom();
		
	}
	
	
}