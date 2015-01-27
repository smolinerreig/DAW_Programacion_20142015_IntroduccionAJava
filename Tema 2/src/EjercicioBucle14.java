import java.util.Scanner;

public class EjercicioBucle14 {
	
	public static void main(String args[]){
		
		Scanner kb=new Scanner (System.in);
		int edad=0;
		int estat=0;
		int med_Ed=0;
		int med_Est=0;
		int cont_Est=0;
		int cont_Ed=0;
		
		
		for(int v=0;v<5;v++){
			System.out.println("---Introduzca su edad---");
			edad=kb.nextInt();
			System.out.println("---Introduzca su estatura en cm---");
			estat=kb.nextInt();
			
			if (estat>=175){cont_Est++;}
			if (edad>=18){cont_Ed++;}
			med_Ed=med_Ed+edad;
			med_Est=med_Est+estat;
			
			
		}
		System.out.println("La edad media es "+med_Ed/5);
		System.out.println("La estatura media es "+med_Est/5);
		System.out.println("Hay "+cont_Ed+" personas mayores de edad");
		System.out.println("Hay "+cont_Est+" personas mas altas que 175 cm");
	}

}
