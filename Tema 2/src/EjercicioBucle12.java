import java.util.*;

public class EjercicioBucle12 {

	public static void main(String args[]){
		
		Scanner kb=new Scanner(System.in);
		int x;
		int cont_Neg=0;
		System.out.println("---Introduzca 10 n�meros---");
		
		for(int v=0;v<10;v++){
			
			x=kb.nextInt();
			if(x<0){cont_Neg++;}
		}
		System.out.println("Se han introducido "+cont_Neg+" n�meros negativos");
		
	}
	
}
