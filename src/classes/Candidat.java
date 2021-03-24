package classes;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.DaoCandidat;

public class Candidat implements DaoCandidat {
	private int id;
	private String nom, prenom, tel, niveau, email, pass, grade;

	
	
	
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
public void createCandidat() {
	// TODO Auto-generated method stub
	try {

		Connexion c = new Connexion();
		java.sql.PreparedStatement statement = c.conn
				.prepareStatement("INSERT INTO `candidat`( `nom`, `prenom`, `tel`, `niveau`, `email`, `pass`) VALUES('"
						+ this.getNom() + "','" + this.getPrenom() + "','" + this.getTel() + "','" + this.niveau + "','"
						+ this.getEmail() + "','" + this.getPass() + "')");
		statement.executeUpdate();
		System.out.println("ajout� avec succ�s");
	} catch (SQLException ex) {
		System.out.println(ex.toString());
	}
}

	@Override
	public void updateCandidat() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCandidat() {
		// TODO Auto-generated method stub

	}

	@Override
	public ResultSet afficheCandidats() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Candidat authentifier(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
