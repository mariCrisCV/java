package com.entidades;

public class Random {

	public static int obtenerPosicion() {
		double numeroAleatorioDecimal = Math.random();// entre 0.0 y 1.0
		int numeroAleatorio = (int) (numeroAleatorioDecimal * 52); // entre 0 y 51, se multiplica por 52 xq obtendrás un valor entre 0.0 y 52.0. Al convertirlo a entero con (int), truncarás el decimal, obteniendo un número entre 0 y 51 (inclusive).
		return numeroAleatorio;
	}
}
