import java.util.*;

public class Ejercicio4 {

	public static void main(String args[]){
		
		Scanner teclado=new Scanner(System.in);
		char x;
		//x=(char)teclado.nextInt();
		System.out.println("Introduzca un car�cter");
		x=teclado.next().charAt(0); //modo de introducir caracteres para poder operarlos como enteros
		
		if((x>=0)&&(x<=9)){System.out.println("El car�cter es num�rico");}
		else if((x>='a')&&(x<='z')){System.out.println("El car�cter es alfab�tico");}
		else if((x=='.')^(x==':')^(x==',')^(x==';')){System.out.println("El car�cter es un signo de puntuaci�n");}
		else{System.out.println("El car�cter es desconocido");}
		
	}
	
}
