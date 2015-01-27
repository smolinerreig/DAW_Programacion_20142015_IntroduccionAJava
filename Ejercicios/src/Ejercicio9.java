
import java.util.*;
/**
 * @author Samuel
 * @description Ejercicio 9 del dossier
 */

public class Ejercicio9 {

	public static void main(String args[]){
		
		String nombre;
		String direccion;
		int telefono;
		
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Nombre: ");
		nombre=teclado.nextLine();
		System.out.println("Dirección: ");
		direccion=teclado.nextLine();
		System.out.println("Teléfono: ");
		telefono=teclado.nextInt();
		
		System.out.printf("Nombre:%s\n Dirección:%s\n Teléfono:%s", nombre, direccion, telefono);
		
		
		
	}
}
