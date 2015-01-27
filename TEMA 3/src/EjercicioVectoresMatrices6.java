import java.util.*;

public class EjercicioVectoresMatrices6 {
	
	public static void main (String args[]){
		
		Scanner kb=new Scanner(System.in);
		int cuad[][]=new int[3][3];
		int MC=15, hammer=0;
		int num[]=new int[10];
		int error=0, igual=0;
		
		for(int i=0;i<10;i++){
			num[i]=0;
		}
		
		System.out.print("---Inserte sus números (únicamente del 1 al 9)---\n Recuerde que no puede haber números repetidos.\n\n\n");
		
		for(int i=0;i<3;i++){
			System.out.println("Fila "+i);
			for(int j=0;j<3;j++){
				while((cuad[i][j]<1||cuad[i][j]>9)||(igual!=0)){
					igual=0;
					System.out.println("Introduzca el número en posición "+j);
					cuad[i][j]=kb.nextInt();
					if(cuad[i][j]<1||cuad[i][j]>9){
						System.out.println("Vuelva a intentarlo con un número del 1 al 9.");
					}
					if(num[cuad[i][j]]==0){
						num[cuad[i][j]]=1;
					}else if(num[cuad[i][j]]==1){
						System.out.println("Número repetido. Introduzca uno correcto.");
						igual++;
					}
				}
			}
		}
		
		
		for(int i=0;i<3;i++){
			hammer=0;
			for(int j=0;j<3;j++){
				hammer=hammer+cuad[i][j];
			}if(hammer!=MC){
				error++;}
		}
		
		for(int i=0;i<3;i++){
			hammer=0;
			for(int j=0;j<3;j++){
				hammer=hammer+cuad[j][i];
			}if(hammer!=MC){
				error++;}
		}
		
		hammer=0;
	
		for(int i=0;i<3;i++){
			hammer=hammer+cuad[i][i];
		}if(hammer!=MC){
			error++;}
		
		
		hammer=0;
		
		for(int i=0;i<3;i++){
			hammer=hammer+cuad[i][2-i];
		}if(hammer!=MC){
			error++;}
		
		if(error==0){System.out.println("Felicidades. Ha creado usted un cuadrado mágico.");
		}else{System.out.println("Este no es un cuadrado mágico, ¡patán!");}
		
	}

}
