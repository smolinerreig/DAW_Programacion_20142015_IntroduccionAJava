import java.util.*;

public class Ejercicio7 {
	
	public static void main(String args[]){
		
		Scanner teclado=new Scanner(System.in);
		int patin_Ped_Pr=2;
		int patin_Mot_Pr=6;
		int tabla_Wind_Pr=4;
		int moto_Ac_Pr=7;
		double tiempo;
		System.out.println("Introduzca el tiempo deseado");
		tiempo=teclado.nextDouble();
		double pago_PatinP=patin_Ped_Pr*tiempo;
		double pago_PatinM=patin_Mot_Pr*tiempo;
		double pago_Wind=tabla_Wind_Pr*tiempo;
		double pago_Ac=moto_Ac_Pr*tiempo;
		int vehiculo;
				
		System.out.println("---Introduzca el vehículo---\n Patín a pedales (1)\n Patín a motor (2)\n Tabla de Windsurf (3)\n Moto acuática (4)");
		vehiculo=teclado.nextInt();
		
		if(vehiculo==1){System.out.println("El precio total es: "+(pago_PatinP));}
		else if(vehiculo==2){System.out.println("El precio total es: "+(pago_PatinM));}
		else if(vehiculo==3){System.out.println("El precio total es: "+(pago_Wind));}
		else if(vehiculo==4){System.out.println("El precio total es: "+(pago_Ac));}
		
		
	}

}
