package dao;

import java.sql.ResultSet;

public interface DaoSession {
void createSession();
void updateSession(int id);
void deleteSession(int id);
ResultSet afficheSession();

}
