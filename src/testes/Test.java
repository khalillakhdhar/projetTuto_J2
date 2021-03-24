package testes;
import java.sql.ResultSet;
import java.sql.SQLException;

import classes.Candidat;
import classes.Connexion;
import classes.Formation;
import classes.Session;
public class Test {
	public static void main(String args[])
	{
		// Connexion c=new Connexion();
		
Formation f=new Formation("JSP", "Khalil", "JSP SERVLET JDBC ET JSTL");
//f.createFormation();
//try {
//	ResultSet rs=f.listFormation();
//	while(rs.next())
//	{
//		System.out.println(rs.getInt("id"));
//		System.out.println(rs.getString("titre")+" "+rs.getString("description"));
//		
//	}
//} catch (SQLException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}

Session s=new Session(24, 1, "12/04/2021", 4200);
s.createSession();

	}
}
