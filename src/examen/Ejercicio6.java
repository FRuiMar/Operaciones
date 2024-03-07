package examen;

import java.util.Scanner;

import utiles.Utiles;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
        int contador = 0;   //genero contador para las veces que se repite un número
        int num; 
		
		do {
            System.out.println("Introduce un número entre 1 y 6, vamos a ver cuantas veces setá en el array: ");
            num = sc.nextInt();
            sc.close();
        }while (num < 1 || num > 6);			//bucle que pide un número mientras no se introduzca entre un valor entre 1 y 6.
	
		
		int[] a = new int [10];				//genero un array de 10 posiciones
		for (int i = 0; i < 10; i++) {
			a[i] = Utiles.obtenerNumeroAzar(1, 6);	//los números al azar van del 1 al 6.
			if (a[i] == num) {      	//si el número que se almazena es igual al numero introducido por el usuario se activa el contador
				contador++;		
			}
			
		}
		utiles.UtilesArrays.imprimeArrays(a);  // imprimo array. Dejo un hueco con syso debajo, e imprimo la cantidad de veces que se repite el número
		System.out.println();
		System.out.println("El número introducido" + num + "se repite " + contador + " veces");
		
	}

}
