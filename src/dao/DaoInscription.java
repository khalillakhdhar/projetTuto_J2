package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface DaoInscription {
	void createInscription();
	void deleteInscription();
	ResultSet afficheInscription() throws SQLException;

}
