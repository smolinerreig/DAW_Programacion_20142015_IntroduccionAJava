import java.util.*; 

public class EjercicioBucleWhile {

	public static void main (String args []){
		
		Scanner keyboard=new Scanner (System.in);
		System.out.println("Insert numbers");
		int x=0;
		
		while (x<1000){
		System.out.println("?");
		int y=keyboard.nextInt();
			x=x+y;
						
		}
		System.out.println(x);
	}
	
}
