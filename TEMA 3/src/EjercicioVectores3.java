import java.util.*;

public class EjercicioVectores3 {
	
	public static void main(String args[]){
		
		Scanner kb=new Scanner(System.in);
		
		String nom[]=new String[5];
		int ed[]=new int[5];
		
		for (int v=0;v<5;v++){
			
			System.out.println("---Introduzca su nombre de tonto---");
			nom[v]=kb.next();
			
			System.out.println("---Introduzca su edad---");
			ed[v]=kb.nextInt();
			
		}
		
		for(int v=0;v<5;v++){
			
			if(ed[v]>=18){System.out.println(nom[v]+" es mayor de edad");}
			
		}
	}
}
