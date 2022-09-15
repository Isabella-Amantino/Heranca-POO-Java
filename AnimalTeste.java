package POOHeranca;

public class AnimalTeste {

	public static void main(String[] args) {
		
		//Exercício 1 - POO Herança e Polimorfismo
		
		Cachorro dog = new Cachorro("Thor",6);
		Cavalo horse = new Cavalo("Angus",18);
		Preguica sloth = new Preguica("Soninho",12);
		
		dog.Imprimir();
		System.out.println("\n******************\n");
		horse.Imprimir();
		System.out.println("\n******************\n");
		sloth.Imprimir();
		

						

	}

}
