package POOHeranca;

public class Preguica extends Animal {
	
	//Exercício 1 - POO Herança e Polimorfismo
	
	public Preguica(String nome,int idade) {
		super(nome,idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("A preguiça está emitindo um som");
	}
	
	@Override
	public void acao() {
		System.out.println("A preguiça está subindo em árvores.");
	}
	public void Imprimir() {
		System.out.println("Nome da preguiça: "+getNome());
		System.out.println("Idade da  preguiça: "+getIdade()+" anos");
		emitirSom();
		acao();
	}
}