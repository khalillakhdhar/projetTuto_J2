package testes;
import java.sql.ResultSet;
import java.sql.SQLException;

import classes.Candidat;
import classes.Connexion;
public class Test {
	public static void main(String args[])
	{
		//Connexion c=new Connexion();
		Candidat c=new Candidat("nom", "prenom", "tel", "niveau", "email", "pass", "grade");
		//c.createCandidat();
		try {
			ResultSet rs=c.afficheCandidats();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
