package capitulo04.bloque06b;

import java.util.Scanner;

import utiles.Utiles;
import utiles.UtilesMatrices;

public class Ejercicio01_TresEnRaya {

    public static void main(String[] args) {
        int[][] tablero = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        
        inicializaTablero(tablero);
        imprimeTablero(tablero);
        comienzaJuego(tablero);
    }
        
    private static void comienzaJuego(int[][] tablero) {
    	int cantidad_casillas = (tablero.length * tablero[0].length);
    	int fila, columna;
    	int turno = 1;
    	
    	
    	do {
    		fila = Utiles.obtenerEnteroConDescripcion("Seleccione la  fila deseada: ");
    		columna = Utiles.obtenerEnteroConDescripcion("Seleccione la columna deseada: ");
    	} while
    	
  
    	
    }


    private static void mostrarTablero (int[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print(tablero[i][j] + "\t"); 
			}
			System.out.println();  
		}
    }
     	
//    private static void mostrarTablero(int[][] tablero) {
//        System.out.println("  0 1 2");
//        for (int i = 0; i < 3; i++) {
//            System.out.print(i + " ");
//            for (int j = 0; j < 3; j++) {
//                System.out.print((tablero[i][j] == 0) ? " " : tablero[i][j]);
//                if (j < 2) {
//                    System.out.print("|");
//                }
//            }
//            System.out.println();
//            if (i < 2) {
//                System.out.println("  -----");
//            }
//        }
//        System.out.println();
//    }

    private static void realizarMovimiento(int[][] tablero, int jugador) {
        Scanner sc = new Scanner(System.in);
        int fila, columna;

        do {
            System.out.println("Jugador " + jugador + ", ingresa tu movimiento (fila y columna): ");
            fila = sc.nextInt();
            columna = sc.nextInt();
        } while (fila < 0 || fila >= 3 || columna < 0 || columna >= 3 || tablero[fila][columna] != 0);

        tablero[fila][columna] = jugador;
        sc.close();
    }

    private static boolean verificarGanador(int[][] tablero, int jugador) {
        for (int i = 0; i < 3; i++) {
            if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) ||
                (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)) {
                System.out.println("¡Jugador " + jugador + " ha ganado!");
                return true;
            }
        }

        if ((tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) ||
            (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador)) {
            System.out.println("¡Jugador " + jugador + " ha ganado!");
            return true;
        }

        return false;
    }

    private static boolean tableroLleno(int[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == 0) {
                    return false;
                }
            }
        }
        System.out.println("¡El juego ha terminado en empate!");
        return true;
    }
}
