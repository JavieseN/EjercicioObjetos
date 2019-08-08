package Ejercicio1;
//PDF Nucleo API
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarListaPersonas {

	public static void main(String[] args) 
	{
		Personas p1 = new Personas("ANA",26,2010);
		Personas p2 = new Personas("ALBA",21,1988);
		Personas p3 = new Personas("ANA",26,2009);
		Personas p4 = new Personas("ALBA",26,2007);
		
		List<Personas> personasList = new ArrayList<Personas>();
		personasList.add(p1);
		personasList.add(p2);
		personasList.add(p3);
		personasList.add(p4);
		
		Collections.sort(personasList);
		
		for (Personas p : personasList) 
		{
			System.out.println(p.getNombre()+ "\t" + p.getEdad() + "\t" + p.getAnyNacimiento());
		}
	}

}
