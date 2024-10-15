package com.krakedev;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Admin {
	private static Logger logger=LogManager.getLogger(Admin.class);
	
	public void agregar() {
		logger.warn("mensaje de warn");//nivel más bajo, se llena de archivos warn 
		logger.info("mensaje de info");
		logger.debug("mensaje de debug");//para saber por que camino se fue
		logger.trace("mensaje de trace");//se imprime trace y todos los de menor detalle, nivel alto de detalle, pero se le puede llenar de informacion muy detallada, se usa para encontrar el error.
		
		//se coloca el nivel en funcion de los criterios del equipo 
		
		logger.error("mensaje de error");//siempre, es independiente de la configuracion
	}
	
	
}
