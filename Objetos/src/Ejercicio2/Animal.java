package Ejercicio2;

public class Animal 
{
	private double altura;
	private double peso;
	private String nombre;
	
	public Animal() {
		super();
	}
	public Animal(double altura, double peso, String nombre) {
		super();
		this.altura = altura;
		this.peso = peso;
		this.nombre = nombre;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
