package desafio2;

public class Produtos {

	private String produtos [] = new String [4]; 
	private int quantidade [] = new int [4];
	private double preco [] = new double [4];
	
	public Produtos (String produtos, int quantidade, double preco) {
		this.produtos[4]= produtos;
		this.quantidade[4] = quantidade;
		this.preco[4] = preco;
	}
	
	public Produtos () {
		
	}
	
	public String[] getProdutos() {
		return produtos;
	}
	public void setProdutos(String[] produtos) {
		this.produtos = produtos;
	}
	public int[] getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int[] quantidade) {
		this.quantidade = quantidade;
	}
	public double[] getPreco() {
		return preco;
	}
	public void setPreco(double[] preco) {
		this.preco = preco;
	}
	
	public void mostraProdutos () {
		for (int x=0; x< produtos.length; x++) {
			System.out.println(produtos[x]);
		}
	}
	
}
