package StringUtils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {

	public static void main(String[] args) 
	{
		//1
		String texto = "Esto es una prueba";
		System.out.println(texto.toUpperCase());
		//2
		texto = "La clase String, tiene varios métodos, muy útiles, como saber su longitud, trocear la cadena, etc";
		String[] arrayTexto = texto.split(",");
		for (int i = 0; i < arrayTexto.length; i++) 
		{
			System.out.println(arrayTexto[i]);
		}
		//3
		texto = "Esto es un ejemplo usado para determinar un indice";
		System.out.println(texto.indexOf("ejemplo"));
		//4
		texto = "04/12/2016";
		muestraFecha(texto);
		
		//FALTA EL ÚLTIMO
		System.out.println("Introduce la frase para contar las vocales que tiene");
		
		Scanner scan = new Scanner(System.in);
		texto = scan.nextLine();
		
		int contA = 0;
		int contE = 0;
		int contI = 0;
		int contO = 0;
		int contU = 0;
		
		for (int i = 0; i < texto.length(); i++) 
		{
			if(texto.charAt(i) == 'a' || texto.charAt(i) == 'A')
			{
				contA++;
			}
			else if(texto.charAt(i) == 'e' || texto.charAt(i) == 'e')
			{
				contE++;
			}
			else if(texto.charAt(i) == 'i' || texto.charAt(i) == 'I')
			{
				contI++;
			}
			else if(texto.charAt(i) == 'o' || texto.charAt(i) == 'O')
			{
				contO++;
			}
			else if(texto.charAt(i) == 'u' || texto.charAt(i) == 'U')
			{
				contU++;
			}
		}
		System.out.println("La frase tiene:\nA: " + contA + "\nE: " + contE + "\nI: " + contI + "\nO: " + contO + "\nU: " + contU);
		scan.close();
	}
	
	public static void muestraFecha(String fecha)
	{
		Pattern pat = Pattern.compile("[0-9]{2}/\\d\\d/\\d\\d\\d\\d");
		Matcher mat = pat.matcher(fecha);
		if(mat.matches())
		{
			String trozos[] = fecha.split("/");
			String mes = "";
			switch (trozos[1]) 
			{
				case "01":
					mes = "Enero";
					break;
				case "02":
					mes = "Febrero";
					break;
				case "03":
					mes = "Marzo";
					break;
				case "04":
					mes = "Abril";
					break;
				case "05":
					mes = "Mayo";
					break;
				case "06":
					mes = "Junio";
					break;
				case "07":
					mes = "Julio";
					break;
				case "08":
					mes = "Agosto";
					break;
				case "09":
					mes = "Septiembre";
					break;
				case "10":
					mes = "Octubre";
					break;
				case "11":
					mes = "Nobiembre";
					break;
				case "12":
					mes = "Diciembre";
					break;
				default:
					mes = "(mes mal escrito)";
					break;
			}
			System.out.println("Es el " + trozos[0] + " de " + mes + " de " + trozos[2]);
		}
		else
		{
			System.out.println("La fecha " + fecha + " no esta en el formato correcto");
		}
	}
}
