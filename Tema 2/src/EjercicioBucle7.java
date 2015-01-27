import java.util.*;

public class EjercicioBucle7 {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);
		int x, y;
		System.out.println("---Introduzca número de dígitos---");
		y = keyboard.nextInt();
		int dig = (int) Math.pow(10, (y - 1)); //número de dígitos
		System.out.println(dig);
		x = keyboard.nextInt();

		if (((x / dig) < 10) && ((x / dig) >= 1)) {
			System.out.println(x / dig); 
			System.out.println("Número de dígitos correcto.");
		} else {
			System.out.println("Número de dígitos incorrecto.");
		}

	}

}
