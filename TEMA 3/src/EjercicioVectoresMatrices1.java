import java.util.*;

public class EjercicioVectoresMatrices1 {
	
	public static void main (String args []){
		
		Scanner kb=new Scanner(System.in);
		
		int num[][]=new int[2][4];
		int num_2[][]=new int[4][2];
		
		for(int i=0;i<2;i++){
			for(int j=0;j<4;j++){
				
				System.out.println("Inserte número en posición "+j+" de la fila "+i);
				num[i][j]=kb.nextInt();
				
			}
		}
		
		for(int j=0;j<4;j++){
			for(int i=0;i<2;i++){
			
				num_2[j][i]=num[i][j];
				System.out.print(" "+num_2[j][i]);	
				
			}System.out.println("");
		}
		
	}

}
