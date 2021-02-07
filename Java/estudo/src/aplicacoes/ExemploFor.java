package aplicacoes;

public class ExemploFor {

	public static void main(String[] args) {
		int x , soma = 0;
		
		for(x=1; x<=10;x++) {
			soma = soma + x;
			System.out.print("\n" + x );
		}
		System.out.print("\nA soma total: " + soma);
	}

}
