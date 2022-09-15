package POOHeranca;

public class Cavalo extends Animal {
	
	//Exercício 1 - POO Herança e Polimorfismo
	
	public Cavalo(String nome,int idade) {
		super(nome,idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O cavalo está relinchando:*iiirrrrí* ");
	}
	
	@Override
	public void acao() {
		System.out.println("O cavalo está correndo.");
	}
	public void Imprimir() {
		System.out.println("Nome do cavalo: "+getNome());
		System.out.println("Idade do cavalo: "+getIdade()+" anos");
		emitirSom();
		acao();
	}
}
