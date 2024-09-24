package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item producto1=new Item();
		Item producto2=new Item();
		producto1.setNombre("Shampoo");
		producto1.setProductosActuales(20);
		producto1.setProductosVendidos(10);
		producto1.setProductosDevueltos(15);
			
		System.out.println("-----Valores iniciales-----");
		producto1.imprimir();
		
		System.out.println("-----Valores modificados----");
		producto1.vender(5);
		producto1.devolver(3);
		producto1.imprimir();
		
		producto2.setNombre("Jabon");
		producto2.setProductosActuales(6);
		producto2.setProductosVendidos(8);
		producto2.setProductosDevueltos(2);
			
		System.out.println("-----Valores iniciales-----");
		producto2.imprimir();
		
		System.out.println("-----Valores modificados----");
		producto2.vender(3);
		producto2.devolver(1);
		producto2.imprimir();
	}

}
