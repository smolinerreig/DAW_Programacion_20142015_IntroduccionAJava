import java.util.*;

public class Ejercicio20 {
	
	public static void main(String args[]){
		
		Scanner teclado=new Scanner(System.in);
		int anyos;
		System.out.println("Introduzca edad en años:");
		anyos=teclado.nextInt();
		int minutosResto=anyos%525600;
		int minutos=(anyos*525600)-(minutosResto);
		int segundos=minutosResto*60;
		System.out.println("Edad en minutos y segundos: "+minutos+ " minutos " +segundos+ " segundos");
		
		
		
		
	}

}
