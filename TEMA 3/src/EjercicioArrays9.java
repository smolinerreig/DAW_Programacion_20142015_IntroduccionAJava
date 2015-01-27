import java.util.*;

public class EjercicioArrays9 {
	
	public static void main (String args[]){
		
		Scanner kb=new Scanner(System.in);
		String guardar="Trololo";
		
		String pais[]=new String[5];
		int v=0;
		
		for(int i=0;i<5;i++){
			
			System.out.println("Introduzca el nombre del país número "+i);
			pais[i]=kb.next();
			
		}
		
		for(int i=0;i<4/**5-1 para no salirse del array*/;i++){
	
			if(pais[i].compareTo(pais[i+1])>0){
				guardar=pais[i+1];
				pais[i+1]=pais[i];
				pais[i]=guardar;
			}
			
		}
		for(int j=4;j>0;j--){
			
			if(pais[j].compareTo(pais[j-1])<0){
				guardar=pais[j-1];
				pais[j-1]=pais[j];
				pais[j]=guardar;
			}
				
		}
		
		while(v<5){System.out.println(pais[v]);v++;}
	}

}
