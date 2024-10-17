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

public class TestRegistros {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement ps=null;
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","evermary1992");
			System.out.println("conexion exitosa");
			ps=connection.prepareStatement("insert into prestamo(cedula,monto,fecha_prestamo)"
					+"values(?,?,?)");
			ps.setString(1,"1718192021");
			ps.setBigDecimal(2, new BigDecimal(368.85));
										
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
			String fechaStr="2021/04/02";
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
				
				ps.setDate(3,fechaSQL);
								
				ps.executeUpdate();
				System.out.println("ejecuta insert2");
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	

	}


