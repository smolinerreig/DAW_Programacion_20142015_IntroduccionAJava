import java.util.*;

public class Ejercicio16 {
	
	public static void main(String args[]){
		
		Scanner teclado=new Scanner(System.in);
		float R;
		
		System.out.println("Introduzca radio de esfera: ");
		R=teclado.nextFloat();
		double volumenEsfera=(4*Math.PI*Math.pow(R,3))/3;
		double superficieEsfera=(4*Math.PI*Math.pow(R,2));
		System.out.println("El volumen de la esfera es: "+volumenEsfera);
		System.out.println("La superficie de la esfera es: "+superficieEsfera);
				
	}

}
