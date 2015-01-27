import java.util.*;

public class EjercicioRepaso2 {
	
	public static void main (String args[]){
		
		Scanner kb=new Scanner(System.in);
		int num[]=new int [10];
		int aux=0,cont=0;
		
		for(int i=0;i<10;i++){
			System.out.println("Introduzca el número en posición "+i);
			num[i]=kb.nextInt();
			
			if(num[i]>aux){aux=num[i];}
		}
		
		for(int i=0;i<10;i++){
			if(num[i]==aux){cont++;}
		}
		
		System.out.println("El mayor número que contiene el vector es el "+aux+", y lo contiene "+cont+" veces.");
		
	}

}
