package examen;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		
		int suma = 0;   //variable acumulador para ir sumando luego los divisores.
		
		Scanner sc = new Scanner(System.in);            //pido numero entero.
		System.out.println("Introduce un número. /nVamos a comprobar si es un número perfecto:");
		int num = sc.nextInt();      
		sc.close();
		
		for (int i = 1; i < num; i++) {		//bucle para buscar divisores para el número que se está comprobando
			if (num % i == 0) {
				suma = suma + i;					//Creo un acumulador para almacenar la suma de los divisores válidos.
			} 

		}
		if (suma == num) {																//si la suma de los divisores es igual al numero
			System.out.println("El número " + num + " es perfecto");					// el numero es primo
		}
		else {
			System.out.println("El número " + num + " no es perfecto");
		}
	
	}

}
