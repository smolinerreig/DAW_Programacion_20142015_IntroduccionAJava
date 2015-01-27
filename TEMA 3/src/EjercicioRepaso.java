import java.util.Scanner;

public class EjercicioRepaso {
	
	public static void main (String args[]){
		
		Scanner kb=new Scanner(System.in);
		double grupo[][]=new double[14][16];
		double asist=0;
		double asist_T[]=new double[14];
		int min[]=new int[14];
		double asist_M[]=new double[14];
		double max=0;
		int inab=0;
		
		
		for(int i=0;i<14;i++){
			System.out.println("Introduzca el número de alumnos en el grupo "+i);
			grupo[i][0]=kb.nextDouble();		
		}
		
		for(int i=0;i<14;i++){
			System.out.println("\n----------\nGRUPO "+i+"\n");
			if(asist_M[i]>max){max=i;}
			asist=0;
			asist_T[i]=0;
			for(int j=1;j<16;j++){
				System.out.println("¿Cuantos alumnos han asistido a la sesión "+j+" ?");
				grupo[i][j]=kb.nextDouble();
				asist_T[i]=asist_T[i]+grupo[i][j];
				asist_M[i]=asist_T[i]/15;
				
				if(grupo[i][j]<min[i]){
					min[i]=(int)grupo[i][j];
				}
				
				if(grupo[i][j]<(grupo[i][0])/2){asist++;}
				if(asist>=10){
					System.out.println("Grupo "+i+" desestimado por inasistencia.");
					asist_M[i]=0;
					inab++;
					break;
				}
		
			}	
		}
		
		if(inab<14){
		for(int i=0;i<14;i++){
			if(asist_M[i]!=0){
			System.out.println("\n----------\nAsistencia media del grupo "+i+" : "+asist_M[i]);
			System.out.println("La sesión del grupo "+i+" con menos asistencia fue la sesión "+(min[i]+1));
			}
		}
		System.out.println("El grupo con mayor asistencia media es el grupo "+(int)max);
		}else{System.out.println("Todos los grupos han sido desestinados por inasistencia");}
		
	}

}