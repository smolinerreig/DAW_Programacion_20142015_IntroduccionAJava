import java.util.*;

public class EjercicioVectores2 {
	
	public static void main(String args[]){
		
		Scanner kb=new Scanner (System.in);
		int turno_D []=new int [4];
		int turno_N []=new int [4];
		int sueldo_D=0;
		int sueldo_N=0;
		int turno=0;
		int d=0, e=0, i=0;
		
		while (i<8){
			
		System.out.println("---Inserte el turno---\n(0)---->Mañana    Tarde---->(1)");	
		turno=kb.nextInt();
		
		if ((turno==0)&&(d<4)){
				
				System.out.println("Inserte el sueldo del trabajador "+d+" del turno de día");
				turno_D[d]=kb.nextInt();
				sueldo_D=sueldo_D+turno_D[d];
			d++;i++;
		}
		
		else if((turno==1)&&(e<4)){
						
				System.out.println("Inserte el sueldo del trabajador "+d+" del turno de noche");
				turno_N[e]=kb.nextInt();
				sueldo_N=sueldo_N+turno_N[e];
			e++;i++;
			
		}	
		}
		
		System.out.println("El gasto en sueldos en el turno de día es "+sueldo_D);
		System.out.println("El gasto en sueldos en el turno de noche es "+sueldo_N);
	}

}
