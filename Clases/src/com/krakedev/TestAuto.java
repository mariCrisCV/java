package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();

		auto1.marca = "Toyota";
		auto1.anio = 2020;
		auto1.precio = 28600;

		System.out.println("auto1.marca: " + auto1.marca);
		System.out.println("auto1.anio: " + auto1.anio);
		System.out.println("auto1.precio: " + auto1.precio);
		
		System.out.println("--------------");

		auto2.marca = "Kia";
		auto2.anio = 2023;
		auto2.precio = 15500;

		System.out.println("auto2.marca: " + auto2.marca);
		System.out.println("auto2.anio: " + auto2.anio);
		System.out.println("auto2.precio: " + auto2.precio);
	}
}
