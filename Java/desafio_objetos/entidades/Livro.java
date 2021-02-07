package entidades;

public abstract class Livro { // tornar abstrata
	/*
	 * São chamados de atributos não estão dentro do main por isso não são variaveis
	 * 
	 */

	private String nome;
	private String descricao;
	private double valor; //
	private Autor autor; // uma classe pode ter outra classe como atributo
	private Autor outroAutor;
	private Ebook ebook;
	

// construtor 
	public Livro(Autor autor) {
		this.autor = autor;
	}
	public Livro () {
		
	}
	
	public Livro (String nome, String descricao, double valor) {
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public Autor getOutroAutor() {
		return outroAutor;
	}

	public void setOutroAutor(Autor outroAutor) {
		this.outroAutor = outroAutor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}


	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	

	public Ebook getEbook() {
		return ebook;
	}
	public void setEbook(Ebook ebook) {
		this.ebook = ebook;
	}
	public void mostrarDetalhes() { // método

		System.out.println("\nMostrando detalhes do livro");
		System.out.println();
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		autor.mostrarDetalhes(); // - não aceita, pesquisar sobre
		System.out.println("=====");

		/*
		 * System.out.println("Mostrando detalhes do autor ");
		 * System.out.println("Nome: " + autor.nome); System.out.println("Email: " +
		 * autor.email); System.out.println("CPF: " + autor.cpf);
		 * System.out.println("====="); NÃO É SUA RESPONSABILIDADE
		 */
	}

	// sobrecarga método teste

	/*
	 * public void mostrarDetalhes() { // método
	 * 
	 * System.out.println("\nMostrando detalhes do livro"); System.out.println();
	 * System.out.println("Nome: " + nome); System.out.println("Descrição: " +
	 * descricao); System.out.println("Valor: " + valor);
	 * System.out.println("ISBN: " + isbn); autor.mostrarDetalhes();
	 * outroAutor.mostrarDetalhes(); //- não aceita, pesquisar sobre
	 * 
	 * if(this.temAutor()) { outroAutor.mostrarDetalhes(); }
	 * 
	 * System.out.println("=====");
	 * 
	 * }
	 */

	public boolean aplicaDescontoDe(double porcentagem) { // usa-se o this para mostrar que valor é um atributo!
		if (porcentagem > 0.3) {
			return false;
		}
		this.valor -= this.valor * porcentagem; // valor = (valor * porcentagem) - valor
		return true;
	}
	
	

	public boolean temAutor() { // checa se existe autor
		return this.autor != null;
	}

	public void adicionaValor(double valor) {
		this.valor = valor;
	}

	public double retornaValor() {
		return this.valor;
	}

}
