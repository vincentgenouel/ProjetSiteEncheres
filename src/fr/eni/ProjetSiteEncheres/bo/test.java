package fr.eni.ProjetSiteEncheres.bo;

public class test {

	public static void main(String[] args) {
		
		
		System.out.println("hello world");
		
		Utilisateur johanna = new Utilisateur("psoeudo", "mon nom", "mon prenom", 
				"mail", "tel", "rue", "codep", "ma ville", "mdppp", 0, 1);
		
		
		ArticleVendu bouteille = new ArticleVendu(123, "bouteille", "description", null, null, 23, 45, 1);
		
		
		
		System.out.println();
	}

}
