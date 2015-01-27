import java.util.*;

public class EjercicioArrays8 {
	
	public static void main (String args[]){
		
		Scanner kb=new Scanner(System.in);
		int sueldo[]=new int[5];
		int guardar;
		
		for(int v=0;v<5;v++){
			System.out.println("Introduzca sueldo "+v);
			sueldo[v]=kb.nextInt();
		}
			
			for(int j=0;j<4;j++){
				
				if(sueldo[j]>sueldo[j+1]){
					guardar=sueldo[j+1];
					sueldo[j+1]=sueldo[j];
					sueldo[j]=guardar;
				}
				
			for(int i=4;i>0;i--){
				
				if(sueldo[i]<sueldo[i-1]){
					guardar=sueldo[i-1];
					sueldo[i-1]=sueldo[i];
					sueldo[i]=guardar;
				}
				
			}
				
			
		}
				
		System.out.printf("%d%d%d%d%d",sueldo[0],sueldo[1],sueldo[2],sueldo[3],sueldo[4]);
	}

}
