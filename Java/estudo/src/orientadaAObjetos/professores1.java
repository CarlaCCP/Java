package orientadaAObjetos;

import java.util.Scanner;

public class professores1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in); // herança/ classe tem letra maiuscula
		Professor primeiro = new Professor();
		char info;
		// professor
		System.out.print("Digite o nome: ");
		primeiro.nome = leia.next();
		
		System.out.println("Digite o sexo M- Masculino, F - Feminino, O - Outros: ");
		primeiro.sexo = leia.next().toUpperCase().charAt(0);
		
		System.out.println("Digite a especialidade do professor: ");
		primeiro.especialidade = leia.next().toUpperCase();
		
		System.out.println("Digite o ano de nascimento do professor: ");
		primeiro.anoNascimento = leia.nextInt();
		
		System.out.print(" O professor é F - fixo ou C - Convidado: ");
		info = leia.next().toUpperCase().charAt(0);
		
		if (info == 'C') {
			
			primeiro.convidado = true;
			
		} else {
			
			primeiro.convidado = false;
		}
		
		System.out.println("DADOS DO PRIMEIRO PROFESSOR: ");
		System.out.println("Nome: " + primeiro.nome);
		System.out.println("Sexo: ");
		System.out.println((primeiro.sexo == 'F')? "FEMININO" :(primeiro.sexo == 'M')? "MASCULINO" : "OUTRO");
		System.out.println("Idade: " + (2020 - primeiro.anoNascimento));
		
		// Aluno
		
		Aluno primeiroAluno = new Aluno();
		
		System.out.println("Digite o nome do aluno: ");
		primeiroAluno.nome = leia.next().toUpperCase();
		
		System.out.println("Digite o sexo do aluno ( M - MASCULINO, F - FEMININO, O - OUTROS: ");
		primeiroAluno.sexo = leia.next().toUpperCase().charAt(0);
		
		System.out.println("Digite a data de nascimento do aluno: ");
		primeiroAluno.anoNascimento = leia.nextInt();
		
		System.out.println("Digite o nome do curso: ");
		primeiroAluno.curso = leia.next().toUpperCase();

		
		System.out.printf("Digite a nota do aluno no curso %s: ", primeiroAluno.curso);
		primeiroAluno.notaGeral = leia.nextInt();
		
		
		System.out.println("DADOS DO PRIMEIRO ALUNO: ");
		System.out.println("Nome: " + primeiroAluno.nome);
		System.out.println("Sexo: " + primeiroAluno.sexo);
		System.out.println("Idade: " + (2020 - primeiroAluno.anoNascimento));
		
		
		if (primeiroAluno.notaGeral <= 5) {
			
			if (primeiroAluno.sexo == 'M') {
				System.out.printf("O aluno %s esta reprovado no curso %s com nota %d.", primeiroAluno.nome, primeiroAluno.curso,primeiroAluno.notaGeral  );
			} else if (primeiroAluno.sexo == 'F') {
				System.out.printf("A aluna %s esta reprovada no curso %s com nota %d.", primeiroAluno.nome, primeiroAluno.curso,primeiroAluno.notaGeral  );
			} else if (primeiroAluno.sexo == 'O') {
				System.out.printf("Alune %s esta reprovade no curso %s com nota %d.", primeiroAluno.nome, primeiroAluno.curso,primeiroAluno.notaGeral  );
			}
			
			
		} else {
			
			if (primeiroAluno.sexo == 'M') {
				System.out.printf("O aluno %s esta aprovado no curso %s com nota %d.", primeiroAluno.nome, primeiroAluno.curso,primeiroAluno.notaGeral  );
			} else if (primeiroAluno.sexo == 'F') {
				System.out.printf("A aluna %s esta aprovada no curso %s com nota %d.", primeiroAluno.nome, primeiroAluno.curso,primeiroAluno.notaGeral  );
			} else if (primeiroAluno.sexo == 'O') {
				System.out.printf("Alune %s esta aprovade no curso %s com nota %d.", primeiroAluno.nome, primeiroAluno.curso,primeiroAluno.notaGeral  );
			}
			
		}
		
		
	}
	
	

}
