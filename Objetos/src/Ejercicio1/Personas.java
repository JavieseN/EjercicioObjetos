package Ejercicio1;

public class Personas implements Comparable<Personas>
{
	private String nombre = "Pepito";
	private String apellidos = "Lillo Perez";
	private int diaNacimiento = 14;
	private int mesNacimiento = 9;
	private int anyNacimiento = 1996;
	private String ciudad = "Alicante";
	private int edad = 23;
	private boolean estudiar = true;
	private boolean trabajar = false;
	private char hm = 'H';
	private String dni = "12345678A";
	
	
	
	public Personas() {
		super();
	}
	
	
	public Personas(String dni,String nombre) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}


	public Personas(String nombre, String apellidos, int diaNacimiento, int mesNacimiento, int anyNacimiento,
			String ciudad, int edad, boolean estudiar, boolean trabajar, char hm, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.diaNacimiento = diaNacimiento;
		this.mesNacimiento = mesNacimiento;
		this.anyNacimiento = anyNacimiento;
		this.ciudad = ciudad;
		this.edad = edad;
		this.estudiar = estudiar;
		this.trabajar = trabajar;
		this.hm = hm;
		this.dni = dni;
	}
	
	
	
	public Personas(String nombre, int edad, int anyNacimiento) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.anyNacimiento = anyNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getDiaNacimiento() {
		return diaNacimiento;
	}
	public void setDiaNacimiento(int diaNacimiento) {
		this.diaNacimiento = diaNacimiento;
	}
	public int getMesNacimiento() {
		return mesNacimiento;
	}
	public void setMesNacimiento(int mesNacimiento) {
		this.mesNacimiento = mesNacimiento;
	}
	public int getAnyNacimiento() {
		return anyNacimiento;
	}
	public void setAnyNacimiento(int anyNacimiento) {
		this.anyNacimiento = anyNacimiento;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isEstudiar() {
		return estudiar;
	}
	public void setEstudiar(boolean estudiar) {
		this.estudiar = estudiar;
	}
	public boolean isTrabajar() {
		return trabajar;
	}
	public void setTrabajar(boolean trabajar) {
		this.trabajar = trabajar;
	}
	public char getHm() {
		return hm;
	}
	public void setHm(char hm) {
		this.hm = hm;
	}
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	@Override
	public String toString() 
	{
		String texto = "Hola me llamo " + getNombre() + " " + getApellidos() + " y tengo " + getEdad() + " años.\n" + "Nací el " + getDiaNacimiento() + "/" + getMesNacimiento() + "/" + getAnyNacimiento() + " y vivo en " + getCiudad() + ".\n";
		if (isEstudiar()) 
		{
			texto = texto.concat("Actualmente estoy trabajando");
		} 
		else 
		{
			texto = texto.concat("Actualmente no estoy trabajando");
		}
		
		if (isTrabajar())
		{
			texto = texto.concat(" y estoy trabajando.");
		} 
		else 
		{
			texto = texto.concat(" y no estoy trabajando.\n");
		}
		
		return texto;
	}
	//Nombre de menor a mayor, la edad de mayor a menor y el año de menor a mayor
	@Override
	public int compareTo(Personas p)
	{
		int n = this.getNombre().compareTo(p.getNombre());
		if(n == 0)
		{
			if(this.getEdad() == p.getEdad())
			{
				if(this.getAnyNacimiento() == p.getAnyNacimiento())
				{
					return 0;
				}
				else if(this.getAnyNacimiento() > p.getAnyNacimiento())
				{
					return 1;
				}
				else if(this.getAnyNacimiento() < p.getAnyNacimiento())
				{
					return -1;
				}
			}
			else if(this.getEdad() > p.getEdad())
			{
				return -1;
			}
			else if(this.getEdad() < p.getEdad())
			{
				return 1;
			}
		}
		return n;
	}
}
