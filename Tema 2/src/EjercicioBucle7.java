import java.util.*;

public class EjercicioBucle7 {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);
		int x, y;
		System.out.println("---Introduzca n�mero de d�gitos---");
		y = keyboard.nextInt();
		int dig = (int) Math.pow(10, (y - 1)); //n�mero de d�gitos
		System.out.println(dig);
		x = keyboard.nextInt();

		if (((x / dig) < 10) && ((x / dig) >= 1)) {
			System.out.println(x / dig); 
			System.out.println("N�mero de d�gitos correcto.");
		} else {
			System.out.println("N�mero de d�gitos incorrecto.");
		}

	}

}
