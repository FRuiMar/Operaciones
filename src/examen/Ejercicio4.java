package examen;

import utiles.Utiles;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		
		int contador = 0;
		int[] a = new int [100];
		for (int i = 0; i < a.length; i++) {    //genero array de 100 elementos al azar entre 0 y 100.
			a[i] = Utiles.obtenerNumeroAzar(0, 100);
			int num = a[i];
			boolean esPrimo = true;
			int j = 2;
			
			for (j = 2; j < num; j++) {
				if (num % j == 0) {
					esPrimo = false;
				}
				else {
					esPrimo=true;
					contador++;
				}
				
				
				if (esPrimo == true) {
					System.out.print(num + " ");
				}				
			}
			
		}System.out.println("Numero de primos: " + contador);
	}

}
