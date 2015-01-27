import java.util.*;

public class Ejercicio9 {
	
	public static void main(String args[]){
		
		Scanner teclado=new Scanner(System.in);
		
		int unit=teclado.nextInt();
		//System.out.println("Introduzca unidades");
		int p=teclado.nextInt();
		//System.out.println("Introduzca precio por unidad");
		int p_total=unit*p;
		double of_3x2=(((unit/3)*2)*p)+((unit%3)*p);
		double of_30pc=p_total-(30*p_total)/(float)100;
		System.out.println(of_30pc);
		
		if(of_3x2>of_30pc)
			{System.out.println("La oferta óptima es 30%; El precio total es: "+of_30pc+" euros");}
		else
			{System.out.println("La oferta óptima es 3x2; El precio total es: "+of_3x2+" euros");}
		
					
	}

}
