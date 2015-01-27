import java.util.*;

public class Ejercicio10 {

	public static void main(String args[]){
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escriba la temperatura del agua en grados centígrados");
		float temp_C=teclado.nextFloat();
		
		if (temp_C<=0)
		{System.out.println("El agua está en estado sólido");}
		else if(temp_C>=100)
		{System.out.println("El agua está en estado gas");}
		else
		{System.out.println("El agua está en estado líquido");}
		
		
	}
	
}
