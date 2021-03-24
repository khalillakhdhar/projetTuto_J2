package dao;

import java.sql.ResultSet;

import classes.Formation;

public interface DaoFormation {
void createFormation();
void updateFormation(int id);
void deleteFormation(int id);
ResultSet listFormation();
Formation findFormation(String titre);
Formation searchFormation(int id);
}
