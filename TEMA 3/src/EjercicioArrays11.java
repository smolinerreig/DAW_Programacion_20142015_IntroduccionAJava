import java.util.*;

public class EjercicioArrays11 {
	
	public static void main (String args[]){
		
		Scanner kb=new Scanner(System.in);
		int num[]=new int[10];
		int dig[]=new int[10];
		int pos[]=new int[10];
		int v=1, max_dig=0, pos_max=0, n=0;
		
		for(int i=0;i<10;i++){
			
			System.out.println("---Introduzca el n�mero en la posici�n "+i+" del vector---");
			num[i]=kb.nextInt();
			
		}
		
			for(int i=0;i<10;i++){
				
				v=1;		
				
				while((num[i]/10)>=1){
					v++;
					num[i]=num[i]/10;
				}
				
				if(v>max_dig){
					max_dig=v;
					pos_max=i;
				}
									
			} 
			
			System.out.printf("El n�mero con m�s d�gitos (%d d�gitos) est� en la posici�n %d del vector.",max_dig,pos_max);
			
			
	}
	
}
