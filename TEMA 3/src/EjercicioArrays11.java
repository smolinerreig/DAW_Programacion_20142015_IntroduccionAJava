import java.util.*;

public class EjercicioArrays11 {
	
	public static void main (String args[]){
		
		Scanner kb=new Scanner(System.in);
		int num[]=new int[10];
		int dig[]=new int[10];
		int pos[]=new int[10];
		int v=1, max_dig=0, pos_max=0, n=0;
		
		for(int i=0;i<10;i++){
			
			System.out.println("---Introduzca el número en la posición "+i+" del vector---");
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
			
			System.out.printf("El número con más dígitos (%d dígitos) está en la posición %d del vector.",max_dig,pos_max);
			
			
	}
	
}
