package models;

public class ProduitfactoryB extends Produitfactory {
	public Produit getProduit() {
		return createproduit();
		
	}
	protected Produit createproduit() {
		return new ProduitB() ;
		
	}
}
