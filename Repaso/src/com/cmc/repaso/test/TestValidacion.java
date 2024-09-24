package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion valor=new Validacion();
		
		valor.validarMonto(15);
		valor.validarMonto(-2);
	}

}
