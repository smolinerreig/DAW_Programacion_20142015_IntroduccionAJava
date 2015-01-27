import java.io.*;
import java.util.*;

public class Ejercicio1 {
	
	public static void main (String args[]){
		
		Scanner in=null;
		
		try{
		
		in = new Scanner (new FileReader("ejercicio1.txt"));
		
		do{
			String plbr=in.next();
			
			System.out.println(plbr.toUpperCase());
			
		}while(in.hasNextLine());
		
		
		}catch(FileNotFoundException e){
			System.out.println("ERROR abriendo el fichero: "+e);
		}finally{
			if(in!=null)in.close();
			
		}
		
	}

}
