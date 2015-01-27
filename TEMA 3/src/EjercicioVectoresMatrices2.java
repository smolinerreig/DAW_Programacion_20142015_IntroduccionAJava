import java.util.*;

public class EjercicioVectoresMatrices2 {
	
	public static void main(String args[]){
		
		Scanner kb=new Scanner(System.in);
		
		System.out.println("---�N�mero de filas?---");
		int fil=kb.nextInt(); 
		System.out.println("---�N�mero de columnas?---");
		int col=kb.nextInt();
		int num[][]=new int[fil][col];
		int sum_Neg=0, sum_Pos=0;
		
		for(int i=0;i<fil;i++){
			System.out.println("---Fila "+i+"---");
			for(int j=0;j<col;j++){
				System.out.println("---Inserte n�mero en posici�n "+j+"---");
				num[i][j]=kb.nextInt();
				
				if(num[i][j]<0){
					sum_Neg=sum_Neg+num[i][j];
				}else if(num[i][j]>=0){
					sum_Pos=sum_Pos+num[i][i];
				}
								
			}
			
		}
		
		System.out.println("La suma de los n�meros positivos es "+sum_Pos);
		System.out.println("La suma de los n�meros negativos es "+sum_Neg);
		
	}

}
