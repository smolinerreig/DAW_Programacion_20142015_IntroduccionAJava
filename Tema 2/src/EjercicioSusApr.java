import java.util.*;
/*
 * @author:
 * @description:
 */

public class EjercicioSusApr {

	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);

		double x = 0;
		System.out.println("Introduzca su nota: ");
		x = teclado.nextDouble();

		if (x >= 5) {
			System.out.println("Estás aprobado");
		} else {
			System.out.println("Estás suspendido");
		}

	}

}
