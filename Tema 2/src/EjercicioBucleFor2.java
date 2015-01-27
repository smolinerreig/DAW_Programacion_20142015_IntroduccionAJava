import java.util.*;

public class EjercicioBucleFor2 {
	
	public static void main(String args[]){
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca la cantidad de números a leer");
		int n=teclado.nextInt();
		int y=0;
		double x;
		
		for(int i=0;i<n;i=i+1){
			System.out.println("Escribe un numerito, majo");
			x=teclado.nextDouble();
			
			if(x%2==0){
			y=y+(int)x;				
				
			}
			
		}
		
		System.out.println(y);	
		
	}

}
