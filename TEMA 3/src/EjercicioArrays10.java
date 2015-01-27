import java.util.*;

public class EjercicioArrays10 {
	
	public static void main (String args[]){
		
		Scanner kb=new Scanner (System.in);
		int num[]=new int[10];
		int v=0;
		
		for(int i=0;i<10;i++){
			
			System.out.println("---Introduzca el número en la posición "+i+" del vector---");
			num[i]=kb.nextInt();
			
		}
		
		for(int i=0;i<10;i++){
			System.out.println();
			v=0;
			
			while(v<num[i]){
				v++;
				
				if(v!=num[i]){
					System.out.print(v);
					
				}
				
			}
			
		}
		
	}

}
