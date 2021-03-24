package classes;

import java.sql.ResultSet;

import dao.DaoFormation;

public class Formation implements DaoFormation {
private int id;
private String titre, formateur, description;
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
	
}
@Override
public void updateFormation(int id) {
	// TODO Auto-generated method stub
	
}
@Override
public void deleteFormation(int id) {
	// TODO Auto-generated method stub
	
}
@Override
public ResultSet listFormation() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public Formation findFormation(String titre) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public Formation searchFormation(int id) {
	// TODO Auto-generated method stub
	return null;
}




}
