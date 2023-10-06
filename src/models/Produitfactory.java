package models;

public abstract class Produitfactory{
	public Produit getProduit() {
	return createproduit();

	
}
	protected abstract Produit createproduit(); 
		


}
