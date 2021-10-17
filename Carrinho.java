package steam36;

import java.util.ArrayList;

public class Carrinho {

	private ArrayList <Game> lista = new ArrayList <>();
	
	public Carrinho () {	
		
	}

	public ArrayList<Game> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Game> lista) {
		this.lista = lista;
	}
	
}
