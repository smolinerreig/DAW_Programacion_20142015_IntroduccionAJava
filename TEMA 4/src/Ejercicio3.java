import java.util.*;
import java.io.*;

public class Ejercicio3 {
	
	public static void main (String args[]){
		
		Scanner kb=new Scanner (System.in);
		PrintWriter out=null;
		PrintWriter out2=null;
		double num=0;
		
		try{
			out=new PrintWriter("ejercicio3a.txt");
			out2=new PrintWriter("ejercicio3b.txt");
			
			while(num!=(-1)){
				System.out.println("Escriba un número real");
				num=kb.nextDouble();
				
				out.print(num+" ");
				out2.println(num);
				
			}
			
		}catch(IOException e){
			System.out.println("Error leyendo el fichero: "+e);
		}finally{
			if(out!=null){out.close(); out2.close();}
		}
		
	}

}
