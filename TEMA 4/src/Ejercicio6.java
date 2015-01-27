import java.util.*;
import java.io.*;

public class Ejercicio6 {
	
	public static void main (String args[]){
		
		Scanner in=null;
		PrintWriter out=null;
		String nom;
		double prec;
		
		try{
			
			in= new Scanner (new FileReader("preciosSinIVA.txt"));
			out= new PrintWriter ("preciosConIVA.txt");
			do{
			
				nom=in.next();
				prec=in.nextInt();
				
				out.println(nom+" "+(prec+prec*(0.21)));
			
			}while(in.hasNext()==true);
			
			
			
		}catch(FileNotFoundException e){
			System.out.println("Error: "+e);
		}finally{
			if(in!=null){in.close(); out.close();}
		}
		
	}

}
