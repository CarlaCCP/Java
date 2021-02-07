package entidades;

public class Ebook extends Livro { // ebook herda as caracteristicas de livro

	private boolean waterMark;
	

	public Ebook() {

	}

	public Ebook(String nome, String descricao, double valor, boolean waterMark) {
		super(nome, descricao, valor);
		this.waterMark = waterMark;
	}

	public Ebook(Autor autor) {
		super(autor);
	}
	
	public boolean isWaterMark() {
		return waterMark;
	}

	public void setWaterMark(boolean waterMark) {
		this.waterMark = waterMark;
	}

	public void mostrarDetalhes() { // método

		System.out.println("\nMostrando detalhes do ebook");
		System.out.println();
		System.out.println("Nome: " + getNome());
		System.out.println("Descrição: " + getDescricao());
		System.out.println("Valor: " + getValor());
		System.out.println("waterMark: " + waterMark);
		getAutor().mostrarDetalhes(); // - não aceita, pesquisar sobr
		System.out.println("=====");
	}

	

}
