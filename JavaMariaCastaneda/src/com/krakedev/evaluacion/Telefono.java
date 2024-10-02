package com.krakedev.evaluacion;

public class Telefono {
	private String numero;
	private String tipo;
	private String estado;

	public Telefono(String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;

		boolean errores = false;

		if (numero == null || tipo == null) {
			errores = true;
		} else if (!tipo.equals("Movil") && !tipo.equals("Convencional")) {
			errores = true;
		}else if (tipo.equals("Movil") && numero.length() != 10) {
			errores = true;
		} else if (tipo.equals("Convencional") && numero.length() != 7) {
			errores = true;
		}
		if (errores==true) {
			this.estado = "E";// Error
		} else {
			this.estado = "C";// Correcto
		}
	}

	public String getNumero() {
		return numero;
	}

	public String getTipo() {
		return tipo;
	}

	public String getEstado() {
		return estado;
	}

}
