package steam36;

import java.util.ArrayList;

public class RPG {
	
	
	private ArrayList <Game> lista = new ArrayList <>();
	
	public RPG () {	
		this.lista.add(new Game("Dark Souls III", 1, 179.90));
		this.lista.add(new Game("Bloodborne",1 , 99.50));
		this.lista.add(new Game("GTA V: Edição Premium",1 , 79.95));
		this.lista.add(new Game("New World",1 , 75.99));
	}

	public ArrayList<Game> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Game> lista) {
		this.lista = lista;
	}
}
	

