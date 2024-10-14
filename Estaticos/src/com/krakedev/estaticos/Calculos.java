package com.krakedev.estaticos;

public class Calculos {
	//final hace que el valor no se pueda cambiar, es decir, convierte la variable en una constante
	private final double IVA=12; //SE ESTRIBEN EN MAYUSCULAS
	
	public double calcularIva(double monto) {
		return monto*IVA/100;
	}
	
	
}
