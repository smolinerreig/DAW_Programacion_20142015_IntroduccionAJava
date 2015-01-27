import java.util.*;

/**
 * @author Tortellinicorp
 * @description Un programica muy apaña'o 
 * 
 * 
 */

public class EjercicioMatrices {

	public static void main(String args[]) {

		Scanner kb = new Scanner(System.in);

		int reserva[][] = new int[5][20];
		int sala = 0, comp = 0, turno = 0;
		String des = "lol";
		int disp[] = new int[21];
		int n = 0, i = 0;
		int cod = 0;

		for (int s = 0; s < 5; s++) {
			for (int c = 0; c < 20; c++) {
				reserva[s][c] = 0;
			}
		}

		while (cod != 4) {

			System.out
					.print("\n\n...\n1. Asignar o cancelar turno\n2. Cantidad de equipos disponibles por sala\n3. Cantidad de turnos asignados\n4. Salir\n...");
			cod = kb.nextInt();

			if (cod == 1) {

				System.out.println("---¿Desea usted [reservar] o [cancelar] un turno?---");
				des = kb.next();

				if (des.compareTo("reservar") == 0) {

					System.out.println("---¿En que sala desea reservar?[0-4]---");
					sala = kb.nextInt();
					System.out.println("---¿Que computadora desea reservar?[0-19]---");
					comp = kb.nextInt();
					
					if (reserva[sala][comp] == 0) {
						reserva[sala][comp] = 1;
					} else {
						System.out.println("---Turno ocupado. Vuelva a probar---");
					}

				} else if (des.compareTo("cancelar") == 0) {

					System.out
							.println("---¿En que sala desea cancelar el turno?[0-4]---");
					sala = kb.nextInt();
					System.out
							.println("---¿En que computadora desea cancelar el turno?[0-19]---");
					comp = kb.nextInt();
					
					if (reserva[sala][comp] == 1) {
						reserva[sala][comp] = 0;
						System.out.println("---Turno cancelado---");
					} else {
						System.out.println("---No hay turno asignado, luego no puede cancelarse. Vuelva a probar---");
					}

				}
			}

			else if (cod == 2) {
				for (int s = 0; s < 5; s++) {
					System.out.print("\nEn la sala " + s + " están disponibles los equipos: ");
					n = 0;
					for (int c = 0; c < 20; c++) {
						if (reserva[s][c] == 0) {
							System.out.print(c + " ");
						}
					}
				}
			}

			else if (cod == 3) {
				for (int s = 0; s < 5; s++) {
					System.out.print("\nEn la sala " + s + " están asignados los equipos: ");
					n = 0;
					for (int c = 0; c < 20; c++) {
						if (reserva[s][c] == 1) {
							System.out.print(c + " ");
						}
					}
				}
			}

			else if (cod == 4) {
				System.out.println("---Fin de Programa---");

			}

			else {
				System.out.println("---Escriba un código correcto---");
			}
		}
	}
}
