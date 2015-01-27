import java.util.*;

public class EjercicioBucle3 {

	public static void main(String args[]){
		
		Scanner teclado=new Scanner(System.in);
		int x=0;
		int y=0;
		
		for(int v=0;v<15;v++){
			System.out.println("---Inserte un numero---");
			x=teclado.nextInt();
			y=x+y;
		}
		System.out.println(y);
	}
	
}
