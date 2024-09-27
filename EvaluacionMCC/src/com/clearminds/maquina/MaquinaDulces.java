package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public void configurarMaquina(String codigoCelda1, String codigoCelda2, String codigoCelda3, String codigoCelda4) {
		celda1 = new Celda(codigoCelda1);
		celda2 = new Celda(codigoCelda2);
		celda3 = new Celda(codigoCelda3);
		celda4 = new Celda(codigoCelda4);
	}

	public void mostrarConfiguracion() {
		System.out.println("Celda1: " + celda1.getCodigo());
		System.out.println("Celda2: " + celda2.getCodigo());
		System.out.println("Celda3: " + celda3.getCodigo());
		System.out.println("Celda4: " + celda4.getCodigo());
	}

	public Celda buscarCelda(String codigo) {
		if (codigo == celda1.getCodigo()) {
			return celda1;
		} else if (codigo == celda2.getCodigo()) {
			return celda2;
		} else if (codigo == celda3.getCodigo()) {
			return celda3;
		} else if (codigo == celda4.getCodigo()) {
			return celda4;
		}
		return null;
	}

	public void cargarProducto(Producto producto, String codigoCelda, int cantidad) {
		Celda celdaRecuperada;
		celdaRecuperada = buscarCelda(codigoCelda);
		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(producto, cantidad);
		} else {
			System.out.println("celda no encontrada");
		}
	}

	public void mostrarProductos() {
		if (celda1.getProducto() == null) {
			System.out.println("*******CELDA " + celda1.getCodigo());
			System.out.println("Stock: " + celda1.getStock());
			System.out.println("La celda no tiene producto!!!");
		} else {
			System.out.println("*******CELDA " + celda1.getCodigo());
			System.out.println("Stock: " + celda1.getStock());
			System.out.println("Nombre producto:" + celda1.getProducto().getNombre());
			System.out.println("Precio producto:" + celda1.getProducto().getPrecio());
			System.out.println("Código producto:" + celda1.getProducto().getCodigo());
		}
		if (celda2.getProducto() == null) {
			System.out.println("*******CELDA " + celda2.getCodigo());
			System.out.println("Stock: " + celda2.getStock());
			System.out.println("La celda no tiene producto!!!");
		} else {
			System.out.println("*******CELDA " + celda2.getCodigo());
			System.out.println("Stock: " + celda2.getStock());
			System.out.println("Nombre producto:" + celda2.getProducto().getNombre());
			System.out.println("Precio producto:" + celda2.getProducto().getPrecio());
			System.out.println("Código producto:" + celda2.getProducto().getCodigo());
		}
		if (celda3.getProducto() == null) {
			System.out.println("*******CELDA " + celda3.getCodigo());
			System.out.println("Stock: " + celda3.getStock());
			System.out.println("La celda no tiene producto!!!");
		} else {
			System.out.println("*******CELDA " + celda3.getCodigo());
			System.out.println("Stock: " + celda3.getStock());
			System.out.println("Nombre producto:" + celda3.getProducto().getNombre());
			System.out.println("Precio producto:" + celda3.getProducto().getPrecio());
			System.out.println("Código producto:" + celda3.getProducto().getCodigo());
		}
		if (celda4.getProducto() == null) {
			System.out.println("*******CELDA " + celda4.getCodigo());
			System.out.println("Stock: " + celda4.getStock());
			System.out.println("La celda no tiene producto!!!");
		} else {
			System.out.println("*******CELDA " + celda4.getCodigo());
			System.out.println("Stock: " + celda1.getStock());
			System.out.println("Nombre producto:" + celda4.getProducto().getNombre());
			System.out.println("Precio producto:" + celda4.getProducto().getPrecio());
			System.out.println("Código producto:" + celda4.getProducto().getCodigo());
		}
		System.out.println("Saldo:" + saldo);
	}

	public Producto buscarProductoEnCelda(String codigo) {
		if (codigo == celda1.getCodigo()) {
			return celda1.getProducto();
		} else if (codigo == celda2.getCodigo()) {
			return celda2.getProducto();
		} else if (codigo == celda3.getCodigo()) {
			return celda3.getProducto();
		} else if (codigo == celda4.getCodigo()) {
			return celda4.getProducto();
		}
		return null;
	}

	public double consultarPrecio(String codigoCelda) {
		if (codigoCelda == celda1.getCodigo()) {
			return celda1.getProducto().getPrecio();
		} else if (codigoCelda == celda2.getCodigo()) {
			return celda2.getProducto().getPrecio();
		} else if (codigoCelda == celda3.getCodigo()) {
			return celda3.getProducto().getPrecio();
		} else if (codigoCelda == celda4.getCodigo()) {
			return celda4.getProducto().getPrecio();
		}
		return -1;
	}

	public Celda buscarCeldaProducto(String codigoProducto) {
		if (celda1 != null && celda1.getProducto() != null && celda1.getProducto().getCodigo().equals(codigoProducto)) {
			return celda1;
		} else if (celda2 != null && celda2.getProducto() != null
				&& celda2.getProducto().getCodigo().equals(codigoProducto)) {
			return celda2;
		} else if (celda3 != null && celda3.getProducto() != null
				&& celda3.getProducto().getCodigo().equals(codigoProducto)) {
			return celda3;
		} else if (celda4 != null && celda4.getProducto() != null
				&& celda4.getProducto().getCodigo().equals(codigoProducto)) {
			return celda4;
		} else {
			return null;
		}
	}

	public void incrementarProductos(String codigoProducto, int cantidad) {
		Celda celdaEncontrada;
		celdaEncontrada = buscarCeldaProducto(codigoProducto);
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
		Celda celdaRecuperada;
		double cambio = 0;
		celdaRecuperada = buscarCelda(codigoCelda);
		if (celdaRecuperada != null && celdaRecuperada.getStock() > 0) {
			double precioProducto = celdaRecuperada.getProducto().getPrecio();
			vender(codigoCelda);
			cambio = valorIngresado - precioProducto;

		}
		return cambio;
	}

}
