package orientadaAObjetos;

import java.util.HashSet;
import java.util.Set;
//import java.util.TreeSet;

public class ExSetListaAluno {
	
	public static void main(String args []) {
		
		Set<ExColecoesSet> conjunto = new HashSet<ExColecoesSet>();
		
		ExColecoesSet aluno = new ExColecoesSet ("João da Silva" , "JAVA", 6.8);
		ExColecoesSet aluno1 = new ExColecoesSet ("Maria Souza " , "Linux", 7.8);
		ExColecoesSet aluno2 = new ExColecoesSet ("Renata Almeida" , "SO", 8.8);
		ExColecoesSet aluno3 = new ExColecoesSet ("José Nascimento" , "Internet", 5.5);
		
		conjunto.add(aluno);
		conjunto.add(aluno1);
		conjunto.add(aluno2);
		conjunto.add(aluno3);
		
		System.out.println(conjunto);
	}
}
