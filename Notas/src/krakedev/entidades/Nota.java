package krakedev.entidades;

public class Nota {
	private Materia materia;
	private double calificacion;

	public Nota(Materia materia, double calificacion) {
		if (calificacion < 0 || calificacion > 10 || materia == null) {
			this.calificacion = -1.0;
		} else {
			this.calificacion = calificacion;
			this.materia = materia;
		}

	}

	public void mostrar() {
		System.out.println("Nota [materia= " + materia + " calificacion= " + calificacion + "]");
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public boolean equals(Object otroObjeto) {
		Nota otraNota = (Nota) otroObjeto;
		if (this.materia != null && otraNota.materia != null
				&& this.materia.getCodigo().equals(otraNota.getMateria().getCodigo())) {
			return true;
		}
		return false;
	}

}
