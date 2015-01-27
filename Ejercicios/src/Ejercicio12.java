import java.util.*;

public class Ejercicio12 {
	
	public static void main(String args[]){
		
		double x;
		double y;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduzca variable 'x': ");
		x = teclado.nextDouble();
		System.out.println("Introduzca variable 'y': ");
		y = teclado.nextDouble(); 
		
		double suma=(x+y);
		double resta=(x-y);
		double multiplicacion=(x*y);
		double division=(x/y);
		double potenciaX =Math.pow(2,x);
		double potenciaY =Math.pow(2,y);
		double raizX = Math.sqrt(x);
		double raizY = Math.sqrt(y);
		
		
		
		System.out.println("x+y= "+suma);		
		System.out.println("x-y= "+resta);
		System.out.println("x*y= "+multiplicacion);
		System.out.println("x/y= "+division);
		System.out.println("x^2= "+potenciaX);
		System.out.println("y^2= "+potenciaY);
		System.out.println("Raiz de x= "+raizX);
		System.out.println("Raiz de y= "+raizY);
		
	}

}
