package ayj.examples.dps.strategy.dto;

import ayj.examples.dps.strategy.paiement.Payable;

public class Article implements Payable {

	private String nom;
	private int prix;

	public Article(String nom, int prix) {
		this.nom = nom;
		this.prix = prix;
	}

	public String getNom() {
		return this.nom;
	}

	@Override
	public int getPrix() {
		return this.prix;
	}

	@Override
	public String toString() {
		return String.format("%6s %3d €", nom,prix);
	}
	
	
}