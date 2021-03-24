package classes;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.DaoInscription;

public class Inscription implements DaoInscription {
	private int id, id_user, id_session;
	private String date_heure;

	public Inscription(int id_user, int id_session) {
		super();
		this.id_user = id_user;
		this.id_session = id_session;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public int getId_session() {
		return id_session;
	}

	public void setId_session(int id_session) {
		this.id_session = id_session;
	}

	public String getDate_heure() {
		return date_heure;
	}

	public void setDate_heure(String date_heure) {
		this.date_heure = date_heure;
	}

	@Override
	public void createInscription() {
		// TODO Auto-generated method stub
		try {

			Connexion c = new Connexion();
			java.sql.PreparedStatement statement = c.conn
					.prepareStatement("INSERT INTO `inscription`(`id_user`, `id_session`) VALUES ('" + this.getId_user()
							+ "','" + this.getId_session() + "')");
			statement.executeUpdate();
			System.out.println("ajouté avec succés");
		} catch (SQLException ex) {
			System.out.println(ex.toString());
		}
	}

	@Override
	public void deleteInscription() {
		// TODO Auto-generated method stub

	}

	@Override
	public ResultSet afficheInscription() {
		// TODO Auto-generated method stub
		return null;
	}

}
