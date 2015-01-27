import java.util.Scanner;

public class EjercicioArrays {
	
	public static void main (String args[]){
		
		Scanner kb=new Scanner(System.in);
		int num[]=new int[8];
		int acum=0, acum_36=0;
		int cont_50=0;

		for(int i=0;i<8;i++){
			System.out.println("---Entero número "+i+"---");
			num [i]=kb.nextInt();
			acum=acum+num[i];
			
			if (num[i]>36){acum_36=acum_36+num[i];}
			if (num[i]>50){cont_50++;}
			
		}
		
		System.out.println("La suma de todos los números es "+acum);
		System.out.println("La suma de los números mayores que 36 es "+acum_36);
		System.out.println("Hay "+cont_50+" números mayores que 50");
		
	}

}
