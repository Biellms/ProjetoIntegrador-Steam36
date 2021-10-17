package steam36;

import java.util.ArrayList;

public class Esporte {
	
	
	private ArrayList <Game> lista = new ArrayList <>();
	
	public Esporte () {	
		this.lista.add(new Game("Fifa 2022", 1, 259.00));
		this.lista.add(new Game("Crash Bandicoot",1 , 149.90));
		this.lista.add(new Game("Spyro",1 , 149.90));
		this.lista.add(new Game("Hollow Knight",1 , 27.99));
	}

	public ArrayList<Game> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Game> lista) {
		this.lista = lista;
	}
}
	
