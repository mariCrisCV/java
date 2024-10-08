package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.Cuota;
import com.cmc.evaluacion.entidades.Prestamo;

public class CalculadoraAmortizacion {
	
	public static double calcularCuota(Prestamo prestamo) {
		double cuota = 0.0;
		double interesAnual = 0.0;
		interesAnual = (prestamo.getInteres() / 12) / 100;
		cuota = (prestamo.getMonto() * interesAnual) / (1 - Math.pow((1 + interesAnual), prestamo.getPlazo() * -1));

		return cuota;
	}
	
	public static void generarTabla(Prestamo prestamo) {
		double cuotaCalculada = calcularCuota(prestamo);

		for (int i = 0; i < prestamo.getPlazo(); i++) {// Inicializa cuotas
			Cuota cuota1 = new Cuota(i+1);
			cuota1.setCuota1(cuotaCalculada);
			prestamo.agregarCuota(cuota1);
		}
		
		// Valor Inicio de la primera cuota
		prestamo.getCuotas().get(0).setCapitalInicio(prestamo.getMonto());
		// Valores para cada cuota
		for (int i = 0; i < prestamo.getPlazo(); i++) {
			Cuota cuotaActual = prestamo.getCuotas().get(i);
			Cuota cuotaSiguiente;
			if (i < prestamo.getPlazo() - 1) {
	            cuotaSiguiente = prestamo.getCuotas().get(i + 1);
	        } else {
	            cuotaSiguiente = null;
	        }
			calcularValoresCuota(prestamo.getInteres(), cuotaActual, cuotaSiguiente);
		}

		// Ajustar última cuota
		Cuota ultimaCuota = prestamo.getCuotas().get(prestamo.getPlazo() - 1);
		ultimaCuota.setSaldo(0); // Saldo de la última cuota
	}

	private static void calcularValoresCuota(double interes, Cuota cuotaActual, Cuota cuotaSiguiente) {
		double saldoAnterior = cuotaActual.getCapitalInicio();
		double interesCuota = saldoAnterior * (interes / 12 / 100);
		cuotaActual.setInteres(interesCuota);

		double abonoCapital = cuotaActual.getCuota1() - interesCuota;
		cuotaActual.setAbonoCapital(abonoCapital);

		double nuevoSaldo = saldoAnterior - abonoCapital;
		cuotaActual.setSaldo(nuevoSaldo);

		// Actualizar el saldo de la siguiente cuota
		if (cuotaSiguiente != null) {
			cuotaSiguiente.setCapitalInicio(nuevoSaldo);
		}
	}

	public static void mostrarTabla(Prestamo prestamo) {
		System.out.println("Numero | Cuota | Inicio | Interés | Abono  | Saldo");
		for (int i = 0; i < prestamo.getCuotas().size(); i++) {
			Cuota cuota = prestamo.getCuotas().get(i);
			cuota.mostrarPrestamo();
		}
	}
}
