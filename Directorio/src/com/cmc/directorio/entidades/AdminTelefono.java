package com.cmc.directorio.entidades;

public class AdminTelefono {

	public void activarMensajeria(Telefono telf) {
		if (telf.getOperadora() == "movi") {
			telf.setTieneWhatsapp(true);
		}
	}

	public int contarMovi(Telefono t1, Telefono t2, Telefono t3) {
		int contador =0;
		if (t1.getOperadora()=="movi" && t1!=null) {
			contador=contador+1;
		}
		if (t2.getOperadora()=="movi" && t2!=null) {
			contador=contador+1;
		}
		if (t3.getOperadora()=="movi" && t3!=null) {
			contador=contador+1;
		}
		return contador;
	}
	
	public int contaClaro(Telefono t1, Telefono t2, Telefono t3, Telefono t4) {
		int contador =0;
		if (t1.getOperadora()=="claro" && t1!=null) {
			contador=contador+1;
		}
		if (t2.getOperadora()=="claro" && t2!=null) {
			contador=contador+1;
		}
		if (t3.getOperadora()=="claro" && t3!=null) {
			contador=contador+1;
		}
		if (t4.getOperadora()=="claro" && t4!=null) {
			contador=contador+1;
		}
		return contador;
	}
}
