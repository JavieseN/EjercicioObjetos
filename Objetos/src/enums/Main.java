package enums;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import enums.Alumno.Calificaciones;

public class Main 
{
	 static Scanner sca = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		List<Alumno> alumnoList = new ArrayList<Alumno>();
		menu(alumnoList);
		
	}
	
	public static void anyadirAlumno(List<Alumno> alumnoList)
	{
		System.out.println("Introduce el nombre del alumno");
		sca.nextLine();
		String nombre = sca.nextLine();
		
		System.out.println("Introduce la nota del alumno");
		int nota = sca.nextInt();
		
		while(nota < 0 || nota > 10)
		{
			System.out.println("Nota incorrecta, introduce otra");
			nota = sca.nextInt();
		}
		
		Alumno alumno = new Alumno();
		alumno.setNombre(nombre);
		alumno.setNota(nota);
		if(nota <= 4)
		{
			alumno.setCalificacion(Calificaciones.INSUFICIENTE);
		}
		else if(nota == 5)
		{
			alumno.setCalificacion(Calificaciones.SUFICIENTE);
		}
		else if(nota == 6)
		{
			alumno.setCalificacion(Calificaciones.BIEN);
		}
		else if(nota == 7 || nota == 8)
		{
			alumno.setCalificacion(Calificaciones.NOTABLE);
		}
		else if(nota == 9 || nota == 10)
		{
			alumno.setCalificacion(Calificaciones.SOBRESALIENTE);
		}
		alumnoList.add(alumno);
		menu(alumnoList);
	}

	public static void mostrarLista(List<Alumno> alumnoList)
	{
		for (Alumno alumno : alumnoList) 
		{
			System.out.println(alumno);
		}
		menu(alumnoList);
	}
	
	private static void mostrarListaFiltrada(List<Alumno> alumnoList, String calificacion) 
	{
		for (Alumno alumno : alumnoList) 
		{
			if(alumno.getCalificacion().toString().equals(calificacion))
			{
				System.out.println(alumno);
			}
		}
		menu(alumnoList);
	}
	
	public static void menu(List<Alumno> alumnoList)
	{
		
		System.out.println("1-Nueva Calificación");
		System.out.println("2-Listar Calificaciones");
		System.out.println("3-Listar Calificaciones (Ordenado por calificación ascendente)");
		System.out.println("4-Listar Calificaciones (Ordenado por calificación descendente)");
		System.out.println("5-Listar Calificaciones SOBRESALIENTES");
		System.out.println("6-Listar Calificaciones NOTABLE");
		System.out.println("7-Listar Calificaciones BIEN");
		System.out.println("8-Listar Calificaciones SUFICIENTE");
		System.out.println("9-Listar Calificaciones INSUFICIENTE");
		int opcion = sca.nextInt();
		switch (opcion) 
		{
			case 1:
				anyadirAlumno(alumnoList);
				break;
			case 2:
				mostrarLista(alumnoList);
				break;
			case 3:
				mostrarListaAscendente(alumnoList);
				break;
			case 4:
				mostrarListaDescendente(alumnoList);
				break;
			case 5:
				mostrarListaFiltrada(alumnoList,"SOBRESALIENTE");
				break;
			case 6:
				mostrarListaFiltrada(alumnoList,"NOTABLES");
				break;
			case 7:
				mostrarListaFiltrada(alumnoList,"BIEN");
				break;
			case 8:
				mostrarListaFiltrada(alumnoList,"SUFICIENTE");
				break;
			case 9:
				mostrarListaFiltrada(alumnoList,"INSUFICIENTE");
				break;
			default:
				System.out.println("Saliendo");
				break;
		}
		sca.close();
	}

	private static void mostrarListaAscendente(List<Alumno> alumnoList) 
	{
		Collections.sort(alumnoList);
		for (Alumno alumno : alumnoList) 
		{
			System.out.println(alumno);
		}
		menu(alumnoList);
	}
	
	private static void mostrarListaDescendente(List<Alumno> alumnoList) 
	{
		Collections.sort(alumnoList);
		for(int i = alumnoList.size(); i > 0 ; i--)
		{
			System.out.println(alumnoList.get(i-1));
		}
		menu(alumnoList);
	}
}
