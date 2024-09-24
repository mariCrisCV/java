package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		//Creo el objeto Cuenta y lo referencio con cuenta1
		Cuenta cuenta1=new Cuenta("03476");
		//Coloco un valor de saldo en la cuenta1
		cuenta1.setSaldo(675);
		
		//Creo el objeto Cuenta y lo referencio con cuenta2
		Cuenta cuenta2=new Cuenta("03476","C",98);
		
		//Creo el objeto Cuenta y lo referencio con cuenta3
		Cuenta cuenta3=new Cuenta("03476");
		//Modifico el tipo de cuenta
		cuenta3.setTipo("C");
		
		//Imprimo cuenta1, cuenta2 y cuenta3
		System.out.println("-----------Valores iniciales---------");
		cuenta1.Imprimir();
		cuenta2.Imprimir();
		cuenta3.Imprimir();
		System.out.println("-----------Valores modificados---------");
		//Modifico los valores e imprimo
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		cuenta1.Imprimir();
		cuenta2.Imprimir();
		cuenta3.Imprimir();
		
		//Creo la cuenta4
		Cuenta cuenta4=new Cuenta("0987");
		cuenta4.setSaldo(10);
		//Creo la cuenta5
		Cuenta cuenta5=new Cuenta("0557","C",10);
		//Creo la cuenta6
		Cuenta cuenta6=new Cuenta("0666");
		System.out.println(">>>>>CUENTAS 4,5 Y 6<<<<<<");
		cuenta4.ImprimirConMiEstilo();
		cuenta5.ImprimirConMiEstilo();
		cuenta6.ImprimirConMiEstilo();

	}

}
