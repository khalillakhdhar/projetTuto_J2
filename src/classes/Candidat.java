package classes;

import java.sql.ResultSet;

import dao.DaoCandidat;

public class Candidat implements DaoCandidat {
private int id;
private String nom,prenom,tel,niveau,email,pass,grade;
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
