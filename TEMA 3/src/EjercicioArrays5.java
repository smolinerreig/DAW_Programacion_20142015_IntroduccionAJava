import java.util.*;

public class EjercicioArrays5 {
	
	public static void main (String args[]){
		
		Scanner kb= new Scanner(System.in);
		
		int facultad[]=new int[50], sexo[]=new int[50], trabaja[]=new int[50], sueldo[]=new int[50];
		
		System.out.println("---¿Cuantos alumnos se van a introducir?---");
		int num_A=kb.nextInt();
		int cont_H=0, cont_T_H=0, cont_T_M=0, sueldo_T_H=0, sueldo_T_M=0, cont_M=0;
		
		for (int v=0;v<num_A;v++){
			System.out.println("Alumno número "+(v+1));
			System.out.println("---Introduzca código de facultad---");
			facultad[v]=kb.nextInt();
			System.out.println("---Introduzca sexo---\n (1)Masculino // (2)Femenino");
			sexo[v]=kb.nextInt();
			System.out.println("---introduzca situación laboral--- \n(1)Trabaja // (2)No Trabaja");
			trabaja[v]=kb.nextInt();
			System.out.println("---Introduzca su sueldo---");
			sueldo[v]=kb.nextInt();
			
			if(sexo[v]==1){
				cont_H++;
				
				if(trabaja[v]==1){
					cont_T_H++;
					sueldo_T_H=sueldo_T_H+sueldo[v];
				}
			} else {
				cont_M++;
				
				if(trabaja[v]==1){
					cont_T_M++;
					sueldo_T_M=sueldo_T_M+sueldo[v];
				}
				
			}
			
		}
		
		System.out.println(((double)cont_H*100)/num_A);
		System.out.println(((double)cont_M*100)/num_A);
		System.out.println(((double)cont_T_H*100)/cont_H);
		System.out.println((double)sueldo_T_H/cont_T_H);
		System.out.println(((double)cont_T_M*100)/cont_M);
		System.out.println((double)sueldo_T_M/cont_T_M);
		
	}

}
