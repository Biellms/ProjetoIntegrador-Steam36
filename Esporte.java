package steam36;

import java.util.ArrayList;

public class Esporte {
	
	private ArrayList <Game> lista = new ArrayList <>();
	
	public Esporte () {	
		this.lista.add(new Game("Fifa 2022", 1, 259.00));
		this.lista.add(new Game("NBA 2k22",1 , 229.90));
		this.lista.add(new Game("F1 2021",1 , 169.90));
		this.lista.add(new Game("Forza Motorsport",1 , 49.99));
	}

	public ArrayList<Game> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Game> lista) {
		this.lista = lista;
	}
}
	
