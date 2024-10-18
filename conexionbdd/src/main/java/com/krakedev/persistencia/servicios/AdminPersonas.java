package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	public static void insertar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a insertar>>> " + persona);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"insert into personas(cedula,nombre,apellido,estado_civil_codigo,numero_hijos,estatura,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento)"
							+ "values(?,?,?,?,?,?,?,?,?)");// incognitas numeradas desde 1 tantas como sean las columnas
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setString(4, persona.getEstadoCivil().getCodigo());
			ps.setInt(5, persona.getNumeroHijos());
			ps.setDouble(6, persona.getEstatura());
			ps.setBigDecimal(7, persona.getCantidadAhorrada());
			ps.setDate(8, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(9, new Time(persona.getHoraNacimiento().getTime()));

			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {// creo una nueva excepcion si es sql Exception
				LOGGER.error("Error con la base de datos", e);// logger: mensaje y objetoException
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static void actualizar(Persona personaAActualizar) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a actualizar>>> " + personaAActualizar);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"update personas set nombre=?,apellido=?,estado_civil_codigo=?,numero_hijos=?,estatura=?,cantidad_ahorrada=?,fecha_nacimiento=?,hora_nacimiento=?"
							+ " where cedula =?");
			ps.setString(1, personaAActualizar.getNombre());
			ps.setString(2, personaAActualizar.getApellido());
			ps.setString(3, personaAActualizar.getEstadoCivil().getCodigo());
			ps.setInt(4, personaAActualizar.getNumeroHijos());
			ps.setDouble(5, personaAActualizar.getEstatura());
			ps.setBigDecimal(6, personaAActualizar.getCantidadAhorrada());
			ps.setDate(7, new java.sql.Date(personaAActualizar.getFechaNacimiento().getTime()));
			ps.setTime(8, new Time(personaAActualizar.getHoraNacimiento().getTime()));

			ps.setString(9, personaAActualizar.getCedula()); // Cédula en la última posición

			int filasActualizadas = ps.executeUpdate();
			if (filasActualizadas > 0) {
				LOGGER.info("Persona actualizada con éxito.");
			} else {
				LOGGER.warn("No se encontró la persona con cédula: " + personaAActualizar.getCedula());
			}
		} catch (Exception e) {
			LOGGER.error("Error al actualizar", e);
			throw new Exception("Error al actualizar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}
	
	public static void eliminar(String cedula) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona eliminada>>> " + cedula);
		try {
			// abrir la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("delete from personas where cedula=?");
			
			ps.setString(1,cedula);
			
			int filasEliminadas = ps.executeUpdate();
			if (filasEliminadas > 0) {
				LOGGER.info("Persona eliminada con éxito.");
			} else {
				LOGGER.warn("No se encontró la persona con cédula: " + cedula);
			}
		} catch (Exception e) {
			LOGGER.error("Error al eliminar", e);
			throw new Exception("Error al eliminar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}
	
}
