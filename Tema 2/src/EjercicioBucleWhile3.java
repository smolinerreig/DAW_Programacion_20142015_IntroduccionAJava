import java.util.Scanner;

public class EjercicioBucleWhile3 {

	public static void main (String args[]){
		
		Scanner teclado=new Scanner(System.in);
		int x=1;
		int y=0;
		
		while (x>0){
			
			x=teclado.nextInt();
			if(x>0){y=y+x;}
			
			System.out.println(y);
		}
		
		System.out.println("---Programa terminado---");
	}
	
}