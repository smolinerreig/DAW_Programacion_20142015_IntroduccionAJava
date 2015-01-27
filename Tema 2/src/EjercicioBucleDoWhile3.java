import java.util.Scanner;

public class EjercicioBucleDoWhile3 {

	public static void main(String args[]){
		
		Scanner teclado = new Scanner(System.in);
		int x;
		
		do{
			
			System.out.printf("---FEED ME WITH A STRAY CAT---\n1. EXTRAER DINERO\n2. INGRESAR DINERO\n3. ÚLTIMOS MOVIMIENTOS\n4. SALIR");
			x=teclado.nextInt();
			
		}while(x!=4);
		System.out.println("---PROGRAMA TERMINADO---");
		
	}
	
}