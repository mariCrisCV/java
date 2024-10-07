package com.cmc.evaluacion.entidades;

import com.cmc.evaluacion.servicios.Utilitarios;

public class Cuota {
	private int numero;
	private double cuota1;
	private double capitalInicio;
	private double interes;
	private double abonoCapital;
	private double saldo;
	
	public Cuota(int numero) {
		this.numero = numero;
	}
	public double getCuota1() {
		return cuota1;
	}
	public void setCuota1(double cuota1) {
		this.cuota1 = cuota1;
	}
	public double getCapitalInicio() {
		return capitalInicio;
	}
	public void setCapitalInicio(double capitalInicio) {
		this.capitalInicio = capitalInicio;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public double getAbonoCapital() {
		return abonoCapital;
	}
	public void setAbonoCapital(double abonoCapital) {
		this.abonoCapital = abonoCapital;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void mostrarPrestamo() {
		double cuotaFormato=Utilitarios.redondearConBigDecimal(cuota1);
		double capitalInicioFormato=Utilitarios.redondearConBigDecimal(capitalInicio);
		double interesFormato=Utilitarios.redondearConBigDecimal(interes);
		double abonoCapitalFormato=Utilitarios.redondearConBigDecimal(abonoCapital);
		double saldoFormato=Utilitarios.redondearConBigDecimal(saldo);
		
		System.out.println(numero+" |"+cuotaFormato+" |"+capitalInicioFormato+" |"+interesFormato+" |"+abonoCapitalFormato+" |"+saldoFormato);
	}
	
}
