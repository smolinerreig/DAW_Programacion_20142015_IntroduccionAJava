import java.util.*;

public class EjercicioArrays4 {
	
	public static void main (String args[]){
		
		Scanner kb=new Scanner(System.in);
		int vec []=new int [10];
		int v=0, comp=0;
				
		for(v=0;v<10;v++){
		System.out.println("Introduzca el n�mero en posici�n "+v);
		vec[v]=kb.nextInt();
		}
		
		for(v=0;v<9;v++){
			
		if(vec[v]<vec[v+1]){comp++;}
			
		}
		if (comp==9){
			System.out.println("El vector est� ordenado de modo creciente");
		}else{System.out.println("El vector NO est� ordenado de modo creciente");}
	}

}
