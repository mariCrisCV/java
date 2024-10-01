package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;

	public Estudiante(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.notas = new ArrayList<>();
	}

	public void agregarNota(Nota nuevaNota) {
		if (notas.size() == 0) {
			this.notas.add(nuevaNota);
		} else {
			for (int i = 0; i < notas.size(); i++) {
				if (!notas.get(i).equals(nuevaNota) && nuevaNota.getCalificacion()!=-1) {
					this.notas.add(nuevaNota);
				}
			}
		}
	}

	public void modificarNota(String codigo, double nuevaNota) {
		Nota elementoNota = null;
		for (int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			if (!codigo.equals(elementoNota.getMateria().getCodigo())) {
				System.out.println("No se encontró ese código de materia");
			} else if (codigo.equals(elementoNota.getMateria().getCodigo()) && nuevaNota > 0 && nuevaNota <= 10) {
				elementoNota.setCalificacion(nuevaNota);
			}
		}
	}

	public double calcularPromedioNotasEstudiante() {
		double sumaTotal = 0.0;
		double promedio;
		if (notas.isEmpty()) {
			return 0.0;
		}
		for (int i = 0; i < notas.size(); i++) {
			sumaTotal = notas.get(i).getCalificacion() + notas.get(i).getCalificacion();
		}
		promedio = sumaTotal / notas.size();
		return promedio;
	}

	public void mostrar() {
		Estudiante elementoEstudiante;
		ArrayList<Estudiante> estudiantes = new ArrayList<>();
		for (int i = 0; i < estudiantes.size(); i++) {
			elementoEstudiante = estudiantes.get(i);
			System.out.println("Estudiante [Nombre: " + elementoEstudiante.nombre + ", Apellido: "
					+ elementoEstudiante.apellido + ", Cedula: " + elementoEstudiante.cedula + "]");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

}
