import java.util.*;

public class EjercicioVectoresMatrices5 {
	
	public static void main (String args[]){
		
		Scanner kb=new Scanner(System.in);
		StringBuffer inver=new StringBuffer();
		
		System.out.println("---Inserte una palabra para saber si es palíndroma.---");
		
		String palabra=kb.next();	
		int num_carac=palabra.length();
		char carac[]=palabra.toCharArray();
		char inv[]=new char[num_carac];
		String invertida="";
		
		
		for(int i=0;i<num_carac;i++){
			inv[(num_carac-1)-i]=carac[i];
		}
		
		for(int i=0;i<num_carac;i++){
			inver=inver.append(inv[i]);
		}
		
		 
		invertida=inver.toString();
		
		
		if((invertida.equalsIgnoreCase(palabra))){
			System.out.println("---La palabra indicada es palíndroma.---");
		}else{
			System.out.println("---La palabra indicada NO es palíndroma.---");
		}
		
	}

}
