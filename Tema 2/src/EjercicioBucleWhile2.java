import java.util.*;

public class EjercicioBucleWhile2 {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);
		int x = 1;
		int y = 0;

		while (x != 0) {
			System.out.println("Insert number");
			x = keyboard.nextInt();
			y = x + y;

			System.out.println(y);
		}
		System.out.println("---Programa terminado---");

	}

}
