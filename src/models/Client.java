package models;

public class Client {

	public static void main(String[] args) {
	
		Produitfactory produitfactoryA=new ProduitfactoryA();
		Produitfactory produitfactoryB=new ProduitfactoryB();
		
		Produit produit=null;
		
		System.out .print ("utilisation de la premiere fabrique");
		produit=produitfactoryA.createproduit();
		produit.methode();
		
		System.out .print ("utilisation de la deuxieme fabrique");
		produit=produitfactoryB.createproduit();
		produit.methode();
		
	

	}

}
