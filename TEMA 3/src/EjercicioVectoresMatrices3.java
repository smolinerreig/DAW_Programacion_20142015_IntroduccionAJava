import java.util.*;

public class EjercicioVectoresMatrices3 {
	
	public static void main(String args[]){
		
		Scanner kb=new Scanner(System.in);
		int num[][]=new int[4][4];
		int aux[][]=new int[1][4];
		int i=0, j=0;
		
		for(int p=0;p<4;p++){
			System.out.println("---Fila "+p+"---");
			for(int q=0;q<4;q++){
				System.out.println("---Introduzca el número en posición "+q+"---");
				num[p][q]=kb.nextInt();
			}
		}
		
		System.out.println("---Que 2 filas desea intercambiar (0-3)?---");
		System.out.println("Intercambiar la fila... ");
		i=kb.nextInt();
		System.out.print("... por la fila...");
		j=kb.nextInt();
		
		aux[0]=num[i];
		num[i]=num[j];
		num[j]=aux[0];
		
		for(int p=0;p<4;p++){
			System.out.println("");
			for(int q=0;q<4;q++){
				System.out.print(""+num[p][q]);
				
			}
		}
		
	}

}
