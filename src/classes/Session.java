package classes;

import java.sql.ResultSet;

import dao.DaoSession;

public class Session implements DaoSession {
private int id,duree,id_formation;
private String date;
private float prix;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getDuree() {
	return duree;
}
public void setDuree(int duree) {
	this.duree = duree;
}
public int getId_formation() {
	return id_formation;
}
public void setId_formation(int id_formation) {
	this.id_formation = id_formation;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public float getPrix() {
	return prix;
}
public void setPrix(float prix) {
	this.prix = prix;
}
@Override
public void createSession() {
	// TODO Auto-generated method stub
	
}
@Override
public void updateSession(int id) {
	// TODO Auto-generated method stub
	
}
@Override
public void deleteSession(int id) {
	// TODO Auto-generated method stub
	
}
@Override
public ResultSet afficheSession() {
	// TODO Auto-generated method stub
	return null;
}








}
