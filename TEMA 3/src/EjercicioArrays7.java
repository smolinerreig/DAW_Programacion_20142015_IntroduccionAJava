import java.util.*;

public class EjercicioArrays7 {
	
	public static void main (String args []){
		
		Scanner kb=new Scanner(System.in);
		System.out.println("---Introduzca tama�o del vector---");
		int n=kb.nextInt();
		int num[]=new int[n];
		int min=0;
		int cont_Min=0;
		
		for(int v=0;v<n;v++){
			System.out.println("---Introduzca n�mero "+v+"---");
			num[v]=kb.nextInt();
			if (v==0){min=num[v];}
			if (num[v]<min){min=num[v];}
			
		}
		
		for(int v=0;v<n;v++){
			
			if (num[v]==min){cont_Min++;}
			
		}
		
		System.out.println("El n�mero m�nimo introducido es "+min+"\nDicho n�mero aparece "+cont_Min+" veces.");
				
	}

}
