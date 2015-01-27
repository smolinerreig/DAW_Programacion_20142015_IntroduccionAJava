import java.util.*;

public class EjercicioArrays2 {
	
	public static void main (String args[]){
		
		Scanner kb=new Scanner(System.in);
		
		int vec[]=new int[4];
		int vek[]=new int[4];
		int vv[]=new int[4];
		
		for(int i=0;i<4;i++){
			
			System.out.println("Inserte el numero "+i+" del primer vector");
			vec[i]=kb.nextInt();
			
			System.out.println("Inserte el numero "+i+" del segundo vector");
			vek[i]=kb.nextInt();
			
			vv[i]=(vec[i])+(vek[i]);
		}
			System.out.print("El tercer vector es: ");
			for(int i=0;i<4;i++){System.out.print(vv[i]+" ");}
			
	}

}
