package lista1OrientacaoAObjetos;

public class Aviao {
	public String marca;
	public double tamanho;
	public int quantidadePassageiro;
	public char combustivel;
	String decola;

	String temCombustivel() {
		
		if (combustivel == 'S') {
		decola = "Avião pode decolar";	
		return decola;
		} 
		
		decola = "Avião não pode decolar";
		return decola;
	}
}
