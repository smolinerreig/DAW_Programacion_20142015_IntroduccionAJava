import java.util.*;

public class EjercicioBucleDoWhile {

	public static void main(String args[]){
		
		Scanner teclado=new Scanner(System.in);
		int x=0;
		
		do{
			System.out.println("---Ponme números, tio---");
			x=teclado.nextInt();
			
		}while((x<=10)||(x>=20));
		
		System.out.println("---Programa terminado---");
	}
	
}
