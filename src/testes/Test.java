package testes;
import java.sql.ResultSet;
import java.sql.SQLException;

import classes.Candidat;
import classes.Connexion;
import classes.Formation;
import classes.Inscription;
import classes.Session;
public class Test {
	public static void main(String args[])
	{
	
//	Session s= new Session(22,1, "xx",6000);
//	try {
//		ResultSet res=s.afficheSession();
//		while(res.next())
//		{
//			System.out.println(res.getInt("id"));
//			System.out.println(res.getString("titre")+"/ "+res.getString("prix"));
//			
//			
//		}
//		
//		
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
//	Candidat cn=new Candidat("administrateur", "admin", "20744351", "administration", "admin@gmail.com", "admin", "admin");
//	cn.setId(1);
//	cn.updateCandidat();
//
		
//		Candidat ca=new Candidat();
//		ca.setId(2);
//		ca.deleteCandidat();
		
		Formation f1=new Formation("Spring boot","inconnu", "Spring MVC 5 et BOOT for API");
	//	f1.setId(2);
		f1.updateFormation(2);
		f1.deleteFormation(2);
		
		
	}
}
