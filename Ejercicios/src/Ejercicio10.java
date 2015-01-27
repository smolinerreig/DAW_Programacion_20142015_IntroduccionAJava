import java.util.*;

/**
 * @author Samuel
 * @description
 */

public class Ejercicio10 {

	public static void main(String args[]){
		
		float gFahrenheit;
		float gCelsius;
		Scanner teclado = new Scanner(System.in);
		System.out.println("--Introduzca grados Fahrenheit--");
		gFahrenheit = teclado.nextFloat();
		gCelsius = (gFahrenheit - 32)/(1.8f);
		
				
		
		System.out.println("Temperatura: " + gCelsius + " grados Celsius.");
		
	}
}
