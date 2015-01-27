import java.util.*;

public class Ejercicio15 {
	
	public static void main(String args[]){
		
		double L1;
		double L2;
		double L3;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca longitud de L1: ");
		L1=teclado.nextFloat();
		System.out.println("Introduzca longitud de L2: ");
		L2=teclado.nextFloat();
		System.out.println("Introduzca longitud de L3: ");
		L3=teclado.nextFloat();
		double SP=(L1+L2+L3)/2;
		double areaT=Math.sqrt((SP*(SP-L1)*(SP-L2)*(SP-L3)));
		System.out.println("El area del triángulo es: "+areaT);
		
		
		
	}

}
