import java.util.*;

public class Ejercicio6 {

	public static void main(String args[]){
		
		Scanner teclado=new Scanner(System.in);
		int edad_1;
		System.out.println("Introduzca la edad de la primera persona");
		edad_1=teclado.nextInt();
		int edad_2;
		System.out.println("Introduzca la edad de la segunda persona");
		edad_2=teclado.nextInt();
		int edad_3;
		System.out.println("Introduzca la edad de la tercera persona");
		edad_3=teclado.nextInt();
		int edad_4;
		System.out.println("Introduzca la edad de la cuarta persona");
		edad_4=teclado.nextInt();
		
		
		if (((edad_1)<=(edad_2))&&((edad_1)<=(edad_3))&&((edad_1)<=(edad_4))){System.out.println("La edad mínima es "+edad_1);}
		else if (((edad_2)<=(edad_1))&&((edad_2)<=(edad_3))&&((edad_1)<=(edad_4))){System.out.println("La edad mínima es "+edad_2);}
		else if (((edad_3)<=(edad_1))&&((edad_3)<=(edad_2))&&((edad_1)<=(edad_4))){System.out.println("La edad mínima es "+edad_3);}	
		else if (((edad_4)<=(edad_1))&&((edad_4)<=(edad_2))&&((edad_4)<=(edad_3))){System.out.println("La edad mínima es "+edad_4);}
	
	}
	
}
