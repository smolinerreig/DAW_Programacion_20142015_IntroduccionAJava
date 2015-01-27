import java.util.*;

public class Ejercicio3 {

	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		double x;
		double y;
		System.out.println("Introduzca coordenada en 'x'");
		x = teclado.nextDouble();
		System.out.println("Introduzca coordenada en 'y'");
		y = teclado.nextDouble();

		if ((x == 0) && (y == 0)) {
			System.out.println("El punto se encuentra en el origen de coordenadas");
		}
		if ((x == 0) && (y != 0)) {
			System.out.println("El punto se encuentra en el eje x");
		} else if ((y == 0) && (x != 0)) {
			System.out.println("El punto se encuentra en el eje y");
		}
		if ((x < 0) && (y < 0)) {
			System.out
					.println("El punto se encuentra en el cuadrante inferior izquierdo");
		} else if ((x < 0) && (y > 0)) {
			System.out
					.println("El punto se encuentra en el cuadrante superior izquierdo");
		} else if ((x > 0) && (y < 0)) {
			System.out
					.println("El punto se encuentra en el cuadrante inferior derecho");
		} else if ((x > 0) && (y > 0)) {
			System.out
					.println("El punto se encuentra en el cuadrante superior derecho");
		}

	}

}
