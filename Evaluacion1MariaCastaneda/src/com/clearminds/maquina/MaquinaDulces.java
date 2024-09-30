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
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (elementoCelda.getProducto() == null) {
				System.out.println("Celda: " + elementoCelda.getCodigo() + " Stock: " + elementoCelda.getStock()
						+ " Sin Producto asignado");
			} else {
				System.out.println("Celda: " + elementoCelda.getCodigo() + " Stock: " + elementoCelda.getStock()
						+ " Producto: " + elementoCelda.getProducto().getCodigo() + " "
						+ elementoCelda.getProducto().getNombre() + " Precio: "
						+ elementoCelda.getProducto().getPrecio());
			}
		}
		System.out.println("Saldo: " + saldo);
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

	public double consultarPrecio(String codigoCelda) {
		Celda celdaEncontrada = null;
		Celda elementoCelda = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (codigoCelda.equals(elementoCelda.getCodigo())) {
				celdaEncontrada = elementoCelda;

			}
		}
		return celdaEncontrada.getProducto().getPrecio();
	}

	public Celda buscarCeldaProducto(String codigoProducto) {
		Celda celdaEncontrada = null;
		Celda elementoCelda = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (elementoCelda != null && elementoCelda.getProducto() != null
					&& codigoProducto.equals(elementoCelda.getProducto().getCodigo())) {
				celdaEncontrada = elementoCelda;
				return celdaEncontrada;
			}
		}
		return null;
	}

	public void incrementarProductos(String codigoProducto, int cantidad) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		if (celdaEncontrada != null) {
			celdaEncontrada.setStock(celdaEncontrada.getStock() + cantidad);
		}
	}

	public void vender(String codigoCelda) {
		Celda celdaRecuperada;
		celdaRecuperada = buscarCelda(codigoCelda);
		if (celdaRecuperada.getStock() > 0) {
			double precio;
			precio = celdaRecuperada.getProducto().getPrecio();
			celdaRecuperada.setStock(celdaRecuperada.getStock() - 1);
			this.saldo = saldo + precio;
		}
	}

	public double venderConCambio(String codigoCelda, double valorIngresado) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		double cambio = 0;
		if (celdaRecuperada != null && celdaRecuperada.getStock() > 0) {
			double precioProducto = celdaRecuperada.getProducto().getPrecio();
			vender(codigoCelda);
			cambio = valorIngresado - precioProducto;

		}
		return cambio;
	}

	public ArrayList<Producto> buscarMenores(double limite){
		ArrayList<Producto> productosMenores=new ArrayList<>();
		Producto elementoProducto=null;
		for(int i=0;i<celdas.size();i++) {
			elementoProducto=celdas.get(i).getProducto();
			if(elementoProducto.getPrecio()<limite) {
				productosMenores.add(elementoProducto);
			}
		}
		return productosMenores;
	}

}
