package br.com.techsow.sherlock.model.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
	public static  Connection conectar()throws ClassNotFoundException, SQLException{
		return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","rm83958","010201");
	}
}
