package orientadaAObjetos;

public class testeFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.setNome("Antonia");
		funcionario1.setSalario(1250.0);
		
		System.out.println(funcionario1.getNome());
		System.out.println(funcionario1.getSalario());
	}

}
