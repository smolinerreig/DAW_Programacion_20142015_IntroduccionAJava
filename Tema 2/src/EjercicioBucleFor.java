import java.util.*;

public class EjercicioBucleFor {

	public static void main(String main[]) {

		Scanner teclado = new Scanner(System.in);
		double y = 0;
		for (int v = 0; v < 10; v++) {
			System.out.println("---Introduzca número entero---");
			int x = teclado.nextInt();
			y = y + x;
		}

		System.out.println("LA MEDIA ES " + y / 10);

	}

}
