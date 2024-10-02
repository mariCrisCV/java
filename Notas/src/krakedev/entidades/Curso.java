package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;

	public Curso() {
		estudiantes = new ArrayList<Estudiante>();
	}

	public String buscarEstudiantePorCedula(Estudiante estudiante) {
		Estudiante elementoEstudiante = null;
		for (int i = 0; i < estudiantes.size(); i++) {
			elementoEstudiante = estudiantes.get(i);
			if (estudiante.getCedula().equals(elementoEstudiante.getCedula())) {
				System.out.println("El estudiante ya esta dentro de un curso");
			}
		}

		return null;
	}

	public void matricularEstudiante(Estudiante estudiante) {
		buscarEstudiantePorCedula(estudiante);
		if (buscarEstudiantePorCedula(estudiante) == null) {
			estudiantes.add(estudiante);
		}
	}

	public double calcularPromedioCurso() {
		double promedioEstudiante = 0;
		double promedioCurso = 0;
		double sumaTotal = 0;
		int contadorEstudiantes = 0;

		for (int i = 0; i < estudiantes.size(); i++) {
			Estudiante estudiante = estudiantes.get(i);
			if (estudiante != null) {
				promedioEstudiante = estudiante.calcularPromedioNotasEstudiante();
				sumaTotal += promedioEstudiante;
				contadorEstudiantes++;
			}
		}
		promedioCurso = sumaTotal / contadorEstudiantes;
		return promedioCurso;
	}

	public void mostrar() {
		Estudiante elementoEstudiante;
		for (int i = 0; i < estudiantes.size(); i++) {
			elementoEstudiante = estudiantes.get(i);
			System.out.println("Estudiantes [Nombre: " + estudiantes.get(i).getNombre() + " "
					+ estudiantes.get(i).getApellido() + " Cedula: " + estudiantes.get(i).getCedula() + "]");
		}
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

}
