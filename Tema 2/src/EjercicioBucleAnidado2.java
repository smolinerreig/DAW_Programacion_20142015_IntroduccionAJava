import java.util.*;

public class EjercicioBucleAnidado2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb=new Scanner(System.in);
		
		int i, j;
		int F=0, H=0, total_H=0, min=0, max=0;
		int edad=0, e_max=0, e_min=100, total_E=0;
		
		System.out.println("---¿Cuantas familias quiere introducir?---");
		F=kb.nextInt();
		
		for(i=0;i<F;i++){
			System.out.println("---¿Cuantos hijos tiene esta familia?---");
			H=kb.nextInt();
			
			total_H=total_H+H;//hijos totales
			if(i==0){min=H;max=H;}
			if(H>max){max=H;} //maximo de hijos
			if(H<min){min=H;} //mínimo de hijos
			
			
			for(j=0;j<H;j++){
				System.out.println("---Introduzca la edad del hijo nº "+(j+1)+"---");
				edad=kb.nextInt();
	
				total_E=total_E+edad;//edad total
				if(edad>e_max){e_max=edad;}
				if(edad<e_min){e_min=edad;}
				
			}
				
		}
			
		System.out.println("El número máximo de hijos es "+max);
		System.out.println("El número mínimo de hijos es "+min);
		System.out.println("El promedio de hijos por familia es "+((double)total_H/F));
		System.out.println("La edad máxima de los hijos es "+ e_max);
		System.out.println("La edad mínima de los hijos es "+ e_min);
		System.out.println("La edad promedio de los hijos es "+((double)total_E/total_H));
		
	}

}
