import java.util.*;
import java.io.*;

public class Ejercicio2 {
	
	public static void main (String args[]){
		
		Scanner in=null;
		
		try{
			
			in = new Scanner (new FileReader("ejercicio2.txt"));
			in.useDelimiter(",");
			
			do{
				String word=in.next();
				
				System.out.println(word.toLowerCase());
				
			}while(in.hasNextLine());
			
			
			}catch(FileNotFoundException e){
				System.out.println("ERROR abriendo el fichero: "+e);
			}finally{
				if(in!=null)in.close();
			}
		
	}

}
