package com.krakedev.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class TestAdminProducto {

	public static void main(String[] args) {
		Producto mc;
		AdminProducto admin=new AdminProducto();
		Producto productoA=new Producto("Doritos",0.40);
		Producto productoB=new Producto("Papitas",0.50);
		
		mc=admin.buscarMasCaro(productoA, productoB);
		
		 if(mc==null) {
			 System.out.println("Son iguales");
		 }else {
		 System.out.println("El más caro es: "+mc.getNombre());
		}
	}
	//mc esta null

}
