package utilidades;

import java.util.Scanner;

public class lista1Exercicio7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int a ,b, c, d, e, f;
		double x =0, y=0;
		System.out.print("Informe o valor de A: ");
		a = leia.nextInt();
		System.out.print("Informe o valor de B: ");
		b = leia.nextInt();
		System.out.print("Informe o valor de C: ");
		c = leia.nextInt();
		System.out.print("Informe o valor de D: ");
		d = leia.nextInt();
		System.out.print("Informe o valor de E: ");
		e = leia.nextInt();
		System.out.print("Informe o valor de F: ");
		f = leia.nextInt();
		
		 x = ( ( (c*e) - (b*f) ) / ( (a*e) - (b*d) ) );
		 y =  ( ( (a*f) - (c*d) ) / ( (a*e) - (b*d) ) );
		leia.close();
		
		System.out.printf(" O valor de x é: %2.f\n", x);
		
		System.out.printf(" O valor de x é: %2.f" ,y);
		
	}
}
