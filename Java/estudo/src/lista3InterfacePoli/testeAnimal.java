package lista3InterfacePoli;

public class testeAnimal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro (" Mel", 24, true);
		Cavalo cavalo = new Cavalo (" Jorge", 10, true);
		Preguica preguica = new Preguica ("Teresa", 5 ,true);
		
		cachorro.apresentaAnimal();

		cavalo.apresentaAnimal();
		
		preguica.apresentaAnimal();
		
		

	}
}
