import java.util.Scanner;

public class EjercicioArrays6 {
	
	public static void main (String args[]){
		
		Scanner kb=new Scanner(System.in);
		
		String nombre[]=new String[5];
		int sueldo[]=new int[5];
		int max=0;
		String op="Opie";
		
		for(int v=0;v<5;v++){
			
			System.out.println("Introduzca el nombre del operario número "+(v+1));
			nombre[v]=kb.next();
			System.out.println("Introduzca el sueldo de "+nombre[v]);
			sueldo[v]=kb.nextInt();
			
			if(sueldo[v]>max){max=sueldo[v];op=nombre[v];}
		}
		
		System.out.println("El operario que más cobra es "+op+" ("+max+" €)");
		
	}

}
