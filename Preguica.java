package POOHeranca;

public class Preguica extends Animal {
	
	//Exercício 1 - POO Herança
	
	public Preguica(String nome,int idade) {
		super(nome,idade);
	}
	
	public String emitirSom() {
		return "A preguiça está emitindo um som";
	}
	
	public String subirArvores() {
		return "A preguiça está subindo em árvores.";
	}
	public void imprimir() {
		System.out.println("\nNome da preguiça: "+getNome()+"\nIdade da preguiça: "+getIdade()+" anos \n"+emitirSom()+"\n"+subirArvores());
}
}