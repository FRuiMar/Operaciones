package examen;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
		System.out.println("Indica con un número la posición de Fibonacci quieres mostrar: ");
		int posicion = sc.nextInt();   //solicito un número entero
		
		int fib1 = 0;  		//creo las variables  fib1 y fib2 para poder operar con ellos
		int fib2 = 1;    	// y fibMem para poder intercambiar valores más adelante
		int fibMem;
		
		if (posicion == 1) {     // decido empezar usando la variable 0, por lo que en esta condicion para que no salga 0, especifico que es 1.
			System.out.println("La secuencia de Fibonacci sería " + fib2);
		} 
		else {	
			int i = 1;
			while (i <= posicion ) {	//bucle while( aunque es un for)  empezando en uno hasta la posición solicitada
				fibMem = fib1 + fib2;	// al ser la posición igual al último número que se calcula en la última iteración
				fib1 = fib2;			//solo tengo que imprimir ese valor
				fib2 = fibMem;
				i++;			
			}
			
			System.out.println("El número en la posición " + posicion + " de la secuencia de Fibonacci es: " + fib1);
		}									// imprimo el valor que se obtiene en la última posición .
		sc.close();
		
		
	}

}
