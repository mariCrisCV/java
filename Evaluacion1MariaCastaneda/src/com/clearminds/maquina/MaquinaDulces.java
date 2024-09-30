package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		this.celdas = new ArrayList<>();
		this.saldo = 0.0;
	}

	public void agregarCelda(Celda codigoCelda) {
		celdas.add(codigoCelda);
	}

	public void mostrarConfiguracion() {
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			System.out.println("Celda:" + (i + 1) + ": " + elementoCelda.getCodigo());
		}
	}

	public Celda buscarCelda(String codigoCelda) {
		Celda celdaEncontrada = null;
		Celda elementoCelda = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (codigoCelda.equals(elementoCelda.getCodigo())) {
				celdaEncontrada = elementoCelda;
			}
		}
		return celdaEncontrada;
	}

	public void cargarProducto(Producto producto, String codigoCelda, int cantidad) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(producto, cantidad);
	}

	public void mostrarProductos() {
		Celda elementoCelda;
		for (int i = 1; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (elementoCelda.getProducto() == null) {
				System.out.println("Celda: " + elementoCelda.getCodigo() + " Stock: " + elementoCelda.getStock()
						+ " Sin Producto asignado");
			} else {
				System.out.println("Celda: " + elementoCelda.getCodigo() + " Stock: " + elementoCelda.getStock()
						+ " Producto: " + elementoCelda.getProducto().getCodigo() + " Precio: "
						+ elementoCelda.getProducto().getPrecio());
			}
		}
	}

	public Producto buscarProductoEnCelda(String codigoCelda) {
		Celda celdaEncontrada = null;
		Celda elementoCelda = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (codigoCelda.equals(elementoCelda.getCodigo())) {
				celdaEncontrada = elementoCelda;
				return celdaEncontrada.getProducto();
			}
		}
		return null;

	}
}
