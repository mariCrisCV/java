package krakedev.test;

import krakedev.entidades.Materia;
import krakedev.entidades.Nota;

public class TestNota {

	public static void main(String[] args) {
		testDebeCrearNotaSiNotaMayorACero();
		testDebeSerNotaInvalidaSiNotaMayorADiez();
		testDebeSerNotaInvalidaSiNotaEsNegativa();
		testDebeSerNotaValidaSiEsDiez();
		testDebeSerNotaValidaSiEsCero();
		testDebeSerNotaInvalidaSiMateriaEsNull();
		testEqualsUnaNotaEsIgualQueOtraSiEsDeLaMismaMateria();
		testEqualsDebeDarFalseSiDosNotasSonDeDiferentesMaterias();
		testEqualsRetornaFalseSiMateriaEsNull();
		}

	private static void testDebeCrearNotaSiNotaMayorACero() {
		Nota nota = new Nota(new Materia("5", "Lengua"), 8.0);
	}

	private static void testDebeSerNotaInvalidaSiNotaMayorADiez() {
		try {
			Nota n2 = new Nota(new Materia("2", "Mate"), 11.5);
			assert n2.getCalificacion() == -1.0 : "testDebeSerNotaInvalidaSiNotaMayorADiez1: Nota no valida";

		}catch (AssertionError e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void testDebeSerNotaInvalidaSiNotaEsNegativa() {
		try {
			Nota n2 = new Nota(new Materia("2", "Mate"), -2.0);
			assert n2.getCalificacion() == -1.0 : "testDebeSerNotaInvalidaSiNotaEsNegativa: Nota no valida";

		}catch (AssertionError e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void testDebeSerNotaValidaSiEsDiez() {
		try {
			Nota n2 = new Nota(new Materia("2", "Mate"), 10);
			assert n2.getCalificacion() == 10 : "testDebeSerNotaValidaSiEsDiez: Nota no valida";

		}catch (AssertionError e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void testDebeSerNotaValidaSiEsCero() {
		try {
			Nota n2 = new Nota(new Materia("2", "Mate"), 0);
			assert n2.getCalificacion() == 0 : "testDebeSerNotaValidaSiEsCero: Nota no valida";

		}catch (AssertionError e) {
			System.out.println(e.getMessage());
		}
	}
 
	private static void testDebeSerNotaInvalidaSiMateriaEsNull() {
		try {
			Nota n2 = new Nota(null, 7.0);
			assert n2.getCalificacion() == -1 : "testDebeSerNotaInvalidaSiMateriaEsNull: Nota no valida";

		}catch (AssertionError e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void testEqualsUnaNotaEsIgualQueOtraSiEsDeLaMismaMateria() {
		try {
			Nota n1 = new Nota(new Materia("2", "Mate"), 4);
			Nota n2 = new Nota(new Materia("2", "Mate"), 5);
			assert n1.equals(n2) : "testEqualsUnaNotaEsIgualQueOtraSiEsDeLaMismaMateria: Notas deben ser iguales";

		}catch (AssertionError e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void testEqualsDebeDarFalseSiDosNotasSonDeDiferentesMaterias() {
		try {
			Nota n1 = new Nota(new Materia("3", "Lengua"), 4);
			Nota n2 = new Nota(new Materia("2", "Mate"), 5);
			assert !n1.equals(n2) : "testEqualsDebeDarFalseSiDosNotasSonDeDiferentesMaterias: Notas deben ser diferentes";

		}catch (AssertionError e) {
			System.out.println(e.getMessage());
		}
	}

	private static void testEqualsRetornaFalseSiMateriaEsNull() {
		try {
			Nota n1 = new Nota(null, 4);
			Nota n2 = new Nota(null, 5);
			assert !n1.equals(n2) : "testEqualsRetornaFalseSiMateriaEsNull: Notas no son iguales si materia es null";

		}catch (AssertionError e) {
			System.out.println(e.getMessage());
		}
	}
	
}
