package utiles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Utiles {
	
	
	
	/**
	 * Genera un número al azar entre 0 y 100.
	 * @return Número generado al azar.
	 */
	public static int obtenerNumeroAzar () {
		 return (int) Math.round(Math.random() * 100);
	}
	
	
	/**
	 * 
	 * @param min Límite inferior del número al azar
	 * @param max Límite superior del número al azar
	 * @return Número generado al azar entre los límites.
	 */
	public static int obtenerNumeroAzar (int min, int max) {
		 return (int) Math.round(Math.random() * (max - min)) + min;
	}
	
	
	/**
	 * 
	 * @param min Límite inferior del número par al azar
	 * @param max Límite superior del número par al azar
	 * @return Número par generado al azar entre los límites.
	 */
	public static int obtenerNumeroParesAzar (int min, int max) {
		int num;
		do {
			num = (int) Math.round(Math.random() * (max - min)) + min;
		}while (num % 2 != 0);
		return num;
	}
	
	
	
	
	
	/**
	 * Pide un número entero con JOptionPane.
	 * @return Número entero introducido.
	 */
	public static int obtenerEnteroPorJOptionPane() {
		String str = JOptionPane.showInputDialog("Introduce un número");
		int numEntero = Integer.parseInt(str);
		return numEntero;
	}
	
	
	
	/**
	 * Pide un número entero al usuario
	 * @param mensaje String que va a mostrarse en consola para pedir el número
	 * @return Número entero introducido por el usuario
	 */
	public static int pideNumeroEntero (String mensaje) {
		int n = 0;
		boolean esNumeroCorrecto;
		Scanner sc = new Scanner(System.in);
		
		do {
			esNumeroCorrecto = false;
			try {
				System.out.println(mensaje);
				n = Integer.parseInt(sc.nextLine());
				esNumeroCorrecto = true;
			}
			catch (Exception e) {
				System.out.println("No ha introducido un número");
			}
		} while (esNumeroCorrecto == false);
		
		return n;
	}
	
	
	
	/**
	 * Obtiene un número entero introducido por el usuario, por el método de InputStreamReader
	 * @return Número entero introducido por el usuario.
	 */
	public static int obtenerEnteroPorInputStreamReader () {
		int numero = 0;
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader (isr);
			numero = Integer.parseInt (br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return numero;
	}

	
	/**
	 * Obtiene un número entero a través de un objeto Scanner
	 * @return Número entero introducido por el usuario.
	 */
	public static int obtenerEnteroPorScanner() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			try {
				return sc.nextInt();
			} catch (Exception ex) {
				System.out.println("Error, introduce un número entero: ");
				sc.nextLine();
			}
		}
		
	}
	
	
	/**
	 * 
	 * @param mensaje
	 * @return
	 */
	public static int obtenerEnteroPorJOptionPane (String mensaje) {
		String str = JOptionPane.showInputDialog(mensaje);
		int numEntero = Integer.parseInt(str);
		return numEntero;
	}
	
	
	public static int obtenerEnteroConDescripcion(String desc) {
		System.out.println(desc);
		int num = obtenerEnteroPorScanner();
		return num;
	}
	
	/**
	 * 
	 * @return Número entero introducido por el usuario
	 */
	public static int obtenerEntero() {
		return obtenerEnteroPorJOptionPane();
	}
	
	
	
	
	
	
	
	/**
	 * 
	 * @param mensajeAlUsuario
	 * @param limiteInf
	 * @param limiteSup
	 * @return
	 */
	public static int obtenerEnteroEntreLimites (String mensajeAlUsuario, int limiteInf,
			int limiteSup) {
		int numeroADelvolver = 0;
		
		Scanner sc = new Scanner(System.in);
		boolean datoCorrecto;
		do {
			try {
				datoCorrecto = true;
				System.out.println(mensajeAlUsuario);
				numeroADelvolver = sc.nextInt();

				if (numeroADelvolver < limiteInf || numeroADelvolver > limiteSup) {
					datoCorrecto = false;
					System.out.println("ERROR, debes introducir un número entre " +
							limiteInf + " y " + limiteSup);
				}
			}
			catch (Exception ex) {
				System.out.println("ERROR, no has introducido un dato númerico entre " + 
						limiteInf + " y " + limiteSup);
				sc.next();
				datoCorrecto = false;
			}
		} while (!datoCorrecto);

		return numeroADelvolver;
	}
	

}
