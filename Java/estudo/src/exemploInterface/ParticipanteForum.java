package exemploInterface;

public class ParticipanteForum implements Leitor, Programador {
	String pensamento;

	public String lendo() {
		return "Fórum";
	}
	
	public void pensando (char [] ideias) {
		pensamento = new String (ideias);
	}
	
	public String digitando () {
		
		return pensamento;
	}
	
	private String aprendendo () {
		return "Java";
	}
}
