package lista1OrientacaoAObjetos;

public class ProdutoEletronico {

	String nome;
	double preco;
	int voltagem;

	void liga() {
		int tomada = 220;
		
		if (this.voltagem == tomada) {
			System.out.print("O aparelho esá funcionando");
		} else if (this.voltagem != tomada) {
			System.out.println("O aparelho corre risco de queimar");
		}
	}
}
