package steam36;

import java.util.ArrayList;

public class RPG {
	
	private ArrayList <Game> lista = new ArrayList <>();
	
	public RPG () {	
		this.lista.add(new Game("Dark Souls III: The Fire Fades Edition", 1, 129.99));
		this.lista.add(new Game("Bloodborne",1 , 69.50));
		this.lista.add(new Game("The Witcher 3: Wild Hunt",1 , 79.99));
		this.lista.add(new Game("The Elder Scrolls V: Skyrim",1 , 119.99));
	}

	public ArrayList<Game> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Game> lista) {
		this.lista = lista;
	}
}
	

