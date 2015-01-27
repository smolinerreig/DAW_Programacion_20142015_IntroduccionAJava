import java.util.*;

public class EjercicioBucleAnidado5 {
	
	public static void main (String args []){
		
		Scanner kb=new Scanner(System.in);
		int i, j;
		int n=kb.nextInt();
		
		for(i=0;i<n;i++){
			
			for(j=1;j<=(n-i);j++){
				System.out.print(j);
			}System.out.println();
			
		}
		
	}

}
