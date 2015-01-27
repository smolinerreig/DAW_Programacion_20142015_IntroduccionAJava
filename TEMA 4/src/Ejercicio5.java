import java.util.*;
import java.io.*;

public class Ejercicio5 {
	
	public static void main (String args[]){
		
		Scanner in=null;
		int num, numT=0, cont=0;
		
		try{
			
			in=new Scanner (new FileReader("num_enteros.txt"));
		
			do{
				
				num=in.nextInt();
				System.out.println(num);
				numT=numT+num;
				cont++;
				
			}while(in.hasNextInt());
		
		
		
		
		}catch(FileNotFoundException e){
			System.out.println("Error: "+e);
		}finally{
			if(in!=null){in.close();}
		}
		
		System.out.println("Se han registrado "+cont+" números, y su suma total es: "+numT);
		
	}

}
