import java.util.*;

public class EjercicioExtra2 {
	
	public static void main(String args[]){
		
	Scanner teclado=new Scanner(System.in);
	int n=teclado.nextInt();
	System.out.println("---Introduzca su nota---");
	
	/*
	if((n<5)&&(n>0))
	{System.out.println("Suspendido");}		
	
	else {
		if((n>=5)&&(n<7)){System.out.println("Aprobado");}
		else if ((n>=7)&&(n<9)){System.out.println("Notable");}
		else if ((n>=9)&&(n<10)){System.out.println("Sobresaliente");}
		else if (n==10){System.out.println("Matrícula de Honor");}
		}
	
	
		if((n<5)&&(n>0))
		{System.out.println("Suspendido");}		
	
		if((n>=5)&&(n<7)){System.out.println("Aprobado");}
		else if ((n>=7)&&(n<9)){System.out.println("Notable");}
		else if ((n>=9)&&(n<10)){System.out.println("Sobresaliente");}
		else if (n==10){System.out.println("Matrícula de Honor");}
	*/
	
	switch (n){
	case 0:
	case 1:
	case 2:
	case 3:
	case 4:System.out.println("Suspendido");break;
	case 5:
	case 6:System.out.println("Aprobado");break;
	case 7:
	case 8:System.out.println("Notable");break;
	case 9:System.out.println("Sobresaliente");break;
	case 10:System.out.println("Matrícula de honor");break;
	
	}
	
		}
	
	}
