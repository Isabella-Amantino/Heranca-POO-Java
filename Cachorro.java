package POOHeranca;

public class Cachorro extends Animal{
	
	//Exercício 1 - POO Herança e Polimorfismo
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
		
		
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O cachorro está latindo: *Au au au...* ");
	}
	@Override
	public void acao() {
		System.out.println("O cachorro está correndo.");
	}
	public void Imprimir() {
		System.out.println("Nome do cachorro: "+getNome());
		System.out.println("Idade do cachorro: "+getIdade()+" anos");
		emitirSom();
		acao();
	}
	}

