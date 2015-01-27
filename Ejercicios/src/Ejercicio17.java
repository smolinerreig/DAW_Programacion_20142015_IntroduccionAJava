import java.util.*;

public class Ejercicio17 {

	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		long horas;
		horas=teclado.nextLong();
		long semanas=(horas/168);
		long semanasRest=(horas%168);
		long dias=(semanasRest/24);
		long horasRest=(semanasRest%24);
		System.out.println(semanas);
		System.out.println(dias);
		System.out.println(horasRest);
		
		
		
		
		
		
		
		
	}
	
}
