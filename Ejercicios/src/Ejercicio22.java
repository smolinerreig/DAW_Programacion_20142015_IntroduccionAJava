import java.util.*;

public class Ejercicio22 { //hay que emplear el operador '%'

	public static void main (String args[]){
		
		Scanner teclado=new Scanner(System.in);
		int hSalida;
		System.out.println("Introduzca la hora de salida:");
		hSalida=teclado.nextInt();
		int hLlegada;
		System.out.println("Introduzca la hora de llegada)");
		hLlegada=teclado.nextInt();
		int hSalidaMin=((hSalida/100)*60)+hSalida%100;
		//System.out.println(hSalidaMin);
		int hLlegadaMin=((hLlegada/100)*60)+hLlegada%100;
		//System.out.println(hLlegadaMin);
		int tTrayecto=(hLlegadaMin-hSalidaMin);
		//System.out.println(tTrayecto);
		int tTrayectoNuevo=85*(tTrayecto)/100;
		//System.out.println(tTrayectoNuevo);
		int hLlegadaNuevaMin=hSalidaMin+tTrayectoNuevo;
		//System.out.println(hLlegadaNuevaMin);
		int hLlegadaNueva=((hLlegadaNuevaMin/60)*100)+(hLlegadaNuevaMin%60);
		
		System.out.println(hLlegadaNueva);
		
				
	}
	
}
