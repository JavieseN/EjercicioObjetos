//16) Escribe una aplicaci�n con un String que contenga una contrase�a cualquiera. Despu�s se te pedir� que introduzcas la contrase�a, con 3 intentos. Cuando aciertes ya no pedir� mas la contrase�a y mostrara un mensaje diciendo �Enhorabuena�. Piensa bien en la condici�n de salida (3 intentos y si acierta sale, aunque le queden intentos).
package Ejercicio16Discoduroderoer.es;

import java.util.Scanner;

public class Main 
{

	public final static String pass = "Hola";
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		boolean igual = false;
		for(int i = 0 ; i < 3 && igual == false  ; i++)
		{
			System.out.println("Introduce la contrase�a");
			if(scanner.next().equals(pass))
			{
				System.out.println("Contrase�a correcta");
				igual = true;
			}
			else
			{
				System.out.println("AAAAAAAAAAAAAA!");
			}
		}
		scanner.close();
		
		
				
	}

}
