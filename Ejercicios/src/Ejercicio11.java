import java.util.*;

public class Ejercicio11 {

	public static void main(String args []){
		
		float c1;
		float c2;
		float x;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Primera variable:");
		c1 = teclado.nextFloat();
		System.out.println("Segunda variable:");
		c2 = teclado.nextFloat();
		x=(-c2/c1);
		System.out.printf("El valor de 'x' es %f",x);
		
		
	}
	
}
