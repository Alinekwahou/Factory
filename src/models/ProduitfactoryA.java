package models;

public class ProduitfactoryA extends Produitfactory {
	public Produit getProduit() {
		return createproduit();
		
	}
	protected Produit createproduit() {
		return new ProduitA() ;
		
	}
	
	
}
	
		
