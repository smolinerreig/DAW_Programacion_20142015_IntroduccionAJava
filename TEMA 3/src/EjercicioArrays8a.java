/** 
 * Es el mismo que el 8, pero ampliado. 
 * Los vectores se pueden comparar "de izquierda a derecha y de derecha a izquierda y se ordenarán"
 */

import java.util.Scanner;

public class EjercicioArrays8a {
	
	public static void main (String args[]){
		
		Scanner kb=new Scanner(System.in);
		
		System.out.println("---¿De que tamaño es el vector?---");
		int n=kb.nextInt();
		int sueldo[]=new int[n];
		int guardar;
		
		for(int v=0;v<n;v++){
			System.out.println("Introduzca sueldo "+v);
			sueldo[v]=kb.nextInt();
		}
			
			for(int j=0;j<(n-1);j++){
				
				if(sueldo[j]>sueldo[j+1]){
					guardar=sueldo[j+1];
					sueldo[j+1]=sueldo[j];
					sueldo[j]=guardar;
				}
				
			for(int i=(n-1);i>0;i--){
				
				if(sueldo[i]<sueldo[i-1]){
					guardar=sueldo[i-1];
					sueldo[i-1]=sueldo[i];
					sueldo[i]=guardar;
				}
				
			}
				
			
		}
			for(int i=0;i<n;i++){	
		System.out.print(" "+sueldo[i]);
			}
	}

}
