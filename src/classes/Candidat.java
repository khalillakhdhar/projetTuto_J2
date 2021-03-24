package classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.DaoCandidat;

public class Candidat implements DaoCandidat {
	private int id;
	private String nom, prenom, tel, niveau, email, pass, grade;

	public Candidat() {
		super();
	}

	public Candidat(String nom, String prenom, String tel, String niveau, String email, String pass, String grade) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.niveau = niveau;
		this.email = email;
		this.pass = pass;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Candidat [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", tel=" + tel + ", niveau=" + niveau
				+ ", email=" + email + ", pass=" + pass + ", grade=" + grade + "]";
	}

	@Override
	public void createCandidat() {
		// TODO Auto-generated method stub
		try {

			Connexion c = new Connexion();
			java.sql.PreparedStatement statement = c.conn.prepareStatement(
					"INSERT INTO `candidat`( `nom`, `prenom`, `tel`, `niveau`, `email`, `pass`, `grade`) VALUES('"
							+ this.getNom() + "','" + this.getPrenom() + "','" + this.getTel() + "','" + this.niveau
							+ "','" + this.getEmail() + "','" + this.getPass() + "','" + this.getGrade() + "')");
			statement.executeUpdate();
			System.out.println("ajouté avec succés");
		} catch (SQLException ex) {
			System.out.println(ex.toString());
		}
	}

	@Override
	public void updateCandidat() {
		// TODO Auto-generated method stub
		try
		{
			Connexion c=new Connexion();
			String sql="UPDATE `table` SET `nom`='"+this.getNom()+"',`prenom`='"+this.getPrenom()+"',`tel`='"+this.getTel()+"',`niveau`='"+this.getNiveau()+"',`email`='"+this.getEmail()+"',`prenom`='"+this.getPass()+"', WHERE `id`='"+this.getId()+"';";
					java.sql.PreparedStatement statement =
					c.conn.prepareStatement(sql);
					statement.executeUpdate();
					;
			
			
		}
		catch(Exception ex)
		{
			
			System.out.println("erreur"+ ex.toString());
			
		}
		
		

	}

	@Override
	public void deleteCandidat() {
		// TODO Auto-generated method stub

	}

	@Override
	public ResultSet afficheCandidats() throws SQLException {
		// TODO Auto-generated method stub
		Connexion c = new Connexion();
		PreparedStatement pst;
		pst = (PreparedStatement) c.conn.prepareStatement("SELECT * FROM candidat");
		pst.executeQuery();
		ResultSet rs = (ResultSet) pst.executeQuery();
		return rs;

	}

	@Override
	public Candidat authentifier(String email, String password) throws SQLException {
		// TODO Auto-generated method stub
		Connexion c = new Connexion();
		PreparedStatement pst;
		pst = (PreparedStatement) c.conn
				.prepareStatement("SELECT * FROM candidat WHERE email='" + email + "' AND pass='" + password + "' ");
		pst.executeQuery();
		ResultSet rs = (ResultSet) pst.executeQuery();
		if (rs.first()) {
			Candidat ca = new Candidat(rs.getString("nom"), rs.getString("prenom"), rs.getString("tel"),
					rs.getString("niveau"), rs.getString("email"), rs.getString("pass"), rs.getString("grade"));
			ca.setId(rs.getInt("id"));
			return ca;

		}
		// return rs;
		return null;
	}

}
