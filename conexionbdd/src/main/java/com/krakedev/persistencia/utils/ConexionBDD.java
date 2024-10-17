package com.krakedev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBDD {
	private final static String DRIVER="org.postgresql.Driver";
	private final static String URL="jdbc:postgresql://localhost:5432/postgres";
	private final static String USUARIO="postgres";
	private final static String CLAVE="evermary1992";
	
	public static Connection conectar() throws Exception {
		Connection connection=null;
		try {
			Class.forName(DRIVER);
			connection=DriverManager.getConnection(URL,USUARIO,CLAVE);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new Exception("Error en la infraestructura");//relanzo la excepcion con un mensaje que pueda entender el usuario
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Error al conectarse, revise usuario y clave");
		}
		return connection;
	}
}
