import java.util.*;

public class EjercicioBucleAnidado4 {
	
	public static void main (String args []){
		
		Scanner kb=new Scanner (System.in);
		int i, j;
		System.out.println("---¿Valor de 'n'?---");
		int n=kb.nextInt();
		
		for (i=1;i<=n;i++){
			
			for (j=1;j<(i+1);j++){
				System.out.print(j);
			} System.out.println();
			
		}
				
	}

}
