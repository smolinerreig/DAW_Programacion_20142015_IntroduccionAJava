import java.util.*;

public class Ejercicio1 {

	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		int anno_Actual = 0;
		System.out.println("Introduzca año actual:");
		anno_Actual = teclado.nextInt();
		int anno = 0;
		System.out.println("Introduzca un año:");
		anno = teclado.nextInt();
		if (anno == anno_Actual) {
			System.out.println("Está usted en el presente.");
		} else if (anno < anno_Actual) {
			System.out.println("Está usted en el futuro.");
		} else {
			System.out.println("Está usted en el pasado");
		}

	}

}
