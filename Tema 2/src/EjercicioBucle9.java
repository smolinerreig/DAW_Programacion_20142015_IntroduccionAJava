import java.util.*;

public class EjercicioBucle9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("---Introduzca edades---");
		int edad = 0;
		int edades = 0;
		int cont = 0;
		int max = 0;
		int min = 0;
		int jub = 0;

		while (edad >= 0) {
			edad = kb.nextInt();

			if (edad >= 0) {
				edades = edades + edad;
				cont++;

				if (cont == 1) {
					max = edad;
					min = edad;
				} else if (edad >= max) {
					max = edad;
				} else if (edad <= min) {
					min = edad;
				}
				if (edad >= 65) {
					jub++;

				}
			}
		}
		System.out.println("La media de edad es " + (double) edades / cont);
		System.out.println("La edad máxima es " + max);
		System.out.println("La edad mínima es " + min);
		System.out.println("El número de jubilados es de " + jub);
	}
}
