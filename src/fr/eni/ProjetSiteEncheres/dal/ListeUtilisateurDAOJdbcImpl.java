/*package fr.eni.ProjetSiteEncheres.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eni.ProjetSiteEncheres.BusinessException;


public class ListeUtilisateurDAOJdbcImpl implements ListeUtilisateurDAO {

	//private static final String SELECT_ALL = "SELECT no_utilisateur, pseudo FROM LISTE";
	private static final String SELECT_BY_NO_UTILISATEUR =	"select " +
															"u.noUtilisateur as no_utilisateur, "+
															"u.pseudo as pseudo_utilisateur, " +
															"u.prenom as prenom_utilisateur, " +
															"u.email as pseudo_utilisateur, " +
															"u.telephone as telephone_utilisateur" +
															"u.rue as rue_utilisateur" +
															"u.code_postal as code_postal_utilisateur" +
															"u.ville as ville_utilisateur" +
															"u.mot_de_passe as mot_de_passe_utilisateur" +
															"u.credit as credit_utilisateur" +
															"u.administrateur as administrateur_utilisateur";
	private static final String INSERT_UTILISATEUR = "insert into UTILISATEUR(no_utilisateur) value(?);";
	private static final String DELETE_UTILISATEUR = "delete from utilisateur where id=?" ;
	
	
	// méthode qui permet de créer un utilisateur dans la liste des utilisateur
	@Override
	public void insert(Utilisateur Utilisateur) throws BusinessException {
		if(Utilisateur==null)
		{
		
		try(Connection cnx = ConnectionProvider.getConnection())
		{
			try
			{
				cnx.setAutoCommit(false);
				PreparedStatement pstmt;
				ResultSet rs;
				if(Utilisateur.getpseudo()==null)
				{
					pstmt = cnx.prepareStatement(INSERT_UTILISATEUR, PreparedStatement.RETURN_GENERATED_KEYS);
					pstmt.setString(1, Utilisateur.getPseudo());
					pstmt.executeUpdate();
					rs = pstmt.getGeneratedKeys();
					if(rs.next())
					{
						Utilisateur.setNoUtilisateur(rs.getInt(1));
					}
					rs.close();
					pstmt.close();
				}
				//if(listeUtilisateur.getArticles().size()==1)
				//{
				//	pstmt = cnx.prepareStatement(INSERT_ARTICLE);
				//	pstmt.setString(1, listeCourse.getArticles().get(0).getNom());
				//	pstmt.setInt(2, listeCourse.getId());
				//	pstmt.executeUpdate();
				//	pstmt.close();
				//}
				cnx.commit();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				cnx.rollback();
				throw e;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Il y a une erreur.");
		}
	}
	
	}
	// méthode qui permet de supprimer un utilisateur par son numéro d'utilisateur
	//@Override
	//public void delete(int noUtilisateur) throws BusinessException {
	//	try(Connection cnx = ConnectionProvider.getConnection())
	//	{
	//		PreparedStatement pstmt = cnx.prepareStatement(DELETE_UTILISATEUR);
	//		pstmt.setInt(1, noUtilisateur);
	//		pstmt.executeUpdate();
	//	} catch (SQLException e) {
	//		e.printStackTrace();
	//		BusinessException businessException = new BusinessException();
	//		businessException.ajouterErreur(CodesResultatDAL.SUPPRESSION_LISTE_ERREUR);
	//		throw businessException;
	//	}
	//	}
	
	
	//méthode qui permet de selectionner un utilisateur par le numéro d'utilisateur
	@Override
	public Utilisateur selectByNoUtilisateur(int noUtilisateur) throws BusinessException {
		//Utilisateur Utilisateur = new Utilisateur();
		try(Connection cnx = ConnectionProvider.getConnection())
		{
			PreparedStatement pstmt = cnx.prepareStatement(SELECT_BY_NO_UTILISATEUR);
			pstmt.setInt(1, noUtilisateur);
			ResultSet rs = pstmt.executeQuery();
			boolean premiereLigne=true;
			while(rs.next())
			{
				if(premiereLigne)
				{
					listeUtilisateur.setnoUtilisateur(rs.getInt("noUtilisateur_utilisateur"));
					listeUtilisateur.setNom(rs.getString("nom_liste"));
					premiereLigne=false;
				}
				if(rs.getString("pseudo_utilisateur")!=null)
				{
					listeCourse.getArticles().add(new Article(rs.getInt("id_article"), rs.getString("nom_article"), rs.getBoolean("coche")));
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.LECTURE_LISTE_ECHEC);
			throw businessException;
		}
		if(listeCourse.getId()==0)
		{
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.LECTURE_LISTE_INEXISTANTE);
			throw businessException;
		}
		
		return liste
;
	}

	
	
}
*/