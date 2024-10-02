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
				if (!notas.get(i).equals(nuevaNota) && nuevaNota.getCalificacion() != -1) {
					this.notas.add(nuevaNota);
				}
			}
		}
	}

	public void modificarNota(String codigo, double nuevaNota) {
		Nota elementoNota = null;
		Nota notaABuscar = new Nota(new Materia(codigo, ""), nuevaNota);
		for (int i = 0; i < notas.size(); i++) {
			if (notas.get(i).equals(notaABuscar)) {
				elementoNota = notas.get(i);
			}
		}
		elementoNota.setCalificacion(nuevaNota);
	}

	public double calcularPromedioNotasEstudiante() {
		double sumaTotal = 0.0;
		double promedio;
		Nota nota;
		if (notas.isEmpty()) {
			return 0.0;
		}
		for (int i = 0; i < notas.size(); i++) {
			nota = notas.get(i);
			sumaTotal += nota.getCalificacion();
		}
		promedio = sumaTotal / notas.size();
		return promedio;
	}

	public void mostrar() {
		System.out.println("Estudiante [Nombre: " + this.nombre + ", Apellido: " + this.apellido + ", Cedula: "
				+ this.cedula + "]");
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
