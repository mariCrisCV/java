package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.SQLException;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	
	public static void insertar(Persona persona) {
		Connection con=null;
		try {
			con=ConexionBDD.conectar();
			System.out.println("insertar");
		} catch (Exception e) {
			//mostrar el error al usuario
			System.out.println(e.getMessage());
			//loggear el error
			e.printStackTrace();
		}finally {//ocurra o no la excepcion siempre se ejecuta el finally
			//cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Error de infraestructura");
			}
		}
		
		
	}
	
}
