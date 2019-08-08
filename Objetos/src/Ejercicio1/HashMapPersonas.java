package Ejercicio1;
//PDF Nucleo API
import java.util.HashMap;
import java.util.Map;

public class HashMapPersonas {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Map<String, Personas> personas = new HashMap<String, Personas>(); 
		
		Personas p1 = new Personas("48759635B","Ana");
		Personas p2 = new Personas("46087920Z","Javier");
		Personas p3 = new Personas("46621185J","Adrian");
		
		personas.put(p1.getDni(), p1);
		personas.put(p2.getDni(), p2);
		personas.put(p3.getDni(), p3);
		
		for (Personas p : personas.values()) 
		{
			System.out.println(p.getNombre() + " tiene el dni: " + p.getDni());
		}
	}

}
