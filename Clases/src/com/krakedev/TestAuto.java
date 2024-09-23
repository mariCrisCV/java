package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto("Toyota", 2020, 28600);
		Auto auto2 = new Auto("Kia", 2023, 15500);

		/*auto1.setMarca("Toyota");
		auto1.setAnio(2020);
		auto1.setPrecio(28600);*/

		System.out.println("auto1.marca: " + auto1.getMarca());
		System.out.println("auto1.anio: " + auto1.getAnio());
		System.out.println("auto1.precio: " + auto1.getPrecio());

		System.out.println("--------------");

		/*auto2.setMarca("Kia");
		auto2.setAnio(2023);
		auto2.setPrecio(15500);*/

		System.out.println("auto2.marca: " + auto2.getMarca());
		System.out.println("auto2.anio: " + auto2.getAnio());
		System.out.println("auto2.precio: " + auto2.getPrecio());
	}
}
