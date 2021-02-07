package lista1OrientacaoAObjetos;

import java.util.Scanner;

public class ex2Aviao {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		Aviao aviao1 = new Aviao ();
		
		aviao1.marca = "Boeing 777";
		aviao1.tamanho = 69.1;
		aviao1.quantidadePassageiro = 100;
		aviao1.combustivel = 'N';
		
		aviao1.temCombustivel();
		
		System.out.print(aviao1.temCombustivel());
		
	}

}
