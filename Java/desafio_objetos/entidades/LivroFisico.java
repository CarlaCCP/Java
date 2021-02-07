package entidades;

public class LivroFisico extends Livro {

	private String isbn;
	
	
	public LivroFisico () {
		
	}
	
	public LivroFisico (String nome, String descricao, double valor, String isbn) {
		super (nome, descricao, valor);
		this.isbn = isbn;
	}

	public LivroFisico (Autor autor) {
		super(autor);
	}
	
	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public void mostrarDetalhes() { // método

		System.out.println("\nMostrando detalhes do ebook");
		System.out.println();
		System.out.println("Nome: " + getNome());
		System.out.println("Descrição: " + getDescricao());
		System.out.println("Valor: " + getValor());
		System.out.println("ISBN: " + this.isbn);
		getAutor().mostrarDetalhes(); // - não aceita, pesquisar sobr
		System.out.println("=====");
	}


	
	
	
}
