package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import classes.Formation;

public interface DaoFormation {
void createFormation();
void updateFormation(int id);
void deleteFormation(int id);
ResultSet listFormation() throws SQLException;
Formation findFormation(String titre);
Formation searchFormation(int id);
}
