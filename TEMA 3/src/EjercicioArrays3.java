import java.util.*;

public class EjercicioArrays3 {
	
	public static void main (String args[]){
		
		Scanner kb=new Scanner(System.in);
		
		int c_A []=new int [5];
		int c_B []=new int [5];
		int cont=0; 
		char cl=0;
		int tot_A=0, tot_B=0;
		int a=0 ,b=0;
		
		while(cont<10){
		
			System.out.println("Introduzca la clase\n¿a o b?");
			cl=kb.next().charAt(0);
			
			if((cl=='a')&&(a<5)){
				System.out.println("Introduzca la nota del alumno "+a);
				c_A[a]=kb.nextInt();
				tot_A=tot_A+c_A[a];
				cont++;a++;
			}
			if((cl=='b')&&(b<5)){
				System.out.println("Introduzca la nota del alumno "+b);
				c_B[b]=kb.nextInt();
				tot_B=tot_B+c_B[b];
				cont++;b++;
			}
		
		}
		if(tot_A>tot_B){
			System.out.println("La clase A ha sacado un mejor promedio: "+((double)tot_A/5));
		}else{
			System.out.println("La clase B ha sacado un mejor promedio: "+((double)tot_B/5));}
		
	}

}
