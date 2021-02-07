package exemploInterface;

public class testeInterface {

	public static void main(String[] args) {
		ParticipanteForum participante = new ParticipanteForum();
		Leitor leitor = participante;
		System.out.println("O participante está lendo: " + leitor.lendo());
		Programador programador = participante;
		

		String Java = "JAVA";
		programador.pensando("JAVA".toCharArray());
		System.out.println(" E programando: " + programador.digitando());
	}

}
