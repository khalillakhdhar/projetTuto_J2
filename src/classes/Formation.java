package classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.DaoFormation;

public class Formation implements DaoFormation {
	private int id;
	private String titre, formateur, description;

	
	
	
	public Formation() {
		super();
	}

	public Formation(String titre, String formateur, String description) {
		super();
		this.titre = titre;
		this.formateur = formateur;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getFormateur() {
		return formateur;
	}

	public void setFormateur(String formateur) {
		this.formateur = formateur;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public void createFormation() {
		// TODO Auto-generated method stub
		try {

			Connexion c = new Connexion();
			java.sql.PreparedStatement statement = c.conn
					.prepareStatement("INSERT INTO `formation`( `titre`, `formateur`, `description`) VALUES ('"
							+ this.getTitre() + "','" + this.getFormateur() + "','" + this.getDescription() + "')");
			statement.executeUpdate();
			System.out.println("ajouté avec succés");
		} catch (SQLException ex) {
			System.out.println(ex.toString());
		}

	}

	@Override
	public void updateFormation(int idf) {
		// TODO Auto-generated method stub
		try
		{
			Connexion c=new Connexion();
			String sql="UPDATE `formation` SET `titre`='"+this.getTitre()+"',`formateur`='"+this.getFormateur()+"',`description`='"+this.getDescription()+"' WHERE id='"+idf+"';";
					java.sql.PreparedStatement statement =
					c.conn.prepareStatement(sql);
					statement.executeUpdate();
					System.out.println("modifié avec succés");
			
			
		}
		catch(Exception ex)
		{
			
			System.out.println("erreur lors de la modification "+ ex.toString());
			
		}
		
	}

	@Override
	public void deleteFormation(int idf) {
		// TODO Auto-generated method stub
		try {
			Connexion c=new Connexion();
			String sql = "DELETE FROM `formation` WHERE `id`=?";
			java.sql.PreparedStatement statement =
			c.conn.prepareStatement(sql); statement.setInt(1,idf);
			
			statement.execute();
			System.out.println("supprimé avec succés");
			} catch (SQLException ex) {
				System.out.println("erreur lors de la suppression "+ex.toString());
				
			}
	}

	@Override
	public ResultSet listFormation() throws SQLException {
		// TODO Auto-generated method stub
		Connexion c=new Connexion();
		PreparedStatement pst;
		pst = (PreparedStatement)
		c.conn.prepareStatement("SELECT * FROM formation");
		pst.executeQuery();
		ResultSet rs = (ResultSet) pst.executeQuery();
		return rs;
	}

	@Override
	public Formation findFormation(String titre) throws SQLException {
		// TODO Auto-generated method stub
		Connexion c=new Connexion();
		PreparedStatement pst2;
		pst2 = (PreparedStatement)
		c.conn.prepareStatement("SELECT * FROM formation where titre='"+titre+"'");
		pst2.executeQuery();
		ResultSet rs = (ResultSet) pst2.executeQuery();
if(rs.first())
{
Formation f=new Formation(rs.getString("titre"), rs.getString("formateur"), rs.getString("description"));
f.setId(rs.getInt("id"));
return f;
}
else 
	return null;
	
	}

	@Override
	public Formation searchFormation(int id) throws SQLException {
		// TODO Auto-generated method stub
		Connexion c=new Connexion();
		PreparedStatement pst2;
		pst2 = (PreparedStatement)
		c.conn.prepareStatement("SELECT * FROM formation where id='"+id+"'");
		pst2.executeQuery();
		ResultSet rs = (ResultSet) pst2.executeQuery();
if(rs.first())
{
Formation f=new Formation(rs.getString("titre"), rs.getString("formateur"), rs.getString("description"));
f.setId(rs.getInt("id"));
return f;
}
else 
	return null;
	}

}
