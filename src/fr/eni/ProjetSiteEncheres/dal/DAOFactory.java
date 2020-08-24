package fr.eni.ProjetSiteEncheres.dal;

public class DAOFactory {
	
	public static ListeUtilisateurDAO getListeUtilisateurDAO() {

	return new ListeUtilisateurDAOJdbcImpl();
	}
}
