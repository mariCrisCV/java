package com.krakedev.estaticos.ejercicio.utils;

public class Util {

	public static String formatearHora(int numero) {
		String valor = numero + "";
		if (valor.length() < 2) {
			valor = "0" + valor;
		}
		return valor;
	}

	public static String formatearDia(int numeroDia) {
		String dia = null;
		if (numeroDia == DiasSemana.LUNES) {
			dia = "Lunes";
		} else if (numeroDia == DiasSemana.MARTES) {
			dia = "Martes";
		} else if (numeroDia == DiasSemana.MIERCOLES) {
			dia = "Miércoles";
		} else if (numeroDia == DiasSemana.JUEVES) {
			dia = "Jueves";
		} else if (numeroDia == DiasSemana.VIERNES) {
			dia = "Viernes";
		} else if (numeroDia == DiasSemana.SABADO) {
			dia = "Sábado";
		} else if (numeroDia == DiasSemana.DOMINGO) {
			dia = "Domingo";
		}
		return dia;
	}
}
