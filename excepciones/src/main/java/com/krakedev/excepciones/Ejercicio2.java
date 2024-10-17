package com.krakedev.excepciones;

import java.io.File;
import java.io.IOException;

public class Ejercicio2 {
	public void metodo1() {
		
		String a=null;
		a.substring(0);
		//NPE Unchecked (a pesar de que va a saltar un error, solo me sale un warning)
	}
	
	public void metodo2() {
		File f=new File("archivo1.txt");
		try {
			f.createNewFile(); //IOException - CHECKED (desde que estoy compilando ya me salta el error)
		}catch(IOException io) {
			System.out.println("error");
		}
		
	}
	
	public void metodo3() throws IOException{
		File f=new File("archivo1.txt");
		f.createNewFile(); //IOException - CHECKED (desde que estoy compilando ya me salta el error)
	}
	
	public void metodo4() {
		metodo3();
	}
}
