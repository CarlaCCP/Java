package exemploPoliformismo;

public class testePolimorfismo {

	public static void main(String[] args) {
		
		PessoaFisica fisica = new PessoaFisica();
		fisica.setNome("Juliana");
		fisica.setCpf(124578985L);
		
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("Cristiano");
		juridica.setCnpj(56648482L);
		
		
		Pessoa3[] pessoas = new Pessoa3[2];
		pessoas[0] = fisica;
		pessoas[1] = juridica;

		for (Pessoa3 pessoa: pessoas) {
			System.out.println(pessoa.getNome());
		}
	}

}
