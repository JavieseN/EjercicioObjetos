package enums;

public class Alumno implements Comparable<Alumno>
{
	private String nombre;
	private Calificaciones calificacion;
	private int nota;
	
	public enum Calificaciones
	{
		INSUFICIENTE,SUFICIENTE,BIEN,NOTABLE,SOBRESALIENTE;
	}

	public Alumno(String nombre, Calificaciones calificacion, int nota) {
		super();
		this.nombre = nombre;
		this.calificacion = calificacion;
		this.nota = nota;
	}

	public Alumno() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calificaciones getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Calificaciones calificacion) {
		this.calificacion = calificacion;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return calificacion + "(" + nota + ") - " + nombre;
	}

	@Override
	public int compareTo(Alumno alu) 
	{
		if(this.nota > alu.getNota())
		{
			return 1;
		}
		else if(this.nota < alu.getNota())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

	
	
	
}
