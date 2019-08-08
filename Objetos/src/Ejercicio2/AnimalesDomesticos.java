package Ejercicio2;

public class AnimalesDomesticos {

	public static void main(String[] args) 
	{
		Perro[] perros = new Perro[5];
		Gato[] gatos  = new Gato[5];
		Raton[] ratones = new Raton[5];
		
		Perro p = new Perro();
		for (int i = 0; i < perros.length; i++) 
		{
			perros[i] = p;
		}
		
		Gato g = new Gato();
		for (int i = 0; i < gatos.length; i++) 
		{
			gatos[i] = g;
		}
		
		Raton r = new Raton();
		for (int i = 0; i < ratones.length; i++) 
		{
			ratones[i] = r;
		}
	}

}
