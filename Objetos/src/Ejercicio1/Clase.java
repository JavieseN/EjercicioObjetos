package Ejercicio1;

public class Clase {

	public static void main(String[] args) 
	{
		Personas[] clase = new Personas[10];
		Personas p;
		for (int i = 0; i < 10; i++) 
		{
			p = new Personas();
			clase[i] = p;
			System.out.println(clase[i].toString());
		}
	}

}
