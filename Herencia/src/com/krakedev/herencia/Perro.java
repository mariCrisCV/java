package com.krakedev.herencia;

public class Perro extends Animal{
	public Perro() {
		System.out.println("Ejecuta constructor de Perro");
	}
	
	public void ladrar() {
		System.out.println("Perro ladrando");
	}
	
	@Override
	public void dormir() {
		super.dormir();//llamo al método dormir de Animal(padre)
		System.out.println("Perro durmiendo");
	}
}
