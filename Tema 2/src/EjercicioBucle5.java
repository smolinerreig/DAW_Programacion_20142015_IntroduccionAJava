import java.util.*;

public class EjercicioBucle5 {

	public static void main(String args[]){
		
		Scanner teclado=new Scanner(System.in);
		int x=1;
		int y=0;
		int z=1;
		
		while(x>0){
			
			if(x>0){
			System.out.println("---¿Edad?---");
			x=teclado.nextInt();
			y=(x+y);
			
			z++;
			
			
			}
			
		}
		System.out.println(y/z);
	}
	
}
