package krakedev.test;

import krakedev.entidades.Estudiante;
import krakedev.entidades.Materia;
import krakedev.entidades.Nota;

public class TestEstudiante {

	public static void main(String[] args) {
		testNoDebeAgregarNotaSiYaExisteUnaNotaDeLaMismaMateria();
		testDebeAgregarNotaSiEsLaPrimeraVezQueSeCreaUnEstudiante();
		testNoDebeAgregarNotaSiEsUnaNotaInvalida();
		
		
		Estudiante estudiante = new Estudiante("1234567890", "Juan2", "Perez");
		Estudiante estudiante2 = new Estudiante("1234567890", "Juan", "Perez");
		Materia ciencias = new Materia("3", "Ciencias");
		Materia matematicas = new Materia("2", "Matematicas");

		Nota nuevaNota = new Nota(ciencias, 9.0);
		Nota nuevaNota2 = new Nota(ciencias, 9.0);
		Nota nuevaNota3 = new Nota(matematicas, 2.0);
		Nota nuevaNota4 = new Nota(matematicas, -8.0);

		estudiante.agregarNota(nuevaNota);
		// No deberia dejar ingresar esta nota ya que la calificacion esta duplicada.
		estudiante.agregarNota(nuevaNota2);
		// No deberia dejar ingresar esta nota ya que la calificacion es menor a 0.
		estudiante.agregarNota(nuevaNota3);
		estudiante.agregarNota(nuevaNota4);

		estudiante.modificarNota("3", 10.00);
		// No deberia dejar modificar esta nota ya que la calificacion es menor a 0.
		estudiante.modificarNota("3", -1);
		System.out.println("Promedio estudiante: "+estudiante.calcularPromedioNotasEstudiante());

		estudiante.mostrar();

	}
	
	private static void testNoDebeAgregarNotaSiYaExisteUnaNotaDeLaMismaMateria() {
		try {
			Estudiante estudiante = new Estudiante("2589637412", "Rosa", "Sanchez");
			estudiante.agregarNota(new Nota(new Materia("2", "Mate"), 0));
			estudiante.agregarNota(new Nota(new Materia("2", "Mate"), 5.0));
						
			assert estudiante.getNotas().size() == 1 : "testNoDebeAgregarNotaSiYaExisteUnaNotaDeLaMismaMateria: Nota duplicada";

		}catch (AssertionError e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void testDebeAgregarNotaSiEsLaPrimeraVezQueSeCreaUnEstudiante() {
		try {
			Estudiante estudiante = new Estudiante("2589637412", "Rosa", "Sanchez");
			estudiante.agregarNota(new Nota(new Materia("2", "Mate"), 0));
						
			assert estudiante.getNotas().size() == 1 : "testDebeAgregarNotaSiEsLaPrimeraVezQueSeCreaUnEstudiante: No se agrego nota";

		}catch (AssertionError e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void testNoDebeAgregarNotaSiEsUnaNotaInvalida() {
		try {
			Estudiante estudiante = new Estudiante("2589637412", "Rosa", "Sanchez");
			estudiante.agregarNota(new Nota(new Materia("2", "Mate"), 8));
			estudiante.agregarNota(new Nota(new Materia("2", "Mate"), -6));
						
			assert estudiante.getNotas().size() == 1 : "testNoDebeAgregarNotaSiEsUnaNotaInvalida: No se debe agregar nota invalida";

		}catch (AssertionError e) {
			System.out.println(e.getMessage());
		}
	}
}
