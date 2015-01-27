import java.util.*;

public class EjercicioBucle11 {
	
	public static void main(String args[]){
		
		Scanner kb=new Scanner(System.in);
		int x;
		System.out.println("¿Cuantos sueldos desea ingresar?");
		int n=kb.nextInt();
		int max=0;
		int min=0;
		
		for (int v=0;v<n;v++){
			x=kb.nextInt();
			if (v==0){max=x;min=x;}
			if (x<=min){min=x;}
			if (x>=max){max=x;}
		}
		System.out.println("El sueldo máximo es "+max+" y el mínimo es "+min+".");
		
		
	}

}
