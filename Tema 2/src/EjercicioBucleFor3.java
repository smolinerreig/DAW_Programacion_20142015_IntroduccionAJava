import java.util.*;

public class EjercicioBucleFor3 {

	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);

		int v = 1;
		int y;

		System.out.println("---Introduzca el número cuya tabla de multiplicar quieras ver---");
		int x = teclado.nextInt();

		for (v = 1; v <= 10; v++) {

			y = x * v;
			System.out.println("---> " + x + "*" + v + "=" + y);

		}

	}

}
