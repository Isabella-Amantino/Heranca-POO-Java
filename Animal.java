package POOHeranca;

public abstract class Animal {
	
	//Exercício 1 - POO Herança e Polimorfismo
	
	 private String nome;
	 int idade;
	 
	 public Animal(String nome, int idade) {
		 this.nome = nome;
		 this.idade = idade;
				 
	 }
	
	abstract public void emitirSom();
	abstract public void acao();
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	}

