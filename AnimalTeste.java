package POOHeranca;

public class AnimalTeste {

	public static void main(String[] args) {
		
		//Exercício 1 - POO Herança
		
		Cachorro dog = new Cachorro("Thor",6);
		Cavalo horse = new Cavalo("Angus",18);
		Preguica sloth = new Preguica("Soninho",12);
		
		dog.imprimir();
		System.out.println("\n**********************");
		horse.imprimir();
		System.out.println("\n**********************");
		sloth.imprimir();
		

	}

}
