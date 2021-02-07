package utilidades;

import java.util.Scanner;

public class lista1Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int segundosUsuario;
		int segundosCalculo = 0 , horaCalculo = 0 , minutosCalculo = 0;
		boolean testeHora = false , testeMinutos = false;
		System.out.println("Digite o tempo de processo em segundos: ");
		segundosUsuario = leia.nextInt();
		while (segundosUsuario >= 3600) {
			horaCalculo +=1;
			segundosUsuario -= 3600;
		}
		while (segundosUsuario >= 3600) {
			minutosCalculo +=1;
			segundosUsuario -=60;
		}
		segundosCalculo = segundosUsuario;
		System.out.printf("O tempo de processo é %d horas,%d minutos e de %d segundos",horaCalculo, minutosCalculo, segundosCalculo);
	}

}
