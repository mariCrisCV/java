package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA;
		Producto productoB;
		Producto productoC;

		productoA = new Producto();
		productoB = new Producto();
		productoC = new Producto();

		productoA.setNombre("Aspirina");
		productoA.setDescripcion("Para dolor de cabeza");
		productoA.setPrecio(0.30);
		productoA.setStockActual(120);

		productoB.setNombre("Alcohol");
		productoB.setDescripcion("Para desinfectar heridas");
		productoB.setPrecio (1.30);
		productoB.setStockActual(50);

		productoC.setNombre ("Algodon");
		productoC.setDescripcion ("Usos varios");
		productoC.setPrecio (2.10);
		productoC.setStockActual (75);

		System.out.println("productoA.nombre: " + productoA.getNombre());
		System.out.println("productoA.descripcion: " + productoA.getDescripcion());
		System.out.println("productoA.precio: " + productoA.getPrecio());
		System.out.println("productoA.stockActual: " + productoA.getStockActual());
		System.out.println("----------------------------");
		System.out.println("productoB.nombre: " + productoB.getNombre());
		System.out.println("productoB.descripcion: " + productoB.getDescripcion());
		System.out.println("productoB.precio: " + productoB.getPrecio());
		System.out.println("productoB.stockActual: " + productoB.getStockActual());
		System.out.println("----------------------------");
		System.out.println("productoC.nombre: " + productoC.getNombre());
		System.out.println("productoC.descripcion: " + productoC.getDescripcion());
		System.out.println("productoC.precio: " + productoC.getPrecio());
		System.out.println("productoC.stockActual: " + productoC.getStockActual());
	}

}
