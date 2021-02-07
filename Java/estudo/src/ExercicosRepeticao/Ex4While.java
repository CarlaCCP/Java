package ExercicosRepeticao;

import java.util.Scanner;

public class Ex4While {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int contador = 3;
		int idade , sexo, opcaoHumor;
		int calmas = 0 , fNervosa = 0 , mAgressivo = 0, outrosCalmos = 0 , nervosasMais =0 , calmasMenos = 0;
		
		while (contador >0) {
			contador--;
			System.out.print(" Digite sua idade: ");
			idade = leia.nextInt();
			
			System.out.print(" Digite seu sexo: 1 - Feminino, 2 - Masculino, 3 - Outros: ");
			sexo = leia.nextInt();
			
			System.out.print("1- Sou calmo , 2- Sou nervoso, 3 - Sou agressivo: ");
			opcaoHumor = leia.nextInt();
			if(opcaoHumor == 1) {
				calmas++;
			} else if (opcaoHumor == 3) {
				outrosCalmos++;
			} else if (sexo == 1 && opcaoHumor == 3) {
				fNervosa++;
			} else if (sexo == 2 && opcaoHumor == 3) {
				mAgressivo++;
			} else if(idade >40 && opcaoHumor == 2) {
				nervosasMais++;
			} else if (opcaoHumor == 1 && idade <18) {
				calmasMenos++;
			}
		}
		System.out.print("\nO número de pessoas calmas é de: " + calmas);
		System.out.print("\nO número de mulheres nervosas é de: " + fNervosa);
		System.out.print("\nO número de homens agressivos é de: " + mAgressivo);
		System.out.print("\nO número de outros calmos é de: " + outrosCalmos);
		System.out.print("\nO número de pessoas nervosas com mais de 40 anos é de: " + nervosasMais);
		System.out.print("\nO número de pessoas calmas com menos de 18 anos é de: " + calmasMenos);
	}
}
