package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import classes.Candidat;

public interface DaoCandidat {
void createCandidat();
void updateCandidat();
void deleteCandidat();
ResultSet afficheCandidats() throws SQLException;
Candidat authentifier(String email,String password);
}
