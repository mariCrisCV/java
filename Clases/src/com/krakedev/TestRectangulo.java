package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo();
		Rectangulo r2=new Rectangulo();
		Rectangulo r3=new Rectangulo();
		
		int areaR1;
		int areaR2;
		int areaR3;
		
		double perimetroR1;
		double perimetroR2;
		double perimetroR3;
		
		r1.setBase(10);
		r1.setAltura(5);
		
		r2.setBase(8);
		r2.setAltura(5);

		r3.setBase(4);
		r3.setAltura(2);
		
		areaR1=r1.calcularArea();
		areaR2=r2.calcularArea();
		areaR3=r3.calcularArea();
		
		perimetroR1=r1.calcularPerimetro();
		perimetroR2=r2.calcularPerimetro();
		perimetroR3=r3.calcularPerimetro();
		
		System.out.println("Area de r1: "+areaR1);
		System.out.println("Area de r2: "+areaR2);
		System.out.println("Area de r3: "+areaR3);
		
		System.out.println("Perimetro de r1: "+perimetroR1);
		System.out.println("Perimetro de r2: "+perimetroR2);
		System.out.println("Perimetro de r3: "+perimetroR3);

	}

}
