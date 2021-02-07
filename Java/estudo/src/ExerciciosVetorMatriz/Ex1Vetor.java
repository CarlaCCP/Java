package ExerciciosVetorMatriz;

public class Ex1Vetor {

	public static void main(String[] args) {
	
	int vetor[]= {1,0,5,-2,-5,7};
	int soma = 0;
	int x =0;
	
	
	for(x=0;x< vetor.length;x++) {
		System.out.print("\n" + vetor[x]);
		
		}
			for (x=0; x<vetor.length; x++) {
				soma = soma + vetor[x];
			}
			
			System.out.print("\nA soma do número da lista é: " + soma);
			
			for (x=0; x< vetor.length; x++) {
				vetor[4] = 100;
				System.out.print("\n" + vetor[x]);
			}
					
	}
}
