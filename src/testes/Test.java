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
			
//			if(rs.first())
//			{
//				System.out.println(rs.getInt("id"));
//				System.out.println(rs.getString("nom")+" "+rs.getString("prenom"));
//				
//			}
			while(rs.next())
			{
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("nom")+" "+rs.getString("prenom"));
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
