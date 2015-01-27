import java.util.*;

public class EjercicioBucleFor4 {

	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuantos números quiere introducir?");
		int n = teclado.nextInt();
		int num, max = 0, min = 0;

		for (int i = 1; i <= n; i++) {
			num = teclado.nextInt();

			if (i == 1) {
				max = num;
				min = num;
			}

			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}
		
		System.out.println("El número mínimo es " + min
				+ " y el número máximo es " + max);
		
	}
}