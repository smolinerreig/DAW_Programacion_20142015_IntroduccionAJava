import java.util.*;
import java.io.*;

public class Ejercicio4 {
	
	public static void main (String args[]){
		
		Scanner kb=new Scanner (System.in);
		PrintWriter out=null;
		String word[]= new String [5];
		int cont=0;
		String aux="";
		
		try{
			out=new PrintWriter ("ejercicio4.txt");
			
			while(cont<5){
				
				
				System.out.println("Escriba una palabra.");
				word[cont]=kb.next();
				cont++;				
			}
			
			for(int i=0;i<cont+1;i++){
				
				
				if((i<cont-1)&&(word[i].compareTo(word[i+1])>0)){
					aux=word[i+1];
					word[i+1]=word[i];
					word[i]=aux;
				}
				
			}
			
			for(int i=cont-1;i>0;i--){
				
				if((i>0)&&(word[i].compareTo(word[i-1])<0)){
					aux=word[i-1];
					word[i-1]=word[i];
					word[i]=aux;
				}
			}
			
			for(int i=0;i<cont;i++){
				
				out.println(i+"  "+word[i]);
				
			}
			
		}catch(IOException e){
			System.out.println("Error al escribir el fichero: "+e);
		}finally{
			if(out!=null){out.close();}
		}
		
		
	}

}
