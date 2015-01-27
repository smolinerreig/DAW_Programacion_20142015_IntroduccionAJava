import java.util.*;

public class EjercicioBucleAnidado6 {
	
	public static void main (String args[]){
		
		Scanner kb=new Scanner(System.in);
		
		int i, j;
		System.out.println("---Número entre 1 y 9, pls---");
		int n=kb.nextInt();
		
		for(i=1;i<=n;i++){
			
			for(j=1;j<=(n-i);j++){System.out.print(" ");}
			
			for(j=1;j<=i;j++){System.out.print(j);}
			
			System.out.println(" ");
			
		}
		
	}

}
