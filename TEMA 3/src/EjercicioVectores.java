import java.util.*;

public class EjercicioVectores {

	public static void main(String[] args) {
		
		Scanner kb=new Scanner(System.in);
		
		double lluvia[]=new double [6];
		double total_LL=0;
		
		for (int d=0;d<6;d++){
			
			System.out.println("Ingrese la cantidad de lluvia del d�a "+d);
			lluvia[d]=kb.nextInt();
			total_LL=total_LL+lluvia[d];			
		}
		
		System.out.println("La media de lluvia por d�a es "+(total_LL/6));
		
		for (int d=0;d<6;d++){
			
			if ((lluvia[d])>=(2*total_LL/6)){
				System.out.println("El d�a "+d+" la lluvia fue igual o superior al doble de la media");}
			
		}

	}

}
