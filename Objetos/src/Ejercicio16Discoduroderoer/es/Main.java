//16) Escribe una aplicación con un String que contenga una contraseña cualquiera. Después se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo “Enhorabuena”. Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).
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
			System.out.println("Introduce la contraseña");
			if(scanner.next().equals(pass))
			{
				System.out.println("Contraseña correcta");
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
