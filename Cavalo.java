package POOHeranca;

public class Cavalo extends Animal {
	
	//Exercício 1 - POO Herança
	
	public Cavalo(String nome,int idade) {
		super(nome,idade);
	}
	
	public String emitirSom(){
		return "O cavalo está relinchando: *iiirrrrí*";
	}
	
	public String correr() {
		return "O cavalo está correndo.";
	}
	public void imprimir() {
		System.out.println("\nNome do cavalo: "+getNome()+"\nIdade do cavalo: "+getIdade()+" anos \n"+emitirSom()+"\n"+correr());

}
}
