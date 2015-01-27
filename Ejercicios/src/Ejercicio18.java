import java.util.*;

public class Ejercicio18 {
	
	public static void main(String args[]){
		
		Scanner teclado=new Scanner(System.in);
		double a;
		System.out.println("Introduzca a: ");
		a=teclado.nextDouble();
		double b;
		System.out.println("Introduzca b: ");
		b=teclado.nextDouble();
		double c;
		System.out.println("Introduzca c: ");
		c=teclado.nextDouble();
		
		double x1=((-b+(Math.sqrt(4*a*c)))/(a*2));
		double x2=((-b-(Math.sqrt(4*a*c)))/(a*2));
		
		System.out.println("x1="+x1);
		System.out.println("x2="+x2);
		
	}

}
