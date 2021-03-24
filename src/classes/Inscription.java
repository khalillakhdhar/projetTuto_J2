package classes;

import dao.DaoInscription;

public class Inscription implements DaoInscription {
private int id,id_user,id_session;
private String date_heure;
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
	
}

@Override
public void deleteInscription() {
	// TODO Auto-generated method stub
	
}




}
