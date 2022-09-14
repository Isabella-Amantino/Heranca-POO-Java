package POOHeranca;

public class Cachorro extends Animal{
	
	//Exercício 1 - POO Herança
	
	public Cachorro (String nome, int idade) {
		super(nome,idade);
	}
	
	public String emitirSom() {
		return "\nO cachorro está latindo: *AU,AU,AU...*";
	}
	
	public String correr() {
		return"\nO cachorro está correndo.";
	}
	public void imprimir() {
		System.out.println("\nNome do cachorro: "+getNome()+"\nIdade do cachorro: "+getIdade()+" anos "+emitirSom()+"  "+correr());
		
		
	}
}
