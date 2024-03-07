package capitulo04.bloque06b;

import java.util.Scanner;

import utiles.UtilesMatrices;

public class Ejercicio02_TresEnRaya {

	public static void main(String[] args) {
		
		
		int tablero[][] = new int[][]  {{0, 0, 0},{0, 0, 0},{0, 0, 0}}; 
		int numJugador = 1;
		int contador = 0;
									
		
		do {
			mostrarTablero(tablero);
			if (contador % 2 == 0)  numJugador = 1;					//numJugador = contador%2==0? 1:2;
			else numJugador = 2;
			juegaJugador (numJugador, tablero);
			contador++;
			
		}while(juegoEstaTerminado);
		
	}	

    private static void mostrarTablero (int[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print(tablero[i][j] + "\t"); 
			}
			System.out.println();  
		}
    }
	
	public static void juegaJugador (int num, int[][] tablero) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique la fila, jugador " + num + " ");
		int fila = sc.nextInt();		
		System.out.println("Indique la columna: ");
		int columna = sc.nextInt();
		
		
		tablero[fila - 1][columna - 1] = num;
	}
	
	public static boolean juegoEstaTerminado (int m[][]) {
		
		for (int i = 0; i < m.length; i++) {
			if((m[i][0] == m[i][1]) && (m[i][0] == m[i][2])) {
				return m[i][0];
			}
		}	
		for (int j = 0; j < m[0].length; j++) {
			if((m[0][j] == m[1][j]) && (m[0][j] == m[2][j])) {
				return m[0][j];
			}
			
		}	
		if ((m[0][0] == m[1][1]) && (m[1][1] == m[2][2])) {
			return m[0][0];
		}
		
		if ((m[0][2] == m[1][1]) && (m[1][1] == m[2][0])) {
			return m[0][2];
		}
	return false;	
	}


}
