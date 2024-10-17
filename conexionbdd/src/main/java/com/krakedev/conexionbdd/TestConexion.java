package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement ps=null;
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","evermary1992");
			System.out.println("conexion exitosa");
			ps=connection.prepareStatement("insert into personas(cedula,nombre,apellido,estado_civil_codigo,numero_hijos,estatura,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento)"
					+"values(?,?,?,?,?,?,?,?,?)");//incognitas numeradas desde 1 tantas como sean las columnas
			ps.setString(1,"1713616123");
			ps.setString(2, "Rosalia");
			ps.setString(3, "Andrade");
			ps.setString(4, "S");
			ps.setInt(5, 2);
			ps.setDouble(6,1.56);
			ps.setBigDecimal(7, new BigDecimal(1200.45));//BigDecimal para datos tipo money
			
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr="2020/03/22 10:05:04";
			try {
				Date fecha =sdf.parse(fechaStr);
				System.out.println(fecha);
				long fechaMilis= fecha.getTime();//long para guardar enteros largos
				System.out.println(fechaMilis);
				//Crea un java.sql.Date, partiendo de una java.util.Date
				java.sql.Date fechaSQL=new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);
				
				Time timeSQL=new Time(fechaMilis);
				System.out.println(timeSQL);
				
				ps.setDate(8,fechaSQL);
				ps.setTime(9,timeSQL);
				
				ps.executeUpdate();
				System.out.println("ejecuta insert");
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
