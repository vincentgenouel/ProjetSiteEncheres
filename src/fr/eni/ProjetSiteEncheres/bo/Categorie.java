package fr.eni.ProjetSiteEncheres.bo;
/**
 * 
 * @author jrigollo2020
 *classe définissant la catégorie d'un article
 */
import java.util.List;


public class Categorie {
	
//Variables et constantes
	
	private int noCategorie;
	private String libelle;
	private List<ArticleVendu> articleVendu;

//constructeur
	
	public Categorie(int noCategorie, String libelle) {
		super();
		this.noCategorie = noCategorie;
		this.libelle = libelle;
	}

//GETTERS AND SETTERS
	public int getNoCategorie() {
		return noCategorie;
	}


	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<ArticleVendu> getArticleVendu() {
		return articleVendu;
	}

	public void setArticleVendu(List<ArticleVendu> articleVendu) {
		this.articleVendu = articleVendu;
	}
	
	
	@Override
	public String toString() {
		return "Categorie [noCategorie=" + noCategorie + ", libelle=" + libelle + "]";
	}


	
	
	
}
