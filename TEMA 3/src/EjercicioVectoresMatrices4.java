import java.util.*;

public class EjercicioVectoresMatrices4 {
	
	public static void main (String args[]){
		
		Scanner kb=new Scanner(System.in);
		System.out.println("---Introduzca el número de alumnos---");
		int n=kb.nextInt();
		System.out.println("---Introduzca el número de asignaturas---");
		int m=kb.nextInt();
		
		float nota[][]=new float[n][m];
		float media_Al=0;
		float media_As=0;
		int cont_As=0;
		
		for(int i=0;i<n;i++){System.out.println("Alumno "+i);
			for(int j=0;j<m;j++){
				System.out.println("Introduzca nota del alumno "+i+" en la asignatura "+j);
				nota[i][j]=kb.nextFloat();
			}
		}
		
		for(int i=0;i<n;i++){
			media_Al=0;
			System.out.print("La media del alumno "+i+ " es");
			for(int j=0;j<m;j++){
				media_Al=media_Al+nota[i][j];
			}System.out.println(" "+(media_Al)/m);
		}
		System.out.println();
		
		for(int i=0;i<m;i++){
			media_As=0;
			System.out.print("La media de la asignatura "+cont_As+" es");			
			for(int j=0;j<n;j++){
				media_As=media_As+nota[j][i];
			}System.out.println(" "+(media_As)/n); cont_As++;
		}
		
	}

}
