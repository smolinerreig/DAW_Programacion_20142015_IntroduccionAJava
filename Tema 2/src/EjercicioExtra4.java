import java.util.*;

public class EjercicioExtra4 {

	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		System.out
				.println("----ELIJA SU OPERACIÓN---- \n(1)....SUMA \n(2)....RESTA \n(3)....MULTIPLICACIÓN \n(4)....DIVISIÓN \n(5)....POTENCIA \n(6)....TERMINAR PROGRAMA");
		int op = teclado.nextInt();

		if (op != 6) {

			System.out.println("Elija su primer operando");
			double n1 = teclado.nextDouble();
			System.out.println("Elija su segundo operando");
			double n2 = teclado.nextDouble();

			double suma = (n1 + n2);
			double resta = (n1 - n2);
			double multiplicacion = (n1 * n2);
			double division = (n1 / n2);
			double potencia = Math.pow(n1, n2);

			if (op == 1) {
				System.out.println(suma);
			} else if (op == 2) {
				System.out.println(resta);
			} else if (op == 3) {
				System.out.println(multiplicacion);
			} else if (op == 4) {
				System.out.println(division);
			} else if (op == 5) {
				System.out.println(potencia);
			}
		}

		{
			System.out.println("----FIN DEL PROGRAMA----");
		}

	}

}
