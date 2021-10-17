package steam36;

import java.util.ArrayList;

public class Luta {
	
	private ArrayList <Game> lista = new ArrayList <>();
	
	public Luta () {	
		this.lista.add(new Game("Street Fighter V", 1, 124.90));
		this.lista.add(new Game("Injustice 2",1 , 104.90));
		this.lista.add(new Game("Mortal Kombat 11",1 , 119.90));
		this.lista.add(new Game("TEKKEN 7",1 , 189.99));
	}

	public ArrayList<Game> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Game> lista) {
		this.lista = lista;
	}
}
	
