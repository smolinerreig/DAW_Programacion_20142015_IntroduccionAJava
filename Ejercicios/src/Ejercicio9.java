
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
		System.out.println("Direcci�n: ");
		direccion=teclado.nextLine();
		System.out.println("Tel�fono: ");
		telefono=teclado.nextInt();
		
		System.out.printf("Nombre:%s\n Direcci�n:%s\n Tel�fono:%s", nombre, direccion, telefono);
		
		
		
	}
}
