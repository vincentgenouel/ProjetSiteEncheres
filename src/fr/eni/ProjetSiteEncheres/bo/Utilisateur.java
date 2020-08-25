package fr.eni.ProjetSiteEncheres.bo;

import java.util.List;

/**
 * 
 * @author jrigollo2020
 *classe utilisateur
 */
public class Utilisateur {

/*
 * variables et constantes
 */
	private String noUtilisateur;
	private String psoeudo;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String rue;
	private String codePostal;
	private String ville;
	private String motDePasse;
	private int credit;
	private int administrateur;
	
	private List<ArticleVendu> articleVendu;
	private List<Enchere> enchere;
/*
 * Constructeur
 */
	public Utilisateur(String psoeudo, String nom, String prenom, String email, String telephone,
			String rue, String codePostal, String ville, String motDePasse, int credit, int administrateur) {
		super();
		this.psoeudo = psoeudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
		this.administrateur = administrateur;
	}

	
//GETTERS AND SETTERS
	public String getNoUtilisateur() {
		return noUtilisateur;
	}


	public void setNoUtilisateur(String noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}


	public String getPsoeudo() {
		return psoeudo;
	}


	public void setPsoeudo(String psoeudo) {
		this.psoeudo = psoeudo;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getRue() {
		return rue;
	}


	public void setRue(String rue) {
		this.rue = rue;
	}


	public String getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getMotDePasse() {
		return motDePasse;
	}


	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}


	public int getCredit() {
		return credit;
	}


	public void setCredit(int credit) {
		this.credit = credit;
	}


	public int getAdministrateur() {
		return administrateur;
	}


	public void setAdministrateur(int administrateur) {
		this.administrateur = administrateur;
	}
	
	public List<ArticleVendu> getArticleVendu() {
		return articleVendu;
	}


	public void setArticleVendu(List<ArticleVendu> articleVendu) {
		this.articleVendu = articleVendu;
	}


	public List<Enchere> getEnchere() {
		return enchere;
	}


	public void setEnchere(List<Enchere> enchere) {
		this.enchere = enchere;
	}
	
	
	@Override
	public String toString() {
		return "Utilisateur [noUtilisateur=" + noUtilisateur + ", psoeudo=" + psoeudo + ", nom=" + nom + ", prenom="
				+ prenom + ", email=" + email + ", telephone=" + telephone + ", rue=" + rue + ", codePostal="
				+ codePostal + ", ville=" + ville + ", motDePasse=" + motDePasse + ", credit=" + credit
				+ ", administrateur=" + administrateur + "]";
	}
}
