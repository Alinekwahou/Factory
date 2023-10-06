package models;

public class ProduitfactoryC extends Produitfactory {
	public Produit getProduit() {
		return createproduit();
		
	}
	protected Produit createproduit() {
		return new ProduitC() ;
		
	}

}
