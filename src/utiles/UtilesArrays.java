package utiles;

public class UtilesArrays {
	
	/**
	 * Imprime el array en consola, de forma que queda en una única línea y con
	 * un espacio en blanco entre valores
	 * @param num
	 */	
	public static void imprimeArrays (int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * Genera un array al azar entre dos límites indicados
	 * @param a
	 * @param limInf
	 * @param limSup
	 */
	public static void inicializaArray (int a[], int limInf, int limSup) {
		for (int i = 0; i < a.length; i++) {
			a[i] = Utiles.obtenerNumeroAzar(limInf, limSup);
		}
	}
	
	public static void cambiaSignoEnValores (int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				a[i] = -a[i];        //se puede hacer multiplicando por -1
			}
		}
	}
	

}
