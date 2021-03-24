package dao;

import java.sql.ResultSet;

import classes.Candidat;

public interface DaoCandidat {
void createCandidat();
void updateCandidat();
void deleteCandidat();
ResultSet afficheCandidats();
Candidat authentifier(String email,String password);
}
