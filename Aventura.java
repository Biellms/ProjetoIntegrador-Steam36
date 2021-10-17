package steam36;

import java.util.ArrayList;

public class Aventura {
	
	private ArrayList <Game> lista = new ArrayList <>();
	
	public Aventura () {
		this.lista.add(new Game("God Of War",1 , 79.99));
		this.lista.add(new Game("The Last Of Us (Part II)",1 , 99.99));
		this.lista.add(new Game("Ori and the Blind Forest", 1, 59.00));
		this.lista.add(new Game("Crash Bandicoot N.Sane Trilogy",1 , 79.90));
	}

	public ArrayList<Game> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Game> lista) {
		this.lista = lista;
	}
}
	
