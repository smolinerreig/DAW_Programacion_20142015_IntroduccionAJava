import java.util.*;

public class Ejercicio1 {

	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		int anno_Actual = 0;
		System.out.println("Introduzca a�o actual:");
		anno_Actual = teclado.nextInt();
		int anno = 0;
		System.out.println("Introduzca un a�o:");
		anno = teclado.nextInt();
		if (anno == anno_Actual) {
			System.out.println("Est� usted en el presente.");
		} else if (anno < anno_Actual) {
			System.out.println("Est� usted en el futuro.");
		} else {
			System.out.println("Est� usted en el pasado");
		}

	}

}
