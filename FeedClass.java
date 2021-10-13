package ProjetoJava;

public class FeedClass {

	String teste = "FEED DE JOGOS";
	
	public FeedClass() {
		
	}
	
	public void print() {
		System.out.println("\n SUCESSO!!"+this.getTeste());
	}

	public String getTeste() {
		return teste;
	}

	public void setTeste(String teste) {
		this.teste = teste;
	}
	
	
}
