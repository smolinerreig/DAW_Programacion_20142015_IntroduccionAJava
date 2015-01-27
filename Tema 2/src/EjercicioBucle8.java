import java.util.*;

public class EjercicioBucle8 {
	
	public static void main(String args[]){
		
		Scanner kb=new Scanner(System.in);
		char x='a';
			
					
		while((x>='a')&&(x<='z')){
			x=kb.next().charAt(0);
			char y=Character.toUpperCase(x);
			System.out.println(y);
						
		}
		
		System.out.println("---Programa terminado---");
		
	}	
		
}
		