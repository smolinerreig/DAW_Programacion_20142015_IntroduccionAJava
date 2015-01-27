import java.util.*;

public class Ejercicio8 {

	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		double p1;
		p1 = teclado.nextDouble();
		double p2;
		p2 = teclado.nextDouble();
		double p3;
		p3 = teclado.nextDouble();

		if (((p1) > (p2)) && ((p1) > (p3))) {
			if (p2 > p3) {
				System.out.println("--/" + p1 + "/" + p2 + "/" + p3 + "/--");
			} else {
				System.out.println("--/" + p1 + "/" + p3 + "/" + p2 + "/--");
			}
		} else if ((p3 > p1) && (p1 > p2)) {
			System.out.println("--/" + p3 + "/" + p1 + "/" + p2 + "/--");
		}

		if (((p2) > (p1)) && ((p2) > (p3))) {
			if (p3 > p1) {
				System.out.println("--/" + p2 + "/" + p3 + "/" + p1 + "/--");
			} else {
				System.out.println("--/" + p2 + "/" + p1 + "/" + p3 + "/--");
			}
		} else if ((p3 > p2) && (p2 > p1)) {
			System.out.println("--/" + p3 + "/" + p2 + "/" + p1 + "/--");
		}

	}

}
