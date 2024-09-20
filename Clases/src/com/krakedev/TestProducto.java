package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA;
		Producto productoB;
		Producto productoC;

		productoA = new Producto();
		productoB = new Producto();
		productoC = new Producto();

		productoA.nombre = "Aspirina";
		productoA.descripcion = "Para dolor de cabeza";
		productoA.precio = 0.30;
		productoA.stockActual = 120;

		productoB.nombre = "Alcohol";
		productoB.descripcion = "Para desinfectar heridas";
		productoB.precio = 1.30;
		productoB.stockActual = 50;

		productoC.nombre = "Algodon";
		productoC.descripcion = "Usos varios";
		productoC.precio = 2.10;
		productoC.stockActual = 75;

		System.out.println("productoA.nombre: " + productoA.nombre);
		System.out.println("productoA.descripcion: " + productoA.descripcion);
		System.out.println("productoA.precio: " + productoA.precio);
		System.out.println("productoA.stockActual: " + productoA.stockActual);
		System.out.println("----------------------------");
		System.out.println("productoB.nombre: " + productoB.nombre);
		System.out.println("productoB.descripcion: " + productoB.descripcion);
		System.out.println("productoB.precio: " + productoB.precio);
		System.out.println("productoB.stockActual: " + productoB.stockActual);
		System.out.println("----------------------------");
		System.out.println("productoC.nombre: " + productoC.nombre);
		System.out.println("productoC.descripcion: " + productoC.descripcion);
		System.out.println("productoC.precio: " + productoC.precio);
		System.out.println("productoC.stockActual: " + productoC.stockActual);
	}

}
