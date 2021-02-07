package orientadaAObjetos;

public class testeHeranca {

	public static void main(String[] args) {
		
		Pessoa1 pessoa = new Pessoa1("Jessica", 555);
		Funcionario1 pedro = new Funcionario1 ("Pedro" , 222 , "TI");
		Pessoa1 maria = new Funcionario1 ("Maria" , 333 , "TI"); // outra forma
		Pessoa1 jose = new Coordenador ("Jose", 111 , "CC");
		Coordenador joao = new Coordenador ("João", 444, "ADS");
		
		System.out.println(pessoa.getMatricula());
		System.out.println(pedro.getDepartamento());
		System.out.println(maria.getMatricula());
		System.out.println(jose.getNome());
		System.out.println(joao.getCursoCoordenado());
		
	}

}
