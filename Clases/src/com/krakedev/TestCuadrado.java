package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado(4);
		Cuadrado c2 = new Cuadrado(3);
		Cuadrado c3 = new Cuadrado(5);

		double area1;
		double area2;
		double area3;

		double perimetro1;
		double perimetro2;
		double perimetro3;

		/*c1.setLado(4);
		c2.setLado(3);
		c3.setLado(5);*/

		area1 = c1.calcularArea();
		area2 = c2.calcularArea();
		area3 = c3.calcularArea();

		perimetro1 = c1.calcularPerimetro();
		perimetro2 = c2.calcularPerimetro();
		perimetro3 = c3.calcularPerimetro();

		System.out.println("Area de c1: " + area1);
		System.out.println("Area de c2: " + area2);
		System.out.println("Area de c3: " + area3);
		System.out.println("Perimetro de c1: " + perimetro1);
		System.out.println("Perimetro de c2: " + perimetro2);
		System.out.println("Perimetro de c3: " + perimetro3);

	}

}
