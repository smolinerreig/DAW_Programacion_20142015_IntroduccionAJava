import java.util.*;

public class EjercicioBucleAnidado8 {
	
	public static void main (String args[]){
		
		Scanner kb=new Scanner (System.in);
		System.out.println("---Dame un número del 1 al 9, coleguilla---");
		int n=kb.nextInt();
		int i,j;
		
			for(i=1;i<=n;i++){
				for(j=1;j<=(n-i);j++){System.out.print(" ");}
				for(j=1;j<i;j++){System.out.print(j);}
				
				System.out.print(i);
				
				for (j=5;j<=n-i;j--){System.out.print(j--);}
				
				System.out.println();
		}
			
		
	}

}
