import java.util.*;

public class Ejercicio2 {

	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		double a;
		double b;
		double c;
		System.out.println("Introduzca lado 'a'.");
		a = teclado.nextDouble();
		System.out.println("Introduzca lado 'b'.");
		b = teclado.nextDouble();
		System.out.println("Introduzca lado 'c'.");
		c = teclado.nextDouble();
		double p = (a + b + c) / 2;
		double area = p * (p - a) * (p - b) * (p - c);

		if ((a == b) && (a == c)) {
			System.out.println("El tri�ngulo es equil�tero");
		} else if ((a == b) ^ (a == c) ^ (b == c)) {
			System.out.println("El tri�ngulo es is�sceles");
		} else if ((a != b) && ((b != c) && (a != c))) {
			System.out.println("El tri�ngulo es escaleno");
		}

		System.out.println("El area del tri�ngulo es: " + area
				+ " cm cuadrados.");

	}

}
