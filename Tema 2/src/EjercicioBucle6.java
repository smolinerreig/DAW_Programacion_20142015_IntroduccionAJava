/**@author 
 */
import java.util.*;

public class EjercicioBucle6 {

	public static void main(String args[]) {

		Scanner kb = new Scanner(System.in);

		int cod = 1;
		int alq = 0;
		int max_1 = 0;
		int max_2 = 0;
		int min = 0;
		int c_max1 = 0;
		int c_max2 = 0;
		int c_min = 0;
		int cont = 0;
		int cont_20 = 0;
		int cont_5 = 0;
		int cont_715 = 0;
		int tot_alq = 0;

		while (cod > 0) {

			System.out.println("---Introduzca el código de la película---");
			cod = kb.nextInt();

			if ((cod <= 999) && (cod > 0)) {
				cont++;
				System.out.println("---Introduzca cuantas veces ha sido alquilada---");
				alq = kb.nextInt();
				tot_alq = tot_alq + alq;

				if (cont == 1) {
					max_1 = alq;
					max_2 = alq;
					min = alq;
					c_min = cod;
					c_max1 = cod;
					c_max2 = cod;
				}

				if (alq < min) {
					min = alq;
					c_min = cod;
				}

				if ((alq > max_2) && (alq < max_1)) {
					max_2 = alq;
					c_max2 = cod;
				}

				if ((alq > max_1)) {
					max_2 = max_1;
					c_max2 = c_max1;
					max_1 = alq;
					c_max1 = cod;
				}
				if (alq > 20) {
					cont_20++;
				}
				if (alq < 5) {
					cont_5++;
				}
				if ((alq >= 7) && (alq <= 15)) {
					cont_715++;
				}

			}

		}

		System.out.println("El código de la película más alquilada es "+ c_max1);
		System.out.println("El código de la segunda película más alquilada es "+ c_max2);
		System.out.println("El código de la película menos alquilada es "+ c_min);
		System.out
				.println("Porcentaje de películas alquiladas más de 20 veces: "+ 100 * (double) cont_20 / cont + "%");
		System.out
				.println("Porcentaje de películas alquiladas menos de 5 veces: "+ 100 * (double) cont_5 / cont + "%");
		System.out
				.println("Porcentaje de películas alquiladas entre 7 y 15 veces: "+ 100 * (double) cont_715 / cont + "%");
		System.out.println("La media de alquiler de una película es de "+ ((double) tot_alq / cont) + " veces.");
	}

}
