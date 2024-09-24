package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1 = new Producto(253,"Aceite");
		producto1.setDescripcion("Aceite para cocina");
		producto1.setPeso(25);
		
		System.out.println("Nombre Producto: "+producto1.getNombre());
		System.out.println("Codigo: "+producto1.getCodigo());
		System.out.println("Descripcion: "+producto1.getDescripcion());
		System.out.println("Peso: "+producto1.getPeso());
	}

}
