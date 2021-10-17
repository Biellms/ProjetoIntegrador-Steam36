package steam36;

import java.text.NumberFormat;

public class Game {

	// Atributos
	private String nomeJogo;
	private double precoUni;
	private int qtd;


	// construtores
	public Game(String nomeJogo,int qtd, double precoUni) {
		this.nomeJogo = nomeJogo;
		this.qtd = qtd;
		this.precoUni = precoUni;
	}
	
	public String formatarMoeda() {	// Formatar Preço para R$ 0.000,00
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(precoUni);
		return formatoMoeda;
	}
	
	// Getters & Setters
	public String getNomeJogo() {
		return nomeJogo;
	}
	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}
	public double getPrecoUni() {
		return precoUni;
	}
	public void setPrecoUni(double precoUni) {
		this.precoUni = precoUni;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}




}
