import java.util.*;

public class EjercicioBucle4 {

	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuantos coches hay?");
		int x = teclado.nextInt();
		int precio = 1;
		int max = 0;
		int min = 0;

		for (int v = 0; v < x; v++) {

			System.out.println("Dime el precio del coche");

			precio = teclado.nextInt();
			
			if(v==0){max=precio;min=precio;}
			if(precio>max){max=precio;}
			if(precio<min){min=precio;}
			}
			System.out.println(max+ "<----maximo   minimo---->" +min);
		}

	}
