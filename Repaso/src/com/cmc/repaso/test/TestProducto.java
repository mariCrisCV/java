package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1=new Producto("Plato",5.60);
		producto1.setPrecio(-4.20);
		producto1.calcularPrecioPromo(20);
		
	}

}
