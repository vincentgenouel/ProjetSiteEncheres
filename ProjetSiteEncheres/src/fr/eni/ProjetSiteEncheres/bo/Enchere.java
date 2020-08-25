package fr.eni.ProjetSiteEncheres.bo;

import java.time.LocalDate;

public class Enchere {

//Variables et constantes
	
	private LocalDate dateEncheres;
	private int montantEnchere;
	
	private ArticleVendu articleVendu;
	
	//Constructeur 
	
	public Enchere(LocalDate dateEncheres, int montantEnchere) {
		super();
		this.dateEncheres = dateEncheres;
		this.montantEnchere = montantEnchere;
	}

//GETTERS AND SETTERS
	public LocalDate getDateEncheres() {
		return dateEncheres;
	}
	public void setDateEncheres(LocalDate dateEncheres) {
		this.dateEncheres = dateEncheres;
	}
	public int getMontantEnchere() {
		return montantEnchere;
	}
	public void setMontantEnchere(int montantEnchere) {
		this.montantEnchere = montantEnchere;
	}
	
	public ArticleVendu getArticleVendu() {
		return articleVendu;
	}

	public void setArticleVendu(ArticleVendu articleVendu) {
		this.articleVendu = articleVendu;
	}


	@Override
	public String toString() {
		return "Enchere [dateEncheres=" + dateEncheres + ", montantEnchere=" + montantEnchere + "]";
	}

	
	
}
