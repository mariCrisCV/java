package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda(new Celda("A1"));
		maquina.agregarCelda(new Celda("A2"));
		maquina.agregarCelda(new Celda("B1"));
		maquina.agregarCelda(new Celda("B2"));
		maquina.agregarCelda(new Celda("C1"));
		maquina.agregarCelda(new Celda("C2"));

		Producto producto = new Producto("KE34", "Papitas", 0.85);
		maquina.cargarProducto(producto, "B1", 4);

		Producto producto2 = new Producto("D456", "Doritos", 0.70);
		maquina.cargarProducto(producto2, "A1", 6);

		Producto producto3 = new Producto("LI25", "Jet", 0.25);
		maquina.cargarProducto(producto3, "A2", 5);

		Producto producto4 = new Producto("FA74", "DeTodito", 0.60);
		maquina.cargarProducto(producto4, "C2", 10);

		Producto producto5 = new Producto("KA56", "Manicho", 1.25);
		maquina.cargarProducto(producto5, "C1", 14);

		Producto producto6 = new Producto("DO83", "Ruflex", 1.75);
		maquina.cargarProducto(producto6, "B2", 7);

		ArrayList<Producto> productosMenores = maquina.buscarMenores(1);
		System.out.println("Productos Menores: " + productosMenores.size());
		for (int i = 0; i < productosMenores.size(); i++) {
			System.out.println("Nombre: " + productosMenores.get(i).getNombre() + " Precio: "
					+ productosMenores.get(i).getPrecio());
		}

	}

}
